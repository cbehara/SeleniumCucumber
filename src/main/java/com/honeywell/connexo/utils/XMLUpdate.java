package com.honeywell.connexo.utils;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.config.RunStatus;

public class XMLUpdate {
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This Method is used for Updating XML value using xpath
	 * @param xml_file_path
	 * @param sNodePath
	 * @param sNodeValue
	 */
	public static void updateXMLUsingXpath(String xml_file_path, String sNodePath, String sNodeValue) {
		try {
			File outputFile = new File(xml_file_path);
			if(!outputFile.exists()) {
				Base.addResult("Verify File Exists", "Verify File Exists", "File should be present at: "+xml_file_path, "File not present at: "+xml_file_path, RunStatus.FAIL);
			}
			else {
				DocumentBuilderFactory builderFactory =DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = null;
				builder = builderFactory.newDocumentBuilder();
				Document document =builder.parse(new FileInputStream(xml_file_path));
				
				//Replacing Existing value with new value based on xpath
				XPath xpath=XPathFactory.newInstance().newXPath();
				NodeList nodes= (NodeList) xpath.evaluate(sNodePath, document,XPathConstants.NODESET);
				nodes.item(0).setTextContent(sNodeValue);

				//write the update value to the output File
				writeDataToXMLFile(outputFile,document);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This Method is used for Writing XML value using xpath
	 * @param xml_file_path
	 * @param sNodePath
	 * @param sNodeValue
	 */
	public static void writeDataToXMLFile(File outputFile, Document document) throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source= new DOMSource(document);
		if(outputFile.exists())
			outputFile.delete();
		StreamResult result =new StreamResult(outputFile);
		transformer.transform(source, result);
		
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This Method is used for Updating extent config file
	 * @param xml_file_path
	 * @param sNodePath
	 * @param sNodeValue
	 */
	public static void XMLFileUpdate_ExtentConfig() {
		try {
			String sFilePath= PathHelper.getResourcePath("\\src\\main\\resources\\Config\\extent-config.xml");
			XMLUpdate.updateXMLUsingXpath(sFilePath, "//extentreports//reportName", Base.suiteName);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

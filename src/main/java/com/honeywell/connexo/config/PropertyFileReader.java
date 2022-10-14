package com.honeywell.connexo.config;

import java.util.Properties;


import org.testng.log4testng.Logger;

import com.honeywell.connexo.utils.PathHelper;

public class PropertyFileReader implements ConfigReader {
	
	private static Logger log = Logger.getLogger(PropertyFileReader.class);
	Properties prop = new Properties();
	
	//Constructor
	public PropertyFileReader() {
		try {
			prop.load(PathHelper.getInputStreamResourcePath("/src/main/resources/Config/config.properties"));
			}
		catch(Exception e) {
			log.info("The Config file is not found and error message is: "+e.getMessage());
		}
	}

	public String getBuildNumber() {
	  return prop.getProperty("BuildNumber");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @Description This Method is used to get the Extent report config xml file
	 * @return
	 */
	public String getReportConfigPath() {
		String reportConfigPath = PathHelper.getResourcePath("/src/main/resources/Config/extent-config.xml");
		if(reportConfigPath!=null) return reportConfigPath;
		else throw new RuntimeException("Extent Report Config path is not specified");
	}


	public boolean getHeadlessStatus() {
		if(prop.getProperty("headless").equals("true"))
			return true;
		else
			return false;
		
		
	}

}

package com.honeywell.connexo.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

import org.testng.log4testng.Logger;

import com.honeywell.connexo.base.Base;

public class Shared extends Base {
	
	private static Logger log= Logger.getLogger(Shared.class);
	
	public static List<String> splitAndConvertToListString(String sToConvert, String sDelimeter){
		List<String> values= new ArrayList<String>();
		try {
			StringTokenizer st =new StringTokenizer(sToConvert,sDelimeter);
			while(st.hasMoreTokens())
				values.add(st.nextToken());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return values;
	}
	
	
	public static ArrayList<File> getAllFiles(String logFilePath){
		ArrayList<File> lstfile= new ArrayList<File>();
		try {
			File fileDirectory = new File(logFilePath);
			File[] filelist = fileDirectory.listFiles();
			for(File file : filelist) 
				lstfile.add(new File(logFilePath+file.getName()));
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Size of Array List ------------"+lstfile.size());
		return lstfile;
		
	}
	
	public static String generateRandomName(int len) {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk" + "lmnopqrstuvwxyz";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
        sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
	}
	
	public static void uploadFileUsingRobot(String filePath) throws AWTException {
		  StringSelection s = new StringSelection(filePath);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	      Robot robot = new Robot();
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_V);
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      robot.keyRelease(KeyEvent.VK_V);
	      robot.keyPress(KeyEvent.VK_ENTER);
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      
	}
	

}

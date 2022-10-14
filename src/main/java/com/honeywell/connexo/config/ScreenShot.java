package com.honeywell.connexo.config;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

public class ScreenShot {
	
	private static Logger log =Logger.getLogger(ScreenShot.class);
	
	/***
	 * @author Dileep.Mothe@honeywell.com
	 * @description This method is used for taking the screenshot
	 * @param driver
	 * @param fileName
	 * @return
	 */
	
	public static String getScreenShot(WebDriver driver, String fileName) {
		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date=new Date();
			String date_time = dateFormat.format(date).replace(":","").replace(" ", "");
			File srcFile= null;
			srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			File file=new File("C:\\ScreenShot");
			if(!file.exists()) {
				file.mkdir();
			}
			
			File outputFile = new File("C:\\ScreenShot\\"+ fileName + "_"+date_time +".jpg");
			FileUtils.copyFile(srcFile, outputFile);
			return outputFile.getAbsolutePath();
			}
		catch(Exception e) {
			e.printStackTrace();
			log.info("Error has occured while taking teh screenshot and error message is : "+e.getMessage());
			
		}
		return null;
	}

}

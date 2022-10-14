package com.honeywell.connexo.utils;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.log4testng.Logger;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.config.RunStatus;
import com.honeywell.connexo.config.ScreenShot;
import com.honeywell.connexo.pageObjects.Page;


public class Util {
	
	public Page page = new Page();
	
	public static WebDriver driver;
	public static HashMap<String,String> globalHashMap = new HashMap<String,String>();
	private static Logger log = Logger.getLogger(Util.class);
	
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This Method is used for to verify the element is displayed or not
	 * @param element
	 * @param elementName
	 * @return
	 */
	public static boolean isExists(WebElement element, String elementName) {
		try {
		  if(element.isDisplayed()) {
			Base.addResult("Element Visible of:  "+elementName, "Element Visible for: "+elementName, "Element should be Visible", "Elemnet has visible" , RunStatus.PASS);
	 return true;
		}
		else {
			Base.addResult("Element Visible of:  "+elementName, "Element Visible for: "+elementName, "Element should be Visible", "Elemnet has not visible" , RunStatus.FAIL, ScreenShot.getScreenShot(driver, ""));
			return false;
		}
		}
		catch (Exception e) {
			Base.addResult("Element Visible of:  "+elementName, "Element Visible for: "+elementName, "Element should be Visible", "Elemnet has not visible" , RunStatus.FAIL, ScreenShot.getScreenShot(driver, ""));
			return false;
		}
		
			
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This Method is used for to verify the element is displayed or not
	 * @param element
	 * @param elementName
	 * @return
	 */
	public static boolean isExists(String element, String elementName) {
		try {
			  WebElement ele = driver.findElement(By.xpath(element));
			return  isExists(ele, elementName);
		  }
		catch (Exception e) {
			Base.addResult("Element Visible of:  "+elementName, "Element Visible for: "+elementName, "Element should be Visible", "Elemnet has not visible" , RunStatus.FAIL, ScreenShot.getScreenShot(driver, ""));
			return false;
		}
	
		
			
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This method is used for highlight the element 
	 * @param element
	 * @throws InterruptedException
	 */
	public static void highlightelement(WebElement element) throws InterruptedException 
	{
		JavascriptExecutor jsExecute = (JavascriptExecutor)Base.getDriver();	

		jsExecute.executeScript("arguments[0].style.border='2px solid red'", element);
		Waits.wait(500);
		jsExecute.executeScript("arguments[0].style.border=''",element, "");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com 
	 * This method is used for clicking a webElement
	 * @param element
	 * @param nameofClickObject
	 */
	public static void clickObject(WebElement element,String nameofClickObject) {
		try {
			Waits.waitUntilElementVisible(element, 5);
			if(isExists(element,nameofClickObject)) {
				highlightelement(element);
			    element.click();
			    Base.addResult("Click Button: "+nameofClickObject, "Click Button: "+nameofClickObject, "Button should be clicked", "Button has successfully clicked" , RunStatus.PASS);
		}
		}
		catch(Exception e) {
			Base.addResult("Click Button for: "+nameofClickObject, "Click Button: "+nameofClickObject, "Button should be clicked", "There is some error while clicking on button And error message is: "+e.getMessage() , RunStatus.FAIL,ScreenShot.getScreenShot(driver, ""));
			
		}
	}
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This method is used for clicking on element with parameter as String 
	 * @param element
	 * @param nameofClickObject
	 */
	public static void clickObject(String element,String nameofClickObject) {
		try {
			   WebElement ele = driver.findElement(By.xpath(element));
			   clickObject(ele,nameofClickObject);
		}
		
		catch(Exception e) {
			Base.addResult("Click Button for: "+nameofClickObject, "Click Button: "+nameofClickObject, "Button should be clicked", "There is some error while clicking on button And error message is: "+e.getMessage() , RunStatus.FAIL,ScreenShot.getScreenShot(driver, ""));
			
		}
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This Method is used for Sending text into a textbox
	 * @param element
	 * @param text
	 * @param elementName
	 */
	public static void sendText(WebElement element, String text, String elementName) {
		try {
			Waits.waitUntilElementVisible(element, 5);
			if(isExists(element, elementName)) {
				highlightelement(element);
				element.sendKeys(text);
				Base.addResult("Text Box filling for: "+elementName, "Text Box filling for: "+elementName, "Textbox should be filled with data as :"+text, "Textbox has filled with data as :"+text , RunStatus.PASS);
				
			}
			
		}
		catch(Exception e) {
			Base.addResult("Text Box filling for: "+elementName, "Text Box filling for: "+elementName, "Textbox  will be filled with data as :"+text, "There is some error while trying text to textbox And error message is: "+e.getMessage() , RunStatus.FAIL,ScreenShot.getScreenShot(driver, ""));
			
		}
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This Method is used for Sending text into a textbox after clearing
	 * @param element
	 * @param text
	 * @param elementName
	 */
	public static void sendTextWithClear(WebElement element, String text, String elementName) {
		try {
			Waits.waitUntilElementVisible(element, 5);
			if(isExists(element, elementName)) {
				highlightelement(element);
				element.clear();
				element.sendKeys(text);
				Base.addResult("Text Box filling for: "+elementName, "Text Box filling for: "+elementName, "Textbox should be filled with data as :"+text, "Textbox has filled with data as :"+text , RunStatus.PASS);
				
			}
			
		}
		catch(Exception e) {
			Base.addResult("Text Box filling for: "+elementName, "Text Box filling for: "+elementName, "Textbox  will be filled with data as :"+text, "There is some error while trying text to textbox And error message is: "+e.getMessage() , RunStatus.FAIL,ScreenShot.getScreenShot(driver, ""));
			
		}
	}
	
	
	/***
	 * Need to Write some more methods
	 */
	
	
	
}

package com.honeywell.connexo.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.honeywell.connexo.base.Base;

public class Waits {
	/***
	 * @author Dileep.Mothe@honeywell.com
	 * This method is used for wait for specified time 
	 * @param milliSec
	 * @throws InterruptedException
	 */
	public static void wait(int milliSec) throws InterruptedException {
		Thread.sleep(milliSec);
	}
	
	/***
	 * @author Dileep.Mothe@honeywell.com
	 * This method is used for wait for specified element to be visible with in specified time 
	 * @param milliSec
	 * @throws InterruptedException
	 */
	public static void waitUntilElementVisible(WebElement ele, int time) {
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(Base.getDriver(),time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

}

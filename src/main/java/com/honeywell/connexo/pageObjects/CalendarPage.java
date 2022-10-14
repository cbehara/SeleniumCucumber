package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends BasePage {
	
	@FindBy(xpath="//a[contains(@href,'#/administration/calendars')]//span[contains(@class,'x-menu-item-text x-menu-item-indent-no-separator')]")
	public WebElement calenderLinkInAdmin;
	
	@FindBy(xpath="//span[text()='Activate']//ancestor::a")
	public WebElement activateButton;
	
	@FindBy(xpath="//span[text()='Deactivate']//ancestor::a")
	public WebElement deActivateButton;
	
	
	
	
	
	public final String Calendar_Action_Button ="//*[text()='%s']//ancestor::td//following-sibling::td//span";
	public final String Calender_Status = "//*[text()='%s']//ancestor::td//following-sibling::td[3]/div[contains(text(),'%s')]";

}

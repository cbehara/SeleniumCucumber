package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevicePage extends BasePage{
	
	@FindBy(xpath="//a[@title='Devices']")
	public WebElement DevicesHomePage;
	
	@FindBy(xpath="//span[text()='Add device']")
	public WebElement addDevicelink;
	
	@FindBy(xpath="//label[text()='Name']/following::input")
	public WebElement deviceNameTxtbox;
	
	@FindBy(xpath="//div[@class='x-hide-display x-form-data-hidden']/following-sibling::input[@name='deviceType']")
	public WebElement deviceTypeDropdown;
	
	@FindBy(xpath="//div[@class='x-hide-display x-form-data-hidden']/following-sibling::input[@name='deviceConfiguration']")
	public WebElement deviceConfigDropdown;
	
	@FindBy(xpath="//span[text()='Add']/following-sibling::span")
	public WebElement deviceAddBtn;
	
	
	

}

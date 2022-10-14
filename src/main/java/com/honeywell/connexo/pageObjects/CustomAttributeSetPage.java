package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomAttributeSetPage extends BasePage{
	
	@FindBy(xpath="//span[text()='Custom attribute sets']")
	public WebElement customAttributeSetLinkInAdmin;
	
	@FindBy(xpath="//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first']")
	public WebElement customAttributeTypeDropdownIcon;
	
	@FindBy(xpath="//li[contains(text(),'Register')]")
	public WebElement customAttributeTypeValueAsRegister;
	
	@FindBy(xpath="//a[@class='x-btn x-unselectable x-box-item x-btn-action-small x-noicon x-btn-noicon x-btn-action-small-noicon']//span[contains(text(),'Apply')]/..")
	public WebElement applyButton;
	
	@FindBy(xpath="//div[@class='x-grid-view x-fit-item x-grid-view-default']/table/tbody/tr/td[2]/div[contains(text(),'Register')]")
	public WebElement verifyFilterDataContainsRegisterType;

}

package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataPurgePage extends BasePage{
	
	@FindBy(xpath="//span[@class='x-menu-item-text x-menu-item-indent-no-separator'][normalize-space()='Data purge settings']")
	public WebElement dataPurgeSettingLinkInAdmin;
	
	@FindBy(xpath="//span[contains(text(),'Data purge history')]")
	public WebElement dataPurgeHistoryLabel;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]")
	public WebElement purgeDataOlderThanSection;
	
	@FindBy(xpath="//input[@name='retainedPartitionCount']")
	public WebElement purgeDataOlderThanTextBox;
	
	@FindBy(xpath="//body//div//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div//a[1]//span[1]//span[1]//span[2]")
	public WebElement saveButton;
	
	@FindBy(xpath="//a[contains(@href,'#/administration/datapurgehistory')]//span[contains(@unselectable,'on')]")
	public WebElement dataPurgeHistoryLinkInAdmin;
	
	@FindBy(xpath="//label[contains(text(),'Data purge settings saved')]")
	public WebElement dataPurgeSettingSavedLabel;
	
	@FindBy(xpath="//label[contains(text(),'Nothing to save')]")
	public WebElement dataPurgeSettingNothingToSaveLabel;
	

}

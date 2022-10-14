package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RelativePeriodsPage extends BasePage{
	
	@FindBy(xpath="//span[@class='x-menu-item-text x-menu-item-indent-no-separator'][normalize-space()='Relative periods']")
	public WebElement relativePeriodsLinkInAdmin;
	
	@FindBy(xpath="(//span[@class='x-btn-icon-el  '])[4]")
	public WebElement addRelativePeriodButton;
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement relativePeriodNameTxtBox;
	
	@FindBy(xpath="//*[@class='x-field x-table-plain x-form-item x-form-type-text x-field-default x-anchor-form-item'] //*[@class=' x-trigger-cell x-unselectable'] //div")
	public WebElement categoryDropDownIcon;
	
	@FindBy(xpath="//*[normalize-space()='Data export'] //img")
	public WebElement categoryDropDownValueAsDataExport;
	
	@FindBy(xpath="//*[normalize-space()='Add']/following-sibling::span")
	public WebElement addButton;
	
	@FindBy(xpath="//a[@class='x-menu-item-link '][normalize-space()='Edit']")
	public WebElement editButton;
	
	@FindBy(xpath="//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/table[3]/tbody[1]/tr[1]/td[2]/div[1]/span[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/input[1]")
	public WebElement dateRadioButton;
	
	@FindBy(xpath="//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/table[3]/tbody[1]/tr[1]/td[2]/div[1]/span[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	public WebElement daytextBox;
	
	@FindBy(xpath="//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/table[3]/tbody[1]/tr[1]/td[2]/div[1]/span[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/div[1]/table[3]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]")
	public WebElement frequencyDorpdownIcon;
	
	@FindBy(xpath="//li[normalize-space()='day(s)']")
	public WebElement frequencyValueAsDays;
	
	@FindBy(xpath="//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/table[3]/tbody[1]/tr[1]/td[2]/div[1]/span[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/div[1]/table[4]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]")
	public WebElement durationDropDownIcon;
	
	@FindBy(xpath="//li[normalize-space()='ago']")
	public WebElement durationValueAsAgo;
	
	@FindBy(xpath="//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/table[4]/tbody[1]/tr[1]/td[2]/div[1]/span[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/input[1]")
	public WebElement endrelativePeriodRadioBtn;
	
	@FindBy(xpath="//tbody/tr[@role='presentation']/td[@role='presentation']/div[@role='presentation']/div[@role='presentation']/div[@role='presentation']/a[1]/span[1]/span[1]/span[2]")
    public WebElement saveButton;
	
	@FindBy(xpath="//a[@class='x-menu-item-link '][normalize-space()='Remove']")
	public WebElement removeButton;
	
	@FindBy(xpath="//div[@class='x-window uni-confirmation-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span/././span[contains(text(),'Remove')]/..")
	public WebElement Remove_RelativePeriod_Confirmation;
	
	@FindBy(xpath="//label[contains(text(),'Relative period added')]")
	public WebElement relativePeriodAddedLabel;
	
	@FindBy(xpath="//label[contains(text(),'Relative period saved')]")
	public WebElement relativePeriodSavedLabel;
	
	@FindBy(xpath="//label[contains(text(),'Relative period removed')]")
	public WebElement relativePeriodRemovedLabel;
	
	
	
	public final String RelativePeriod_Action_Button ="//*[text()='%s']//ancestor::td//following-sibling::td//span";
	
	
	

}

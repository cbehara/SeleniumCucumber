package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReadingTypesPage extends BasePage{
	
	@FindBy(xpath="//span[text()='Reading types']//parent::a")
	public WebElement readingTypesLinkInAdmin;
	
	@FindBy(xpath="(//span[contains(text(),'Add reading type')]//ancestor::a)[2]")
	public WebElement addReadingTypesBtn;
	
	@FindBy(xpath="//label[normalize-space()='Reading type set']//parent::td//following-sibling::td//input")
	public WebElement readingTypeSetNameTxtBox;
	
	@FindBy(xpath="//span[text()='Extended']//ancestor::a")
	public WebElement extendedTab;
	
	@FindBy(xpath="(//label[normalize-space()='Period #1']//parent::td//following-sibling::td//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[2]")
    public WebElement period1DropdownIcon;
	
	@FindBy(xpath="(//label[text()='Period #1']//parent::td)[2]")
	public WebElement period1Label;
	
	@FindBy(xpath="(//label[normalize-space()='Commodity #6']//parent::td//following-sibling::td//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[2]")
	public WebElement commodityDropdownIcon;
	
	@FindBy(xpath="(//label[text()='Commodity #6']//parent::td)[2]")
	public WebElement commodity6Label;
	
	@FindBy(xpath="(//label[normalize-space()='Phases #15']//parent::td//following-sibling::td//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[2]")
	public WebElement phasesDropDownIcon;
	
	@FindBy(xpath="(//label[text()='Phases #15']//parent::td)[2]")
	public WebElement phasesLabel;
	
	@FindBy(xpath="//span[text()='Add']//ancestor::a")
	public WebElement addBtn;
	
	@FindBy(xpath="//div[@class='x-window uni-confirmation-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span/././span[contains(text(),'Add')]/..")
	public WebElement Add_ReadingType_Confirmation;
	
	
	
	public final String period1_value ="//*[text()='%s']";
	public final String commodity_value ="//*[text()='%s']";
	public final String phases_value= "//*[text()='%s']";
	
}

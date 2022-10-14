package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProcessesPage extends BasePage{
	
    
	@FindBy(xpath="//span[contains(text(),'Processes')]//parent::a")
	public WebElement processesLinkInAdmin;
	
	@FindBy(xpath="//span[text()='Activate']//ancestor::a")
	public WebElement activateButton;
	
	@FindBy(xpath="//span[text()='Deactivate']//ancestor::a")
	public WebElement deActivateButton;
	
	@FindBy(xpath="//label[contains(text(),'Start on')]//following::td//input[@class='x-form-field x-form-text x-trigger-noedit']")
	public WebElement startOnDropdown;
	
	@FindBy(xpath="//div[@class='x-boundlist-list-ct x-unselectable']//li[contains(text(),'Device')]")
	public WebElement deviceValueFromstartOnDropdown;
	
	@FindBy(xpath="//*[text()='In stock']//parent::td//preceding-sibling::td//parent::tr[@class='x-grid-row x-grid-row-alt x-grid-data-row x-grid-row-before-selected x-grid-row-selected x-grid-row-focused']/td[1]")
	public WebElement inStockDeviceStateChecked;
	
	@FindBy(xpath="//*[text()='In stock']//parent::td//preceding-sibling::td//parent::tr[@class='x-grid-row x-grid-row-alt x-grid-data-row x-grid-row-before-selected']/td[1]")
    public WebElement inStockDeviceStateUnChecked;
	
	@FindBy(xpath="(//div[@class='x-grid-view x-fit-item x-grid-view-default']/table/tbody/tr/td/div[contains(text(),'In stock')]/../../td)[1]")
	public WebElement inStockcheckbox;
	
	@FindBy(xpath="//*[text()='Execute level 1']//parent::td//preceding-sibling::td//parent::tr[@class='x-grid-row x-grid-data-row x-grid-row-before-selected x-grid-row-before-focused']//td[1]")
	public WebElement PrivillageExecuteLevel1UnChecked;
	
	@FindBy(xpath="//*[text()='Execute level 1']//parent::td//preceding-sibling::td//parent::tr[@class='x-grid-row x-grid-data-row x-grid-row-before-selected x-grid-row-selected x-grid-row-focused']//td[1]")
	public WebElement PrivillageExecuteLevel1Checked;
	
	@FindBy(xpath="//div[@class='x-grid-view x-fit-item x-grid-view-default']/table/tbody/tr/td/div[contains(text(),'Execute level 1')]/../../td[1]")
	public WebElement PrivillageExecuteLevel1Checkbox;
	
	@FindBy(xpath="//span[normalize-space()='Save']//ancestor::a")
	public WebElement SaveBtn;
	
	@FindBy(xpath="//span[text()='Edit process']//ancestor::a")
	public WebElement editProcess;
	
	@FindBy(xpath="(//*[contains(text(),'Uncheck all')]/..)[1]")
	public WebElement unCheckAllBtnForDeviceState;
	
	@FindBy(xpath="(//*[contains(text(),'Uncheck all')]/..)[2]")
	public WebElement unCheckAllBtnFoPrivillages;
	
	
	
	public final String Processes_Action_Button ="//*[text()='%s']//ancestor::td//following-sibling::td//span";
	public final String Processes_Status = "//div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr/td/div[contains(text(),'%s')]/../../td[4]/div[contains(text(),'%s')]";

	
	
	
	
	
	
	
}

package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebServicesEndPointPage extends BasePage{
	
	@FindBy(xpath="//span[contains(text(),'Web service endpoints')]//parent::a")
	public WebElement webServiceEndPointLinkInAdmin;
	
	@FindBy(xpath="(//span[contains(text(),'Add web service endpoint')]//ancestor::a)[1]")
	public WebElement addWebServiceEndPointButton;
	
	@FindBy(xpath="//label[normalize-space()='Name']//parent::td//following-sibling::td//input")
	public WebElement webServiceEndPointNameTxtbox;
	
	@FindBy(xpath="//label[text()='Web service']//parent::td//following-sibling::td//td//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first']")
	public WebElement webServicesDrodpdownIcon;
	
	@FindBy(xpath="//label[text()='Url Path']//parent::td//following-sibling::td//input")
	public WebElement urlPathTextbox;
	
	@FindBy(xpath="//label[text()='Log level']//parent::td//following-sibling::td//td//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first']")
	public WebElement logLevelDropdownIcon;
	
	@FindBy(xpath="//label[text()='Authentication']//parent::td//following-sibling::td//td//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first']")
	public WebElement authenticationDropdownIcon;
	
	@FindBy(xpath="//span[text()='Add']//ancestor::a")
    public WebElement addButton;
	
	@FindBy(xpath="//span[normalize-space()='Activate']//ancestor::a")
	public WebElement activateButton;
	
	@FindBy(xpath="//span[normalize-space()='Edit']//ancestor::a")
	public WebElement editButton;
	
	@FindBy(xpath="//span[normalize-space()='Save']//ancestor::a")
	public WebElement saveButton;
	
	@FindBy(xpath="//span[normalize-space()='Remove']//ancestor::a")
	public WebElement removeButton;
	
	@FindBy(xpath="//label[contains(text(),'Web service endpoint added')]")
	public WebElement webServiceAddedLabel;
	
	@FindBy(xpath="//label[contains(text(),'Web service endpoint activated')]")
	public WebElement webServiceActivatedLabel;
	
	@FindBy(xpath="//label[contains(text(),'Web service endpoint saved')]")
	public WebElement webServiceSavedLabel;
	
	@FindBy(xpath="//label[contains(text(),'Web service endpoint removed')]")
	public WebElement webServiceRemovedLabel;
	

	
	
	
	
	
	
	public final String webServicesDropdownValue ="//li[contains(text(),'%s')]";
	public final String logLevelDropdownValue = "//li[contains(text(),'%s')]";
	public final String authenticationDropdownValue = "//li[contains(text(),'%s')]";
	public final String webServiceEndPoint_Action_Button ="//*[text()='%s']//ancestor::td//following-sibling::td//span";
	public final String Remove_WebServiceEndpoint_Confirmation = "//*[contains(text(),'%s')]//ancestor::div//a[normalize-space()='Remove']";
	

}

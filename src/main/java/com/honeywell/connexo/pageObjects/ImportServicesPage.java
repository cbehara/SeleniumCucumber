package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImportServicesPage extends BasePage {
	
	@FindBy(xpath="//span[contains(text(),'Import services')]//parent::a")
	public WebElement importServicesLinkInAdmin;
	
	@FindBy(xpath="(//span[contains(text(),'Add import service')]//ancestor::a)[2]")
	public WebElement addImportServicesButton;
	
	@FindBy(xpath="//label[normalize-space()='Name']//parent::td//following-sibling::td//input")
	public WebElement ImportServiceNameTxtBox;
	
	@FindBy(xpath="//label[contains(text(),'File importer')]//parent::td//following-sibling::td//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first']")
	public WebElement fileImporterDropdownIcon;
	
	@FindBy(xpath="//label[normalize-space()='Import folder']//parent::td//following-sibling::td//input")
	public WebElement importFolderTxtBox;
	
	@FindBy(xpath="//label[normalize-space()='File pattern']//parent::td//following-sibling::td//input")
	public WebElement filePatternTxtBox;
	
	@FindBy(xpath="//label[normalize-space()='In progress folder']//parent::td//following-sibling::td//input")
	public WebElement inProgressFolderTxtBox;
	
	@FindBy(xpath="//label[normalize-space()='Success folder']//parent::td//following-sibling::td//input")
	public WebElement successFolderTxtBox;
	
	@FindBy(xpath="//label[normalize-space()='Failure folder']//parent::td//following-sibling::td//input")
	public WebElement failureFolderTxtBox;
	
	@FindBy(xpath="//span[text()='Add']//ancestor::a")
	public WebElement addButton;
	
	@FindBy(xpath="//div[@class='x-component x-box-item x-component-default x-menu-item']/a/span[contains(text(),'Activate')]")
	public WebElement activateButton;
	
	@FindBy(xpath="//span[normalize-space()='Edit']//ancestor::a")
	public WebElement editButton;
	
	@FindBy(xpath="//div[@class='x-component x-box-item x-component-default x-menu-item']/a/span[contains(text(),'Deactivate')]")
	public WebElement deActivateButton;
	
	@FindBy(xpath="//div[@class='x-component x-box-item x-component-default x-menu-item']/a/span[contains(text(),'Remove')]")
	public WebElement removeButton;
	
	@FindBy(xpath="//a/span[normalize-space()='Save']")
	public WebElement saveButton;
	
	
	@FindBy(xpath="//label[contains(text(),'Import service added')]")
	public WebElement importServicesAddedLabel;
	
	@FindBy(xpath="//label[contains(text(),'Import service activated')]")
	public WebElement importServicesActivatedLabel;
	
	@FindBy(xpath="//label[contains(text(),'Import service removed')]")
	public WebElement importServicesRemovedLabel;
	
	@FindBy(xpath="//label[contains(text(),'Import service deactivated')]")
	public WebElement importServicesDeactivatedLabel;
	
	@FindBy(xpath="//label[contains(text(),'Import service saved')]")
	public WebElement importServicesSavedLabel;
	
	@FindBy(xpath="//div[@class='x-window uni-confirmation-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span/././span[contains(text(),'Remove')]/..")
	public WebElement Remove_ImportServices_Confirmation;
	
	@FindBy(xpath="//div[@class='x-window uni-confirmation-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span/././span[contains(text(),'Activate')]/..")
	public WebElement Activate_ImportServices_Confirmation;
	
	@FindBy(xpath="//div[@class='x-window uni-confirmation-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a//span/././span[contains(text(),'Deactivate')]/..")
	public WebElement DeActivate_ImportServices_Confirmation;
	
	// Start of Import History Page Objects
	@FindBy(xpath="//span[text()='Import history']//parent::a")
	public WebElement importHistoryLinkInAdmin;
	
	@FindBy(xpath="//span[contains(text(),'Import history')]")
	public WebElement importHistoryLabel;
	// End of Import History Page Objects
	
	
	public final String fileImporterValue = "//li[contains(text(),'%s')]";
	public final String ImportServices_Action_Button = "//*[text()='%s']//ancestor::td//following-sibling::td//span";
	
	//Start of Upload File Importer
	
	@FindBy(xpath="//span[contains(text(),'Upload file for import')]//parent::a")
	public WebElement uploadFileForImporterLinkInAdmin;
	
	@FindBy(xpath="//label[contains(text(),'Import service')]//parent::td//following-sibling::td//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first']")
	public WebElement importServiceDropdownIcon;
	
	@FindBy(xpath="//div[@class='x-btn x-form-file-btn x-unselectable x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon']/span/..")
	public WebElement selectFilesButton;
	
	@FindBy(xpath="//span[text()='Upload']//ancestor::a")
    public WebElement uploadButton;
	
	@FindBy(xpath="//div[contains(text(),'The uploaded file will be imported by the system according to the frequency of the folder scan as set by your system administrator')]")
	public WebElement uploadFileMessage;
	
	public final String importServiceDropdownValue = "//li[text()='%s']";
	
	
	
}

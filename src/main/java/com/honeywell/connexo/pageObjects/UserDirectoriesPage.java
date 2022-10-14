package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDirectoriesPage extends BasePage {
	
	@FindBy(xpath="//span[text()='User directories']")
	public WebElement userDirectoriesLinkInAdmin;
	
	@FindBy(xpath="//*[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon'] //*[normalize-space()='Add user directory'] //span[@class='x-btn-button']")
	public WebElement addUserDirectoryButton;
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement nameTextBox;
	
	@FindBy(xpath="//input[@name='url']")
	public WebElement urlTextBox;
	
	@FindBy(xpath="//input[@name='backupUrl']")
	public WebElement backUpUrlTextBox;
	
	@FindBy(xpath="//input[@placeholder='Select a security protocol...']")
	public WebElement securityProtocolDropdown;
	
	@FindBy(xpath="//input[@name='directoryUser']")
	public WebElement userTextBox;
	
    @FindBy(xpath="//input[@type='password']")
    public WebElement passwordTextBox;
    
    @FindBy(xpath="//input[@name='baseUser']")
    public WebElement baseUserDNTextBox;
    
    @FindBy(xpath="//input[@name='baseGroup']")
    public WebElement baseGroupDNTextBox;
    
    @FindBy(xpath="(//span[@class='x-btn-icon-el  '])[4]")
    public WebElement addButton;
    
    @FindBy(xpath="(//span[@class='x-btn-icon-el  '])[4]")
    public WebElement saveButton;
    
    @FindBy(xpath="//span[text()='Edit']//ancestor::a")
    public WebElement editButton;
    
    @FindBy(xpath="//span[text()='Remove']//ancestor::a")
    public WebElement removeButton;
    
    @FindBy(xpath="//label[text()='User directory added']")
    public WebElement userDirctoryAddedLabel;
	
    @FindBy(xpath="//label[text()='User directory saved']")
    public WebElement userDirctorySavedLabel;
    
    @FindBy(xpath="//label[text()='User directory removed']")
    public WebElement userDirctoryRemovedLabel;
	
	

	public final String securityProtocolDropdownValue = "//li[contains(text(),'%s')]";
	public final String userDirectory_Actions_Button ="//*[text()='%s']//ancestor::td//following-sibling::td//span";
	public final String Remove_userDirectory_Confirmation ="//span[contains(text(),'%s')]//ancestor::div//a[normalize-space()='Remove']";
	

}

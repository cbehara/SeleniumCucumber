package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RolesPage  extends BasePage{
	
	@FindBy(xpath="//span[text()='Roles']")
	public WebElement RolesLinkInAdmin;
	
	@FindBy(xpath="//*[normalize-space()='Add role']//span[@class='x-btn-button']")
	public WebElement AddRolesBtn;
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement RoleNameTxtBox;
	
	@FindBy(xpath="//input[@name='description']")
	public WebElement RoleDescriptionTxtBox;
	
	@FindBy(xpath="//span[text()='Full control']")
	public WebElement fullControlBtn;
	
	@FindBy(xpath="(//span[@class='x-btn-icon-el  '])[5]")
	public WebElement AddRoleBtn;
	
	@FindBy(xpath="//span[text()='Edit']//ancestor::a")
	public WebElement EditRoleBtn;
	
	@FindBy(xpath="//span[text()='Save']/following-sibling::span")
	public WebElement saveBtn;
	
	@FindBy(xpath="//span[text()='Remove']//ancestor::a")
	public WebElement removeBtn;
	
	@FindBy(xpath="//label[text()='Role added']")
	public WebElement roleAddedLabel;
	
	@FindBy(xpath="//label[text()='Role saved']")
	public WebElement roleSavedLabel;
	
	@FindBy(xpath="//label[text()='Role removed']")
	public WebElement roleRemovedLabel;
	
	
	
	
	public final String Roles_Action_Button ="//*[text()='%s']//ancestor::td//following-sibling::td//span";
	public final String Remove_Roles_Confirmation = "//span[contains(text(),'%s')]//ancestor::div//a[normalize-space()='Remove']";
	
	

}

package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkGroupsPage extends BasePage{
	
	@FindBy(xpath="//span[text()='Workgroups']")
	public WebElement workGroupsLinkInAdmin;
	
	@FindBy(xpath="(//span[@class='x-btn-icon-el  '])[4]")
	public WebElement addWorkGroupsBtn;
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement workGroupNameTxtbox;
	
	@FindBy(xpath="//input[@name='description']")
	public WebElement workGroupDescription;
	
	@FindBy(xpath="//span[text()='Select users']/following-sibling::span")
	public WebElement selectUsersBtn;
	
	@FindBy(xpath="(//div[@class='x-grid-row-checker'])[2]")
	public WebElement batchExecutorUserCheckBox;
	
	@FindBy(xpath="(//div[@class='x-grid-row-checker'])[3]")
	public WebElement bobUserCheckBox;
	
	@FindBy(xpath="(//span[@class='x-btn-icon-el  '])[5]")
	public WebElement addUserBtn;
	
	@FindBy(xpath="(//a[contains(@class,'x-btn x-unselectable')])[5]")
	public WebElement addWorkGroupBtn;
	
	@FindBy(xpath="//span[text()='Remove']//ancestor::a")
	public WebElement removeWorkGroupBtn;
	
	@FindBy(xpath="//span[text()='Edit']//ancestor::a")
	public WebElement editWorkGroupBtn;
	
	@FindBy(xpath="//label[text()='Workgroup added']")
	public WebElement workGroupAddedLabel;
	
	@FindBy(xpath="//label[text()='Workgroup removed']")
	public WebElement workGroupRemovedLabel;
	
	@FindBy(xpath="//label[text()='Workgroup saved']")
	public WebElement workGroupSavedLabel;
	
	@FindBy(xpath="(//span[@class='x-btn-icon-el  '])[4]")
	public WebElement saveWorkGroupBtn;
	
	
	public final String WorkGroups_Action_Button = "//*[text()='%s']//ancestor::td//following-sibling::td//span";
	public final String Remove_WorkGroup_Confirmation ="//span[contains(text(),'%s')]//ancestor::div//a[normalize-space()='Remove']";
	
	
	
	
	
			
			
	
	
	
	

}

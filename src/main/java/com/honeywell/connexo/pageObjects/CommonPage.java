package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage extends BasePage{
	
	@FindBy(xpath="//span[@class='x-btn-icon-el icon-menu3 ']")
	public WebElement mainMenuIcon;
	
	@FindBy(xpath="//span[@class='name'][normalize-space()='MultiSense']")
	public WebElement multiSenseMenuMainLink;
	
	@FindBy(xpath="//span[@class='name'][normalize-space()='Admin']")
	public WebElement AdminMainMenuLink;
	
	@FindBy(xpath="//a[@class='x-btn user-menu x-unselectable x-box-item x-btn-default-medium x-icon x-btn-icon x-btn-default-medium-icon']")
	public WebElement userIcon;
	
	@FindBy(xpath="//span[text()='Logout']//parent::a")
	public WebElement logoutBtn;
	

}

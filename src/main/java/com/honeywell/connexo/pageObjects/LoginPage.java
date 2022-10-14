package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	@FindBy(xpath="//input[@name =\"username\"]")
	public WebElement loginUserNameTxt;
	
	
    @FindBy(xpath="//input[@name =\"password\"]")
    public WebElement loginPasswordTxt;
    
    
    @FindBy(xpath="//span[contains(text(),\"Login\")]//parent::span")
    public WebElement loginBtn;
		
	

}

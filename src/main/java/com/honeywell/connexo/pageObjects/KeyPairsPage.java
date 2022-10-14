package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KeyPairsPage extends BasePage{
	
	@FindBy(xpath="//span[contains(text(),'Keypairs')]")
	public WebElement keyPairsLinkInAdmin;
	
	@FindBy(xpath="//span[@class='x-btn-button'][normalize-space()='Generate key pair']")
	public WebElement generateKeyPairButton;
	
	@FindBy(xpath="//input[@name='alias']")
	public WebElement aliasTextbox;
	
	@FindBy(xpath="//input[@name='keyEncryptionMethod']")
	public WebElement storageMethodDropdownIcon;
	
	@FindBy(xpath="//input[@name='keyType']")
	public WebElement keyTypeDropdownIcon;
	
	@FindBy(xpath="//*[normalize-space()='Add']//span[@class='x-btn-button']")
	public WebElement addButton;
	
	@FindBy(xpath="//label[contains(text(),'Key pair generated')]")
	public WebElement keyPairGeneratedLabel;
	
	@FindBy(xpath="//label[contains(text(),'Key pair removed')]")
	public WebElement keyPairRemovedLabel;
	
	@FindBy(xpath="//span[@class='x-menu-item-text '][normalize-space()='Download public key']")
	public WebElement downloadPublicKeyButton;
	
	@FindBy(xpath="//span[@class='x-menu-item-text '][normalize-space()='Remove']")
	public WebElement removeButton;
	
	
	
	
	public final String storageMethodDropdownValue="//li[normalize-space()='%s']";
	public final String keyTypeDropdownValue="//li[normalize-space()='%s']";
	public final String keyPair_Action_Button ="//div[normalize-space()='%s']//ancestor::td//following::td[4]//div/span";
	public final String KeyPair_Remove_Confirmation = "//span[contains(text(),'%s')]//ancestor::div//a[normalize-space()='Remove']";
	

}

package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskOverviewPage extends BasePage{
	
	@FindBy(xpath="//span[contains(text(),'Task overview')]//parent::a")
	public WebElement taskOverviewLinkInAdmin;
	
	@FindBy(xpath="//span[contains(text(),'Task overview')]")
	public WebElement taskOverviewLabel;
	
	@FindBy(xpath="(//table//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[2]")
	public WebElement queueDropdownIcon;
	
	@FindBy(xpath="//span[text()='Apply']//ancestor::a")
	public WebElement applyButton;
	
	
	
	
	public final String QueueDrodownValue= "//div[text()=' %s ']//img";
	public final String ResultOfFilterVerfication ="//div[@class='x-grid-view x-fit-item x-grid-view-default']/table/tbody/tr//td/div[contains(text(),'%s')]";

}

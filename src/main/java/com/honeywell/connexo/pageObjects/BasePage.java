package com.honeywell.connexo.pageObjects;

import org.openqa.selenium.support.PageFactory;

import com.honeywell.connexo.base.Base;

public class BasePage {
	
	public BasePage() {
	PageFactory.initElements(Base.driver, this);
	}

}

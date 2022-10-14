package com.honeywell.connexo.multiSenseDevicesImplimentation;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Waits;

public class DeviceImplementation extends Base{
	
	
	public void addDevice(List<List<String>> list) throws InterruptedException {
		Waits.waitUntilElementVisible(page.devicePage.addDevicelink, 10);
		clickObject(page.devicePage.addDevicelink, "Add Devices Link");
		Waits.waitUntilElementVisible(page.devicePage.deviceNameTxtbox, 30);
		sendText(page.devicePage.deviceNameTxtbox, list.get(0).get(0), "DeviceName TextBox");
		sendText(page.devicePage.deviceTypeDropdown, list.get(0).get(1), "Device Type Dropdown");
		Actions action= new Actions(Base.getDriver());
		action.sendKeys(Keys.ENTER).build().perform();
		sendText(page.devicePage.deviceConfigDropdown, list.get(0).get(2), "Device COnfig DropDown");
		action.sendKeys(Keys.ENTER).build().perform();
		clickObject(page.devicePage.deviceAddBtn, " Add Device Button");
		
		
		
	}

}

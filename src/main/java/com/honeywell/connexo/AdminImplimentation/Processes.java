package com.honeywell.connexo.AdminImplimentation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Waits;

public class Processes extends Base{

	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Process Page from Admin
	 */
	public void navigateToProcessesPage() {
		Waits.waitUntilElementVisible(page.processPage.processesLinkInAdmin, 10);
		clickObject(page.processPage.processesLinkInAdmin, "processesLinkInAdmin");
		
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to activate a Process based on provided name
	 */
	public void activateProcess(String processName) throws InterruptedException {
		Waits.wait(3000);
		clickObject(String.format(page.processPage.Processes_Action_Button, processName), "Processes_Action_Button");
		clickObject(page.processPage.activateButton,"Processes activateButton");
		Waits.waitUntilElementVisible(page.processPage.startOnDropdown, 10);
		clickObject(page.processPage.startOnDropdown, "startOnDropdown");
		clickObject(page.processPage.deviceValueFromstartOnDropdown, "deviceValueFromstartOnDropdown");
	    clickObject(page.processPage.unCheckAllBtnForDeviceState, "unCheckAllBtnForDeviceState");
		clickObject(page.processPage.inStockcheckbox, "inStockDeviceState check box");
		clickObject(page.processPage.unCheckAllBtnFoPrivillages, "unCheckAllBtnFoPrivillages");
		clickObject(page.processPage.PrivillageExecuteLevel1Checkbox, "PrivillageExecuteLevel1 check box");
		clickObject(page.processPage.SaveBtn,"Save Button");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to edit a Process based on provided name
	 */
	public void editProcess(String processName) throws InterruptedException {
		Waits.wait(3000);
		clickObject(String.format(page.processPage.Processes_Action_Button, processName), "Processes_Action_Button");
		clickObject(page.processPage.editProcess, "editProcess");
	    clickObject(page.processPage.SaveBtn,"Save Button");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to Deactivate a Process based on provided name
	 */
	public void deActivateProcess(String processName) throws InterruptedException {
		Waits.wait(2000);
		clickObject(String.format(page.processPage.Processes_Action_Button, processName), "Processes_Action_Button");
		clickObject(page.processPage.deActivateButton,"Processes deActivateButton");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to verify the status message
	 */
	public void verfiyProcessStaus(String ProcessName, String status) throws InterruptedException {
		Waits.wait(5000);
		WebElement ele= driver.findElement(By.xpath(String.format(page.processPage.Processes_Status, ProcessName,status)));
		if(status.equalsIgnoreCase("Active"))
			isExists(ele, status);
		else if(status.equalsIgnoreCase("Inactive"))
			isExists(ele, status);
			
	}
}

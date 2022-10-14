package com.honeywell.connexo.AdminImplimentation;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Waits;

public class DataPurge extends Base{
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Data Purge Settings Page from Admin
	 */
	public void navigateToDataPurgeSettingsPage() {
		Waits.waitUntilElementVisible(page.dataPurgePage.dataPurgeSettingLinkInAdmin, 10);
		clickObject(page.dataPurgePage.dataPurgeSettingLinkInAdmin, "dataPurgeSettingLinkInAdmin");
	}
	
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Data Purge History Page from Admin
	 */
	public void navigateToDataPurgeHistoryPage() {
		Waits.waitUntilElementVisible(page.dataPurgePage.dataPurgeHistoryLinkInAdmin, 10);
		clickObject(page.dataPurgePage.dataPurgeHistoryLinkInAdmin, "dataPurgeHistoryLinkInAdmin");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to Update the Data Purge Settings with 991 for first value
	 */
	public void updateDataPurgeSettings() throws InterruptedException {
		clickObject(page.dataPurgePage.purgeDataOlderThanSection, "purgeDataOlderThanSection");
		sendTextWithClear(page.dataPurgePage.purgeDataOlderThanTextBox, "991", "purgeDataOlderThanTextBox");
		clickObject(page.dataPurgePage.saveButton, "saveButton");
		Waits.wait(1000);
		isExists(page.dataPurgePage.dataPurgeSettingSavedLabel, "dataPurgeSettingSavedLabel");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to Resetting the Data Purge Settings with 999 for first value
	 */
	public void resetDataPurgeSettings() throws InterruptedException {
		clickObject(page.dataPurgePage.purgeDataOlderThanSection, "purgeDataOlderThanSection");
		sendTextWithClear(page.dataPurgePage.purgeDataOlderThanTextBox, "999", "purgeDataOlderThanTextBox");
		clickObject(page.dataPurgePage.saveButton, "saveButton");
		Waits.wait(1000);
		isExists(page.dataPurgePage.dataPurgeSettingSavedLabel, "dataPurgeSettingSavedLabel");
		clickObject(page.dataPurgePage.saveButton, "saveButton");
		Waits.wait(1000);
		isExists(page.dataPurgePage.dataPurgeSettingNothingToSaveLabel, "dataPurgeSettingNothingToSaveLabel");
		
	}

	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to check the data purge history label on the Data Purge History Page
	 */
	public void verifyDataPurgeHistoryPage() {
		isExists(page.dataPurgePage.dataPurgeHistoryLabel, "dataPurgeHistoryLabel");
	}
}

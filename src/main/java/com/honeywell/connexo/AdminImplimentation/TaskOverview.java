package com.honeywell.connexo.AdminImplimentation;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Waits;

public class TaskOverview extends Base{
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Task Overview Page from Admin
	 */
	public void navigateToTaskOverviewPage() {
		Waits.waitUntilElementVisible(page.taskOverviewPage.taskOverviewLinkInAdmin, 10);
		clickObject(page.taskOverviewPage.taskOverviewLinkInAdmin, "taskOverviewLinkInAdmin");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to apply filter and verify the result of filter
	 */
	public void applyAndVerifyTaskOverviewFilter(String queueName) throws InterruptedException {
		isExists(page.taskOverviewPage.taskOverviewLabel, "taskOverviewLabel");
		clickObject(page.taskOverviewPage.queueDropdownIcon, "queueDropdownIcon");
		clickObject(String.format(page.taskOverviewPage.QueueDrodownValue, queueName), "QueueDrodownValue");
	    clickObject(page.taskOverviewPage.applyButton, "applyButton");
	    Waits.wait(4000);
	    isExists(String.format(page.taskOverviewPage.ResultOfFilterVerfication, queueName), "ResultOfFilterVerfication"+queueName);
	}
	

}

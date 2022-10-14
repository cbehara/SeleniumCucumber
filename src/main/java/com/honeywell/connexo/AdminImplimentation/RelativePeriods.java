package com.honeywell.connexo.AdminImplimentation;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Waits;

public class RelativePeriods extends Base{
	
	public String relativePeriodName="Last8Days";
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Relative Periods Page from Admin
	 */
	public void navigateToRelativePeriodsPage() {
		Waits.waitUntilElementVisible(page.relativePeriodsPage.relativePeriodsLinkInAdmin, 10);
		clickObject(page.relativePeriodsPage.relativePeriodsLinkInAdmin, "relativePeriodsLinkInAdmin");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to add a new Relative Period
	 */
	public void addNewRealtivePeriod() {
		clickObject(page.relativePeriodsPage.addRelativePeriodButton, "addRelativePeriodButton");
		sendText(page.relativePeriodsPage.relativePeriodNameTxtBox, relativePeriodName, "relativePeriodNameTxtBox");
		clickObject(page.relativePeriodsPage.categoryDropDownIcon, "categoryDropDownIcon");
		clickObject(page.relativePeriodsPage.categoryDropDownValueAsDataExport, "categoryDropDownValueAsDataExport");
		clickObject(page.relativePeriodsPage.addButton, "addButton");
		
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to edit an newly added Relative Period
	 */
	public void editRelativePeriod() {
		clickObject(String.format(page.relativePeriodsPage.RelativePeriod_Action_Button, relativePeriodName), "RelativePeriod_Action_Button");
		clickObject(page.relativePeriodsPage.editButton, "editButton");
		clickObject(page.relativePeriodsPage.dateRadioButton,"dateRadioButton");
		sendTextWithClear(page.relativePeriodsPage.daytextBox, "8", "daytextBox");
		clickObject(page.relativePeriodsPage.frequencyDorpdownIcon, "frequencyDorpdownIcon");
		clickObject(page.relativePeriodsPage.frequencyValueAsDays, "frequencyValueAsDays");
		clickObject(page.relativePeriodsPage.durationDropDownIcon, "durationDropDownIcon");
		clickObject(page.relativePeriodsPage.durationValueAsAgo, "durationValueAsAgo");
		clickObject(page.relativePeriodsPage.endrelativePeriodRadioBtn, "endrelativePeriodRadioBtn");
		clickObject(page.relativePeriodsPage.saveButton, "saveButton");
			
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to remove an newly added Relative Period
	 */
	public void removeRelativePeriod() {
		clickObject(String.format(page.relativePeriodsPage.RelativePeriod_Action_Button, relativePeriodName), "RelativePeriod_Action_Button");
		clickObject(page.relativePeriodsPage.removeButton, "removeButton");
		clickObject(page.relativePeriodsPage.Remove_RelativePeriod_Confirmation, "Remove_RelativePeriod_Confirmation");
		
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to verify the message of  Relative Period operation like ADD, EDIT, REMOVE and Activate and Deactivate
	 */
	public void verifyMessage(String message) throws InterruptedException {
		Waits.wait(1000);
		if(message.equalsIgnoreCase("Add"))
			isExists(page.relativePeriodsPage.relativePeriodAddedLabel, "relativePeriodAddedLabel");
		else if(message.equalsIgnoreCase("Save"))
			isExists(page.relativePeriodsPage.relativePeriodSavedLabel, "relativePeriodSavedLabel");
		else if(message.equalsIgnoreCase("Remove"))
			isExists(page.relativePeriodsPage.relativePeriodRemovedLabel, "relativePeriodRemovedLabel");
		
	}

}

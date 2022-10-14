package com.honeywell.connexo.AdminImplimentation;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Waits;

public class WorkGroups extends Base{
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to WorkGroups Page From Admin
	 */
	public void navigateToWorkGroupsPage() {
		Waits.waitUntilElementVisible(page.workGroupsPage.workGroupsLinkInAdmin, 10);
		clickObject(page.workGroupsPage.workGroupsLinkInAdmin, "workGroupsLinkInAdmin");	
	}
	
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to adding a workgroup based on provided name
	 */
	public void addWorkGroup(String workGroupName) {
		clickObject(page.workGroupsPage.addWorkGroupsBtn, "addWorkGroups Button");
		sendText(page.workGroupsPage.workGroupNameTxtbox, workGroupName, "workGroupNameTxtbox");
		sendText(page.workGroupsPage.workGroupDescription, workGroupName, "workGroupDescription");
		clickObject(page.workGroupsPage.selectUsersBtn, "selectUsers Button");
		clickObject(page.workGroupsPage.batchExecutorUserCheckBox, "batchExecutorUserCheckBox");
		clickObject(page.workGroupsPage.bobUserCheckBox, "bobUserCheckBox");
		clickObject(page.workGroupsPage.addUserBtn, "addUserBtn");
		clickObject(page.workGroupsPage.addWorkGroupBtn, "addWorkGroupBtn");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to edit a workgroup based on provided name
	 */
	public void editWorkGroup(String workGroupName) throws InterruptedException {
		Waits.wait(3000);
		clickObject(String.format(page.workGroupsPage.WorkGroups_Action_Button, workGroupName), "WorkGroups_Action_Button");
		clickObject(page.workGroupsPage.editWorkGroupBtn, "editWorkGroupBtn");
		sendTextWithClear(page.workGroupsPage.workGroupDescription, workGroupName+"Update", "workGroupDescription");
		clickObject(page.workGroupsPage.saveWorkGroupBtn, "saveWorkGroup Button");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to remove a workgroup based on provided name
	 */
	public void removeWorkGroup(String workGroupName) throws InterruptedException {
		Waits.wait(3000);
		clickObject(String.format(page.workGroupsPage.WorkGroups_Action_Button, workGroupName), "WorkGroups_Action_Button");
		clickObject(page.workGroupsPage.removeWorkGroupBtn, "removeWorkGroupBtn");
		Waits.wait(2000);
		clickObject(String.format(page.workGroupsPage.Remove_WorkGroup_Confirmation, workGroupName), "Remove_WorkGroup_Confirmation");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to verify the status message of WorkGroups CRUD operations
	 */
	public void verifyMessage(String message) throws InterruptedException {
		Waits.wait(1000);
		if(message.equalsIgnoreCase("Add"))
			isExists(page.workGroupsPage.workGroupAddedLabel, "workGroupAddedLabel");
		else if(message.equalsIgnoreCase("Save"))
			isExists(page.workGroupsPage.workGroupSavedLabel, "workGroupSavedLabel");
		else if(message.equalsIgnoreCase("Remove"))
			isExists(page.workGroupsPage.workGroupRemovedLabel, "workGroupRemovedLabel");
	}
	

}

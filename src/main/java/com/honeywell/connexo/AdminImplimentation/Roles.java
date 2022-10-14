package com.honeywell.connexo.AdminImplimentation;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Waits;

public class Roles extends Base {
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Roles Page From Admin
	 */
	public void navigateToRolesPage() {
		Waits.waitUntilElementVisible(page.rolesPage.RolesLinkInAdmin, 10);
		clickObject(page.rolesPage.RolesLinkInAdmin, "RolesLinkInAdmin");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to adding a role based on provided role name
	 */
	public void addRole(String roleName) throws InterruptedException {
		clickObject(page.rolesPage.AddRolesBtn, "AddRolesBtn");
		sendText(page.rolesPage.RoleNameTxtBox, roleName, "RoleNameTxtBox");
		sendText(page.rolesPage.RoleDescriptionTxtBox, roleName, "RoleDescriptionTxtBox");
		clickObject(page.rolesPage.fullControlBtn, "fullControlBtn");
		Waits.wait(5000);
		clickObject(page.rolesPage.AddRoleBtn, "AddRoleBtn");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to edit a role based on provided role name
	 */
	public void editRole(String roleName) {
		clickObject(String.format(page.rolesPage.Roles_Action_Button, roleName), "Roles_Action_Button");
		clickObject(page.rolesPage.EditRoleBtn, "EditRoleBtn");
		sendTextWithClear(page.rolesPage.RoleDescriptionTxtBox, roleName+"Updated", "RoleDescriptionTxtBox");
		clickObject(page.rolesPage.saveBtn, "Save Button");
		
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to remove a role based on provided role name
	 */
	public void removeRole(String roleName) {
		clickObject(String.format(page.rolesPage.Roles_Action_Button, roleName), "Roles_Action_Button");
		clickObject(page.rolesPage.removeBtn, "Remove Button");
		clickObject(String.format(page.rolesPage.Remove_Roles_Confirmation, roleName), "Remove_Roles_Confirmation");
	}
	

	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to verify the status message of ROLES CRUD operations
	 */
	public void verifyMessage(String message) throws InterruptedException {
		Waits.wait(1000);
		if(message.equalsIgnoreCase("Add"))
			isExists(page.rolesPage.roleAddedLabel, "roleAddedLabel");
		else if(message.equalsIgnoreCase("Save"))
			isExists(page.rolesPage.roleSavedLabel, "roleSavedLabel");
		else if(message.equalsIgnoreCase("Remove"))
			isExists(page.rolesPage.roleRemovedLabel, "roleRemovedLabel");
	}
}

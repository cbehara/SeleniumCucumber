package com.honeywell.connexo.AdminImplimentation;

import java.util.Map;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Waits;

public class UserDirectory extends Base {
	
	public static Map<String, String> userDirectoryMap;
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to User Directory Page from Admin
	 */
	public void navigateToUserDirectoryPage() {
		Waits.waitUntilElementVisible(page.userDirectoryPage.userDirectoriesLinkInAdmin, 10);
		clickObject(page.userDirectoryPage.userDirectoriesLinkInAdmin, "userDirectoriesLinkInAdmin");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to add a new User Directory Page in Admin
	 */
	public void AddUserDirctory() {
		clickObject(page.userDirectoryPage.addUserDirectoryButton, "addUserDirectoryButton");
		sendText(page.userDirectoryPage.nameTextBox, userDirectoryMap.get("Name"), "nameTextBox");
		sendText(page.userDirectoryPage.urlTextBox, userDirectoryMap.get("Url"), "urlTextBox");
		sendText(page.userDirectoryPage.backUpUrlTextBox, userDirectoryMap.get("Backupurl"), "backUrlTextBox");
		clickObject(page.userDirectoryPage.securityProtocolDropdown, "securityProtocolDropdown");
		clickObject(String.format(page.userDirectoryPage.securityProtocolDropdownValue, userDirectoryMap.get("securityprotocol")), "securityProtocolDropdownValue :"+userDirectoryMap.get("securityprotocol"));
	    sendText(page.userDirectoryPage.userTextBox, userDirectoryMap.get("directoryUser"), "userTextBox");
	    sendText(page.userDirectoryPage.passwordTextBox, userDirectoryMap.get("Password"), "passwordTextBox");
	    sendText(page.userDirectoryPage.baseUserDNTextBox, userDirectoryMap.get("BaseUrl"), "baseUserDNTextBox");
	    sendText(page.userDirectoryPage.baseGroupDNTextBox, userDirectoryMap.get("BaseGroup"), "baseGroupDNTextBox");
	    clickObject(page.userDirectoryPage.addButton, "addButton");
	}

	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to edit a newly added User Directory Page in Admin
	 */
	public void editUserDirectory() {
		clickObject(String.format(page.userDirectoryPage.userDirectory_Actions_Button, userDirectoryMap.get("Name")), "userDirectory_Actions_Button");
		clickObject(page.userDirectoryPage.editButton, "editButton");
		sendText(page.userDirectoryPage.passwordTextBox, userDirectoryMap.get("Password"), "passwordTextBox");
		clickObject(page.userDirectoryPage.saveButton, "saveButton");
	}
	
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to remove a newly added User Directory Page in Admin
	 */
	public void removeUserDirectory() {
		clickObject(String.format(page.userDirectoryPage.userDirectory_Actions_Button, userDirectoryMap.get("Name")), "userDirectory_Actions_Button");
		clickObject(page.userDirectoryPage.removeButton, "removeButton");
		clickObject(String.format(page.userDirectoryPage.Remove_userDirectory_Confirmation, userDirectoryMap.get("Name")), "Remove_userDirectory_Confirmation");
		
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to verify the status message of UserDirectory CRUD operations
	 */
	public void verifyMessage(String message) throws InterruptedException {
		Waits.wait(1000);
		if(message.equalsIgnoreCase("Add"))
			isExists(page.userDirectoryPage.userDirctoryAddedLabel, "userDirctoryAddedLabel");
		else if(message.equalsIgnoreCase("Save"))
			isExists(page.userDirectoryPage.userDirctorySavedLabel, "userDirctorySavedLabel");
		else if(message.equalsIgnoreCase("Remove"))
			isExists(page.userDirectoryPage.userDirctoryRemovedLabel, "userDirctoryRemovedLabel");
	}
}

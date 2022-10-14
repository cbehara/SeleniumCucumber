package com.honeywell.connexo.AdminImplimentation;

import java.awt.AWTException;
import java.util.Map;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.PathHelper;
import com.honeywell.connexo.utils.Shared;
import com.honeywell.connexo.utils.Waits;


public class ImportServices extends Base {
	
	public static Map<String, String> importServiceMap;
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Import Services from Admin
	 */
	public void navigateToImportServicesPage() {
		Waits.waitUntilElementVisible(page.importService.importServicesLinkInAdmin, 10);
		clickObject(page.importService.importServicesLinkInAdmin, "importServicesLinkInAdmin");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to add a new Import Services
	 */
	public void addNewImportServices() {
		clickObject(page.importService.addImportServicesButton, "addImportServicesButton");
		sendText(page.importService.ImportServiceNameTxtBox, importServiceMap.get("Name"), "ImportServiceNameTxtBox");
		clickObject(page.importService.fileImporterDropdownIcon, "fileImporterDropdownIcon");
		clickObject(String.format(page.importService.fileImporterValue, importServiceMap.get("FileImporter")), "fileImporterDropdownValue");
		sendText(page.importService.importFolderTxtBox, importServiceMap.get("ImportFolder"), "importFolderTxtBox");
		sendText(page.importService.inProgressFolderTxtBox, importServiceMap.get("InProgressFolder"), "inProgressFolderTxtBox");
		sendText(page.importService.successFolderTxtBox, importServiceMap.get("SuccessFolder"), "successFolderTxtBox");
		sendText(page.importService.failureFolderTxtBox, importServiceMap.get("FailureFolder"), "failureFolderTxtBox");
		clickObject(page.importService.addButton, "addButton");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to edit Import Services
	 */
	public void editImportService() {
		clickObject(String.format(page.importService.ImportServices_Action_Button, importServiceMap.get("Name")), "ImportServices_Action_Button");
		clickObject(page.importService.editButton, "editButton");
		sendTextWithClear(page.importService.filePatternTxtBox, importServiceMap.get("FilePattern"), "filePatternTxtBox");
		clickObject(page.importService.saveButton, "saveButton");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to Remove Import Services
	 */
	public void removeImportService() {
		clickObject(String.format(page.importService.ImportServices_Action_Button, importServiceMap.get("Name")), "ImportServices_Action_Button");
		clickObject(page.importService.removeButton, "removeButton");
		clickObject(page.importService.Remove_ImportServices_Confirmation, "Remove_ImportServices_Confirmation");
		
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to Activate Import Services
	 */
	public void activateImportService() {
		clickObject(String.format(page.importService.ImportServices_Action_Button, importServiceMap.get("Name")), "ImportServices_Action_Button");
		clickObject(page.importService.activateButton, "activateButton");
		clickObject(page.importService.Activate_ImportServices_Confirmation, "Activate_ImportServices_Confirmation");
		
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to Deactivate Import Services
	 */
	public void deActivateImportService() {
		clickObject(String.format(page.importService.ImportServices_Action_Button, importServiceMap.get("Name")), "ImportServices_Action_Button");
		clickObject(page.importService.deActivateButton, "deActivateButton");
		clickObject(page.importService.DeActivate_ImportServices_Confirmation, "DeActivate_ImportServices_Confirmation");
	
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to verify the message of  Import Services operation like ADD, EDIT, REMOVE and Activate and Deactivate
	 */
	public void verifyMessage(String message) throws InterruptedException {
		Waits.wait(1000);
		if(message.equalsIgnoreCase("Add"))
			isExists(page.importService.importServicesAddedLabel, "importServicesAddedLabel");
		else if(message.equalsIgnoreCase("Save"))
			isExists(page.importService.importServicesSavedLabel, "importServicesSavedLabel");
		else if(message.equalsIgnoreCase("Remove"))
			isExists(page.importService.importServicesRemovedLabel, "importServicesRemovedLabel");
		else if(message.equalsIgnoreCase("Activate"))
			isExists(page.importService.importServicesActivatedLabel, "importServicesActivatedLabel");
		else if(message.equalsIgnoreCase("Deactivate"))
			isExists(page.importService.importServicesDeactivatedLabel, "importServicesDeactivatedLabel");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Import History Page from Admin
	 */
	public void navigateToImportHistoryPage() {
		Waits.waitUntilElementVisible(page.importService.importHistoryLinkInAdmin, 10);
		clickObject(page.importService.importHistoryLinkInAdmin, "importHistoryLinkInAdmin");
	}

	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to check the Import history label on the Data Purge History Page
	 */
	public void verifyImportHistoryPage() {
		isExists(page.importService.importHistoryLabel, "importHistoryLabel");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to activate the given import Service
	 */
	public void activateImportService(String importServiceName) {
		clickObject(String.format(page.importService.ImportServices_Action_Button, importServiceName), "ImportServices_Action_Button");
		clickObject(page.importService.activateButton, "activateButton");
		clickObject(page.importService.Activate_ImportServices_Confirmation, "Activate_ImportServices_Confirmation");
	
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to Deactivate the given import Service
	 */
	public void DeactivateImportService(String importServiceName) {
		clickObject(String.format(page.importService.ImportServices_Action_Button, importServiceName), "ImportServices_Action_Button");
		clickObject(page.importService.deActivateButton, "deActivateButton");
		clickObject(page.importService.DeActivate_ImportServices_Confirmation, "DeActivate_ImportServices_Confirmation");
	
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Upload File for Import Services from Admin
	 */
	public void navigateToUploadFileForImportServicesPage() {
		Waits.waitUntilElementVisible(page.importService.uploadFileForImporterLinkInAdmin, 10);
		clickObject(page.importService.uploadFileForImporterLinkInAdmin, "uploadFileForImporterLinkInAdmin");
	}
	
	public void uploadImportFile(String importerService) throws AWTException, InterruptedException {
		clickObject(page.importService.importServiceDropdownIcon, "importServiceDropdownIcon");
		clickObject(String.format(page.importService.importServiceDropdownValue, importerService), "importServiceDropdownValue as"+importerService);
		clickObject(page.importService.selectFilesButton, "selectFilesButton");
		String filePath = PathHelper.getResourcePath("\\src\\main\\resources\\Data\\sample.xml");
		Waits.wait(3000);
		Shared.uploadFileUsingRobot(filePath);
		clickObject(page.importService.uploadButton, "uploadButton");
	}
	
	public void verfiyUploadFileMessage() throws InterruptedException {
		Waits.wait(2000);
		isExists(page.importService.uploadFileMessage, "uploadFileMessage");
		
	}
	
}

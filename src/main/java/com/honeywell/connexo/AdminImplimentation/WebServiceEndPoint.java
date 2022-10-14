package com.honeywell.connexo.AdminImplimentation;

import java.util.Map;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Waits;

public class WebServiceEndPoint extends Base{
	
	public static Map<String, String> webServiceEndPointMap;
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to WebServicesEndPoint Page from Admin
	 */
	public void navigateToWebServicesEndPointPage() {
		Waits.waitUntilElementVisible(page.webServicesEndPointPage.webServiceEndPointLinkInAdmin, 10);
		clickObject(page.webServicesEndPointPage.webServiceEndPointLinkInAdmin, "webServiceEndPointLinkInAdmin");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to add a new WebServicesEndPoint
	 */
	public void addNewWebServiceEndPoint() {
		clickObject(page.webServicesEndPointPage.addWebServiceEndPointButton, "addWebServiceEndPointButton");
		sendText(page.webServicesEndPointPage.webServiceEndPointNameTxtbox, webServiceEndPointMap.get("Name"), "webServiceEndPointNameTxtbox");
		clickObject(page.webServicesEndPointPage.webServicesDrodpdownIcon, "webServicesDrodpdownIcon");
		clickObject(String.format(page.webServicesEndPointPage.webServicesDropdownValue, webServiceEndPointMap.get("Webservice")), "webServicesDropdownValue");
		sendText(page.webServicesEndPointPage.urlPathTextbox, webServiceEndPointMap.get("UrlPath"), "urlPathTextbox");
		clickObject(page.webServicesEndPointPage.logLevelDropdownIcon, "logLevelDropdownIcon");
		clickObject(String.format(page.webServicesEndPointPage.logLevelDropdownValue, webServiceEndPointMap.get("Loglevel")), "logLevelDropdownValue");
		clickObject(page.webServicesEndPointPage.authenticationDropdownIcon, "authenticationDropdownIcon");
		clickObject(String.format(page.webServicesEndPointPage.authenticationDropdownValue, webServiceEndPointMap.get("Authentication")), "authenticationDropdownValue");
        clickObject(page.webServicesEndPointPage.addButton, "addButton");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to activate a new WebServicesEndPoint
	 */
	public void activateWebServiceEndPoint() {
		clickObject(String.format(page.webServicesEndPointPage.webServiceEndPoint_Action_Button, webServiceEndPointMap.get("Name")), "webServiceEndPoint_Action_Button");
		clickObject(page.webServicesEndPointPage.activateButton, "activateButton");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to edit a newly added WebServicesEndPoint
	 */
	public void editWebServiceEndPoint() {
		clickObject(String.format(page.webServicesEndPointPage.webServiceEndPoint_Action_Button, webServiceEndPointMap.get("Name")), "webServiceEndPoint_Action_Button");
		clickObject(page.webServicesEndPointPage.editButton, "editButton");
		clickObject(page.webServicesEndPointPage.saveButton, "saveButton");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to edit a newly added WebServicesEndPoint
	 */
	public void removeWebServiceEndPoint() {
		clickObject(String.format(page.webServicesEndPointPage.webServiceEndPoint_Action_Button, webServiceEndPointMap.get("Name")), "webServiceEndPoint_Action_Button");
		clickObject(page.webServicesEndPointPage.removeButton, "removeButton");
		clickObject(String.format(page.webServicesEndPointPage.Remove_WebServiceEndpoint_Confirmation, webServiceEndPointMap.get("Name")), "Remove_WebServiceEndpoint_Confirmation");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to verify the message of  WebServices operation like ADD, EDIT, REMOVE and Activate and Deactivate
	 */
	public void verifyMessage(String message) throws InterruptedException {
		Waits.wait(1000);
		if(message.equalsIgnoreCase("Add"))
			isExists(page.webServicesEndPointPage.webServiceAddedLabel, "webServiceAddedLabel");
		else if(message.equalsIgnoreCase("Save"))
			isExists(page.webServicesEndPointPage.webServiceSavedLabel, "webServiceSavedLabel");
		else if(message.equalsIgnoreCase("Remove"))
			isExists(page.webServicesEndPointPage.webServiceRemovedLabel, "webServiceRemovedLabel");
		else if(message.equalsIgnoreCase("Activate"))
			isExists(page.webServicesEndPointPage.webServiceActivatedLabel, "webServiceActivatedLabel");
	}
	
	
	
	

}

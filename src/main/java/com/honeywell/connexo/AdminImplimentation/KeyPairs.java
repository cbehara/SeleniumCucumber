package com.honeywell.connexo.AdminImplimentation;

import java.util.Map;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Waits;

public class KeyPairs extends Base{
	
	public static Map<String, String> keyPairsMap;
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to KeyPairs Page from Admin
	 */
	public void navigateToKeyPairsPage() {
		Waits.waitUntilElementVisible(page.keyPairPage.keyPairsLinkInAdmin, 10);
		clickObject(page.keyPairPage.keyPairsLinkInAdmin, "keyPairsLinkInAdmin");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @throws InterruptedException 
	 * @description This Method is used to generate a New Key pair
	 */
    public void generateKeyPair() throws InterruptedException {
    	clickObject(page.keyPairPage.generateKeyPairButton, "generateKeyPairButton");
    	sendText(page.keyPairPage.aliasTextbox, keyPairsMap.get("Name"), "aliasTextbox");
    	clickObject(page.keyPairPage.storageMethodDropdownIcon, "storageMethodDropdownIcon");
    	clickObject(String.format(page.keyPairPage.storageMethodDropdownValue, keyPairsMap.get("StorageMethod")),"storageMethodDropdownValue");
    	clickObject(page.keyPairPage.keyTypeDropdownIcon, "keyTypeDropdownIcon");
    	clickObject(String.format(page.keyPairPage.keyTypeDropdownValue, keyPairsMap.get("KeyType")),"keyTypeDropdownValue");
    	clickObject(page.keyPairPage.addButton,"addButton");
    	Waits.wait(5000);
    }
    
    /***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to download Public key
	 */
    public void downloadPublicKey() {
    	clickObject(String.format(page.keyPairPage.keyPair_Action_Button, keyPairsMap.get("Name")), "keyPair_Action_Button");
    	clickObject(page.keyPairPage.downloadPublicKeyButton, "downloadPublicKeyButton");
    }
	
    /***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Remove the key Pair
	 */
    public void removeKeyPair() {
    	clickObject(String.format(page.keyPairPage.keyPair_Action_Button, keyPairsMap.get("Name")), "keyPair_Action_Button");
    	clickObject(page.keyPairPage.removeButton, "removeButton");
    	clickObject(String.format(page.keyPairPage.KeyPair_Remove_Confirmation, keyPairsMap.get("Name")), "KeyPair_Remove_Confirmation");
    }
    
    /***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to verify the message of  KeyPair operation like ADD,  REMOVE and Activate and Deactivate
	 */
	public void verifyMessage(String message) throws InterruptedException {
		Waits.wait(1000);
		if(message.equalsIgnoreCase("Add"))
			isExists(page.keyPairPage.keyPairGeneratedLabel, "keyPairGeneratedLabel");
		else if(message.equalsIgnoreCase("Remove"))
			isExists(page.keyPairPage.keyPairRemovedLabel, "keyPairRemovedLabel");
		
	}
}

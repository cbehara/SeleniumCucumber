package com.honeywell.connexo.AdminImplimentation;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Waits;

public class CustomAttributeSet extends Base{
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Custom Attribute Set Page from Admin
	 */
	public void navigateToCustomAttributeSetPage() {
		Waits.waitUntilElementVisible(page.customAttributeSetPage.customAttributeSetLinkInAdmin, 10);
		clickObject(page.customAttributeSetPage.customAttributeSetLinkInAdmin, "customAttributeSetLinkInAdmin");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to Apply and Verify the filter with Register as Custom Attribute
	 */
	public void applyAndVerifyFilterAsRegister() {
		clickObject(page.customAttributeSetPage.customAttributeTypeDropdownIcon, "customAttributeTypeDropdownIcon");
		clickObject(page.customAttributeSetPage.customAttributeTypeValueAsRegister, "customAttributeTypeValueAsRegister");
		clickObject(page.customAttributeSetPage.applyButton, "applyButton");
		isExists(page.customAttributeSetPage.verifyFilterDataContainsRegisterType, "verifyFilterDataContainsRegisterType");
	}

}

package com.honeywell.connexo.AdminImplimentation;

import java.util.HashMap;
import java.util.Map;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Shared;
import com.honeywell.connexo.utils.Waits;

public class ReadingTypes extends Base{
	
	public static Map<String, String> readingTypesMap = new HashMap<String, String>();
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Reading Types Page from Admin
	 */
	public void navigateToReadingTypesPage() {
		Waits.waitUntilElementVisible(page.readingTypesPage.readingTypesLinkInAdmin, 10);
		clickObject(page.readingTypesPage.readingTypesLinkInAdmin, "readingTypesLinkInAdmin");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to Adding a new Reading Type
	 */
	public void addNewReadingType() {
		//String name = Shared.generateRandomName(10);
		//readingTypesMap.put("Name", name);
		clickObject(page.readingTypesPage.addReadingTypesBtn, "addReadingTypesBtn");
		sendText(page.readingTypesPage.readingTypeSetNameTxtBox, Shared.generateRandomName(10), "readingTypeSetNameTxtBox");
		clickObject(page.readingTypesPage.extendedTab, "extendedTab");
		clickObject(page.readingTypesPage.period1DropdownIcon, "period1DropdownIcon");
		clickObject(String.format(page.readingTypesPage.period1_value, readingTypesMap.get("Period")), "period1_value");
		clickObject(page.readingTypesPage.period1Label, "period1Label");
		clickObject(page.readingTypesPage.commodityDropdownIcon, "commodityDropdownIcon");
		clickObject(String.format(page.readingTypesPage.commodity_value, readingTypesMap.get("Commodity")), "commodity_value");
		clickObject(page.readingTypesPage.commodity6Label, "commodity6Label");
		clickObject(page.readingTypesPage.phasesDropDownIcon, "phasesDropDownIcon");
		clickObject(String.format(page.readingTypesPage.phases_value, readingTypesMap.get("Phases")), "phases_value");
		clickObject(page.readingTypesPage.phasesLabel, "phasesLabel");
		clickObject(page.readingTypesPage.addBtn, "Add Button");
		clickObject(page.readingTypesPage.Add_ReadingType_Confirmation, "Add_ReadingType_Confirmation");
	}

}

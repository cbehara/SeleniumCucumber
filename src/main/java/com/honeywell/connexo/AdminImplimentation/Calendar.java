package com.honeywell.connexo.AdminImplimentation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Waits;

public class Calendar extends Base {
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Calendar Page from Admin
	 */
	public void navigateToCalenderPage() {
		Waits.waitUntilElementVisible(page.calenderPage.calenderLinkInAdmin, 10);
		clickObject(page.calenderPage.calenderLinkInAdmin, "calenderLinkInAdmin");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to activate a Calendar based on provided calendar name
	 */
	public void activateCalender(String calendarName) {
		clickObject(String.format(page.calenderPage.Calendar_Action_Button, calendarName), "Calendar_Action_Button");
	    clickObject(page.calenderPage.activateButton,"Calender activateButton");
		
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to Deactivate a Calendar based on provided calendar name
	 */
	public void deActivateCalender(String calendarName) throws InterruptedException {
		Waits.wait(5000);
		clickObject(String.format(page.calenderPage.Calendar_Action_Button, calendarName), "Calendar_Action_Button");
		clickObject(page.calenderPage.deActivateButton,"Calender deActivateButton");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to verify the message of Calendar CRUD operation like ADD, EDIT, REMOVE
	 */
	public void verfiyCalendarStaus(String calendarName, String status) throws InterruptedException {
		Waits.wait(3000);
		WebElement ele= driver.findElement(By.xpath(String.format(page.calenderPage.Calender_Status, calendarName,status)));
		if(status.equalsIgnoreCase("Active"))
			isExists(ele, status);
		else if(status.equalsIgnoreCase("Inactive"))
			isExists(ele, status);
			
	}
	 

}

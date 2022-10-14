package com.honeywell.connexo.commonImplimentation;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.Waits;

public class CommonImplementation extends Base {
	
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to login into Connexo application
	 */
	public void doLogin() {
		sendText(page.loginPage.loginUserNameTxt, userName,"UserName TextBox");
		sendText(page.loginPage.loginPasswordTxt, password, "Password TextBox");
		clickObject(page.loginPage.loginBtn,"Login Button");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to verify the Main Menu icon
	 */
	public  void verifyMainMenuIconVisible() throws InterruptedException {
		Waits.wait(5000);
		isExists(page.commonPage.mainMenuIcon, "Application Center Icon");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to MultiSense Application
	 */
	public  void navigateToMultiSenseApp() {
		clickObject(page.commonPage.mainMenuIcon, "Application Center Icon");
		Waits.waitUntilElementVisible(page.commonPage.multiSenseMenuMainLink, 10);
		clickObject(page.commonPage.multiSenseMenuMainLink, "MultiSense Link");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to navigate to Admin Application
	 */
	public void navigateToAdminModule() {
		clickObject(page.commonPage.mainMenuIcon, "Application Center Icon");
		Waits.waitUntilElementVisible(page.commonPage.AdminMainMenuLink, 10);
	   clickObject(page.commonPage.AdminMainMenuLink, "AdminMainMenuLink");
	}
	
	public  void clickOnDevicesSection() {
		Waits.waitUntilElementVisible(page.devicePage.DevicesHomePage, 30);
		clickObject(page.devicePage.DevicesHomePage, "Devices Section");
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to logout from connexo
	 */
	public  void dologout() {
		clickObject(page.commonPage.userIcon, "User Icon");
		clickObject(page.commonPage.logoutBtn, "Logout Button");
	}

}

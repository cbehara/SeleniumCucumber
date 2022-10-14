package com.honeywell.connexo.stepdef;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.commonImplimentation.CommonImplementation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonStepDef extends Base{
	CommonImplementation commonImpl = new CommonImplementation();
	
	@Given("HOME: I navigate to Admin Module")
	public void home_i_navigate_to_connexo_admin_module() {
		commonImpl.navigateToAdminModule();
	}
	
	@Given("^HOME: I navigate to Connexo application$")
	public void i_navigate_to_Connexo_application() throws Throwable {
	    navigateToUrl();
	}

	@And("^LOGIN: I do login with root user$")
	public void i_do_login_with_root_user() throws Throwable {
		commonImpl.doLogin();
	}

	@Then("^HOME: I should be on the Connexo dashboard page$")
	public void i_should_be_on_the_Connexo_dashboard_page() throws Throwable {
		commonImpl.verifyMainMenuIconVisible();
	}
	
	@And("^HOME: I logout from Connexo$")
	public void i_logout_from_Connexo() throws Throwable {
		commonImpl.dologout();
	}

}

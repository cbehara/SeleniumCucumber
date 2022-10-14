package com.honeywell.connexo.stepdef;

import java.util.List;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.commonImplimentation.CommonImplementation;
import com.honeywell.connexo.multiSenseDevicesImplimentation.DeviceImplementation;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DevicesStepDef extends Base {
	
	CommonImplementation common= new CommonImplementation();
	DeviceImplementation deviceImpl =new DeviceImplementation();
	
	@Then("I navigate to Multisense Module")
	public void i_navigate_to_multisense_module() {
		common.navigateToMultiSenseApp();
	}

	@Then("I click on Devices")
	public void i_click_on_devices() {
		common.clickOnDevicesSection();
	}

	@Then("I add a Device :")
	public void i_add_a_device(DataTable dataTable) throws InterruptedException {
		List<List<String>> data = dataTable.asLists();
		deviceImpl.addDevice(data);
	}

}

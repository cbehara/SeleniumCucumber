package com.honeywell.connexo.stepdef;

import java.awt.AWTException;

import com.honeywell.connexo.AdminImplimentation.ImportServices;
import com.honeywell.connexo.AdminImplimentation.KeyPairs;
import com.honeywell.connexo.AdminImplimentation.ReadingTypes;
import com.honeywell.connexo.AdminImplimentation.UserDirectory;
import com.honeywell.connexo.AdminImplimentation.WebServiceEndPoint;
import com.honeywell.connexo.base.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ConnexoAdministartionStepDef extends Base{
	
	Implementation impl =new Implementation();
	
	
	
	@Given("ADMIN-CALENDAR: I click on Calender link")
	public void admin_calendar_i_click_on_calender_link() {
		impl.adminCalendar.navigateToCalenderPage();
	}

	@Given("ADMIN-CALENDAR: I Activate {string} calendar")
	public void admin_calendar_i_activate_calendar(String calendarName) {
		impl.adminCalendar.activateCalender(calendarName);
	}

	@Given("ADMIN-CALENDAR: I check Calendar {string} status as {string}")
	public void admin_calendar_i_check_calendar_status_as(String calendarName, String status) throws InterruptedException {
		impl.adminCalendar.verfiyCalendarStaus(calendarName, status);
	}

	@Given("ADMIN-CALENDAR: I Deactivate {string} calendar")
	public void admin_calendar_i_deactivate_calendar(String calendarName) throws InterruptedException {
		impl.adminCalendar.deActivateCalender(calendarName);
	}
	
	@Given("ADMIN-PROCESSES: I click on Processes link")
	public void admin_processes_i_click_on_processes_link() {
		impl.processes.navigateToProcessesPage();
	}

	@Given("ADMIN-PROCESSES: I activate {string} process")
	public void admin_processes_i_activate_process(String processName) throws InterruptedException {
		impl.processes.activateProcess(processName);
	}

	@Given("ADMIN-PROCESSES: I edit {string} process")
	public void admin_processes_i_edit_process(String processName) throws InterruptedException {
		impl.processes.editProcess(processName);
	}

	@Given("ADMIN-PROCESSES: I check Process {string} status as {string}")
	public void admin_processes_i_check_process_status_as(String processName, String status) throws InterruptedException {
		impl.processes.verfiyProcessStaus(processName, status);
	}

	@Given("ADMIN-PROCESSES: I Deactivate {string} Process")
	public void admin_processes_i_deactivate_process(String processName) throws InterruptedException {
		impl.processes.deActivateProcess(processName);
	}
	
	@Given("ADMIN-WORKGROUPS: I click on WorkGroups link")
	public void admin_workgroups_i_click_on_work_groups_link() {
		impl.workGroup.navigateToWorkGroupsPage();
	}

	@Given("ADMIN-WORKGROUPS: I Add a new WorkGroup as {string}")
	public void admin_workgroups_i_add_a_new_work_group_as(String workGroupName) {
		impl.workGroup.addWorkGroup(workGroupName);
	}

	@Then("ADMIN-WORKGROUPS: I verify that WorkGroup {string} Message")
	public void admin_workgroups_i_verify_that_work_group_message(String message) throws InterruptedException {
		impl.workGroup.verifyMessage(message);
	}

	@Then("ADMIN-WORKGROUPS: I edit {string} WorkGroup Name")
	public void admin_workgroups_i_edit_work_group_name(String workGroupName) throws InterruptedException {
		impl.workGroup.editWorkGroup(workGroupName);
	}

	@Then("ADMIN-WORKGROUPS: I remove {string} WorkGroup Name")
	public void admin_workgroups_i_remove_work_group_name(String workGroupName) throws InterruptedException {
		impl.workGroup.removeWorkGroup(workGroupName);
	}

	@Given("ADMIN-IMPORTSERVICES: I click on Import Services link")
	public void admin_importservices_i_click_on_import_services_link() {
		impl.importService.navigateToImportServicesPage();
	}

	@Given("ADMIN-IMPORTSERVICES: I add new Import Service withe below details:")
	public void admin_importservices_i_add_new_import_service_withe_below_details(DataTable dataTable) {
	    ImportServices.importServiceMap =dataTable.asMap(String.class,String.class);
	    System.out.println(ImportServices.importServiceMap);
	    impl.importService.addNewImportServices();
	   
	}

	@Then("ADMIN-IMPORTSERVICES: I verify that ImportService {string} Message")
	public void admin_importservices_i_verify_that_import_service_message(String message) throws InterruptedException {
		impl.importService.verifyMessage(message);
	}

	@Then("ADMIN-IMPORTSERVICES: I Activate newly added Import service")
	public void admin_importservices_i_activate_newly_added_import_service() {
		impl.importService.activateImportService();
	}

	@Then("ADMIN-IMPORTSERVICES: I edit newly added Import service")
	public void admin_importservices_i_edit_newly_added_import_service() {
		impl.importService.editImportService();
	}

	@Then("ADMIN-IMPORTSERVICES: I Deactivate newly added Import service")
	public void admin_importservices_i_deactivate_newly_added_import_service() {
		impl.importService.deActivateImportService();
	}

	@Then("ADMIN-IMPORTSERVICES: I Remove newly added Import service")
	public void admin_importservices_i_remove_newly_added_import_service() {
		impl.importService.removeImportService();
	}
	
	@Given("ADMIN-ROLES: I click on Roles link")
	public void admin_roles_i_click_on_roles_link() {
		impl.roles.navigateToRolesPage();
	}

	@Given("ADMIN-ROLES: I add a new Role as {string}")
	public void admin_roles_i_add_a_new_role_as(String roleName) throws InterruptedException {
		impl.roles.addRole(roleName);
	}

	@Then("ADMIN-ROLES: I verify that Role {string} Message")
	public void admin_roles_i_verify_that_role_message(String status) throws InterruptedException {
		impl.roles.verifyMessage(status);
	}

	@Then("ADMIN-ROLES: I edit {string} Role Name")
	public void admin_roles_i_edit_role_name(String roleName) {
		impl.roles.editRole(roleName);
	}

	@Then("ADMIN-ROLES: I remove {string} Role Name")
	public void admin_roles_i_remove_role_name(String roleName) {
		impl.roles.removeRole(roleName);
	}
	
	@Given("ADMIN-READINGTYPES: I click on Reading Types link")
	public void admin_readingtypes_i_click_on_reading_types_link() {
		impl.readingTypes.navigateToReadingTypesPage();
	}

	@Given("ADMIN-READINGTYPES: I create new Reading Types with below Details:")
	public void admin_readingtypes_i_create_new_reading_types_with_below_details(DataTable dataTable) {
		ReadingTypes.readingTypesMap= dataTable.asMap(String.class, String.class);
		impl.readingTypes.addNewReadingType();
	   
	}
	
	@Given("ADMIN-TASKOVERVIEW: I click on Task Overview link")
	public void admin_taskoverview_i_click_on_task_overview_link() {
		impl.taskOverview.navigateToTaskOverviewPage();
	}

	@Given("ADMIN-TASKOVERVIEW: I apply and Verify Task Overview filter with Queue type as {string}")
	public void admin_taskoverview_i_apply_and_verify_task_overview_filter_with_queue_type_as(String queueName) throws InterruptedException {
		impl.taskOverview.applyAndVerifyTaskOverviewFilter(queueName);
	}
	
	@Given("ADMIN-RELATIVEPERIOD: I click on Relative Periods link")
	public void admin_relativeperiod_i_click_on_relative_periods_link() {
		impl.relativePeriod.navigateToRelativePeriodsPage();
	}

	@Given("ADMIN-RELATIVEPERIOD: I add a new Relative Period")
	public void admin_relativeperiod_i_add_a_new_relative_period() {
		impl.relativePeriod.addNewRealtivePeriod();
	}

	@Then("ADMIN-RELATIVEPERIOD: I verify that Relative Period {string} Message")
	public void admin_relativeperiod_i_verify_that_relative_period_message(String status) throws InterruptedException {
		impl.relativePeriod.verifyMessage(status);
	}

	@Then("ADMIN-RELATIVEPERIOD: I edit newly added Relative Period")
	public void admin_relativeperiod_i_edit_newly_added_relative_period() {
		impl.relativePeriod.editRelativePeriod();
	}

	@Then("ADMIN-RELATIVEPERIOD: I remove newly added Relative Period")
	public void admin_relativeperiod_i_remove_newly_added_relative_period() {
		impl.relativePeriod.removeRelativePeriod();
	}

	@Given("ADMIN-WEBSERVICEENDPOINT: I click on WebService EndPoints link")
	public void admin_webserviceendpoint_i_click_on_web_service_end_points_link() {
		impl.webService.navigateToWebServicesEndPointPage();
	}

	@Given("ADMIN-WEBSERVICEENDPOINT: I add a new WebService EndPoint with below details:")
	public void admin_webserviceendpoint_i_add_a_new_web_service_end_point_with_below_details(DataTable dataTable) {
	   WebServiceEndPoint.webServiceEndPointMap = dataTable.asMap(String.class, String.class);
	   System.out.println(WebServiceEndPoint.webServiceEndPointMap);
	   impl.webService.addNewWebServiceEndPoint();
	}

	@Then("ADMIN-WEBSERVICEENDPOINT: I verify that WebService EndPoint {string} Message")
	public void admin_webserviceendpoint_i_verify_that_web_service_end_point_message(String status) throws InterruptedException {
		impl.webService.verifyMessage(status);
	}

	@Then("ADMIN-WEBSERVICEENDPOINT: I activate WebService EndPoint")
	public void admin_webserviceendpoint_i_activate_web_service_end_point() {
		impl.webService.activateWebServiceEndPoint();
	}

	@Then("ADMIN-WEBSERVICEENDPOINT: I edit newly added WebService EndPoint")
	public void admin_webserviceendpoint_i_edit_newly_added_web_service_end_point() {
		impl.webService.editWebServiceEndPoint();
	}

	@Then("ADMIN-WEBSERVICEENDPOINT: I remove newly added WebService EndPoint")
	public void admin_webserviceendpoint_i_remove_newly_added_web_service_end_point() {
		impl.webService.removeWebServiceEndPoint();
	}

	@Given("ADMIN-CUSTOMATTRIBUTESET: I click on Custom Attribute Set link")
	public void admin_customattributeset_i_click_on_custom_attribute_set_link() {
		impl.customAttributeSet.navigateToCustomAttributeSetPage();
	}

	@Given("ADMIN-CUSTOMATTRIBUTESET: I apply and verfiy filter with Custom Attribute as Register")
	public void admin_customattributeset_i_apply_and_verfiy_filter_with_custom_attribute_as_register() {
		impl.customAttributeSet.applyAndVerifyFilterAsRegister();
	}


	@Given("ADMIN-DATAPURGE: I click on Data Purge Setting link")
	public void admin_datapurge_i_click_on_data_purge_setting_link() {
	  impl.dataPurge.navigateToDataPurgeSettingsPage();
	}

	@Given("ADMIN-DATAPURGE: I update the Data Purge Settings")
	public void admin_datapurge_i_update_the_data_purge_settings() throws InterruptedException {
	  impl.dataPurge.updateDataPurgeSettings();
	}

	@Given("ADMIN-DATAPURGE: I reset the Data Purge Settings")
	public void admin_datapurge_i_reset_the_data_purge_settings() throws InterruptedException {
	   impl.dataPurge.resetDataPurgeSettings();
	}

	@Given("ADMIN-DATAPURGE: I click on Data Purge History link")
	public void admin_datapurge_i_click_on_data_purge_history_link() {
	  impl.dataPurge.navigateToDataPurgeHistoryPage();
	}

	@Given("ADMIN-DATAPURGE: I verfiy Data Purge History Page")
	public void admin_datapurge_i_verfiy_data_purge_history_page() {
	   impl.dataPurge.verifyDataPurgeHistoryPage();
	}

	@Given("ADMIN-IMPORTSERVICES: I click on Import History link")
	public void admin_importservices_i_click_on_import_history_link() {
	    impl.importService.navigateToImportHistoryPage();
	}

	@Then("ADMIN_IMPORTSERVICES: I verify Import history page")
	public void admin_importservices_i_verify_import_history_page() {
	   impl.importService.verifyImportHistoryPage();
	}
	
	@Given("ADMIN-IMPORTSERVICES: I activate {string} Import services")
	public void admin_importservices_i_activate_import_services(String importService) {
	   impl.importService.activateImportService(importService);
	}

	@Given("ADMIN-IMPORTUPLOADFILESERVICES: I click on Upload File for Importer link")
	public void admin_importuploadfileservices_i_click_on_upload_file_for_importer_link() {
	  impl.importService.navigateToUploadFileForImportServicesPage();
	}

	@Given("ADMIN-IMPORTUPLOADFILESERVICES: I upload a file for {string} Importer service")
	public void admin_importuploadfileservices_i_upload_a_file_for_importer_service(String importService) throws AWTException, InterruptedException {
	    impl.importService.uploadImportFile(importService);
	}

	@Then("ADMIN-IMPORTUPLOADFILESERVICES: I verify Message after file upload")
	public void admin_importuploadfileservices_i_verify_message_after_file_upload() throws InterruptedException {
	   impl.importService.verfiyUploadFileMessage();
	}

	@Then("ADMIN-IMPORTSERVICES: I Deactivate {string} Import services")
	public void admin_importservices_i_deactivate_import_services(String importService) {
	    impl.importService.DeactivateImportService(importService);
	    
	}
	
	@Given("ADMIN-USERDIRECTORY: I click on UserDirectory link")
	public void admin_userdirectory_i_click_on_user_directory_link() {
	    impl.userDirectory.navigateToUserDirectoryPage();
	}

	@Given("ADMIN-USERDIRECTORY: I add new UserDirectory withe below details:")
	public void admin_userdirectory_i_add_new_user_directory_withe_below_details(DataTable dataTable) {
	    UserDirectory.userDirectoryMap = dataTable.asMap(String.class, String.class);
	    impl.userDirectory.AddUserDirctory();
	}

	@Then("ADMIN-USERDIRECTORY: I verify that UserDirectory {string} Message")
	public void admin_userdirectory_i_verify_that_user_directory_message(String status) throws InterruptedException {
	   impl.userDirectory.verifyMessage(status);
	}

	@Then("ADMIN-USERDIRECTORY: I edit newly added UserDirectory")
	public void admin_userdirectory_i_edit_newly_added_user_directory() {
	   impl.userDirectory.editUserDirectory();
	}

	@Then("ADMIN-USERDIRECTORY: I Remove newly added UserDirectory")
	public void admin_userdirectory_i_remove_newly_added_user_directory() {
	    impl.userDirectory.removeUserDirectory();
	}
	
	@Given("ADMIN-KEYPAIRS: I click on Keypairs links")
	public void admin_keypairs_i_click_on_keypairs_links() {
	   impl.keyPairs.navigateToKeyPairsPage();
	}

	@Given("ADMIN-KEYPAIRS: I Generate a New Key pair with below details:")
	public void admin_keypairs_i_generate_a_new_key_pair_with_below_details(DataTable dataTable) throws InterruptedException {
		KeyPairs.keyPairsMap = dataTable.asMap(String.class, String.class);
	    impl.keyPairs.generateKeyPair();
	}

	@Then("ADMIN-KEYPAIRS: I verify that Generate Keypair {string} Message")
	public void admin_keypairs_i_verify_that_generate_keypair_message(String status) throws InterruptedException {
	  impl.keyPairs.verifyMessage(status);
	}

	@Then("ADMIN-KEYPAIRS: I download newly created publicKey")
	public void admin_keypairs_i_download_newly_created_public_key() {
	  impl.keyPairs.downloadPublicKey();
	}

	@Then("ADMIN-KEYPAIRS: I remove newly created public Key")
	public void admin_keypairs_i_remove_newly_created_public_key() {
	    impl.keyPairs.removeKeyPair();
	}

}

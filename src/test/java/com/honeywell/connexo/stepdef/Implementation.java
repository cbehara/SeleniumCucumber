package com.honeywell.connexo.stepdef;

import com.honeywell.connexo.AdminImplimentation.Calendar;
import com.honeywell.connexo.AdminImplimentation.CustomAttributeSet;
import com.honeywell.connexo.AdminImplimentation.DataPurge;
import com.honeywell.connexo.AdminImplimentation.ImportServices;
import com.honeywell.connexo.AdminImplimentation.KeyPairs;
import com.honeywell.connexo.AdminImplimentation.Processes;
import com.honeywell.connexo.AdminImplimentation.ReadingTypes;
import com.honeywell.connexo.AdminImplimentation.RelativePeriods;
import com.honeywell.connexo.AdminImplimentation.Roles;
import com.honeywell.connexo.AdminImplimentation.TaskOverview;
import com.honeywell.connexo.AdminImplimentation.UserDirectory;
import com.honeywell.connexo.AdminImplimentation.WebServiceEndPoint;
import com.honeywell.connexo.AdminImplimentation.WorkGroups;

public class Implementation {
	
	Calendar adminCalendar =new Calendar();
	Processes processes= new Processes();
	WorkGroups workGroup =new WorkGroups();
	ImportServices importService = new ImportServices();
	Roles roles = new Roles();
	ReadingTypes readingTypes = new ReadingTypes();
	TaskOverview taskOverview =new TaskOverview();
	RelativePeriods relativePeriod =new RelativePeriods();
	WebServiceEndPoint webService =new WebServiceEndPoint();
	CustomAttributeSet customAttributeSet = new CustomAttributeSet();
	DataPurge dataPurge = new DataPurge();
	UserDirectory userDirectory = new UserDirectory();
	KeyPairs keyPairs = new KeyPairs(); 

}

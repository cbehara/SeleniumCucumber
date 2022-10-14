package com.honeywell.connexo.runner;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.WildcardFilter;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.honeywell.connexo.base.Base;
import com.honeywell.connexo.utils.DateTimeHelper;
import com.honeywell.connexo.utils.PathHelper;
import com.honeywell.connexo.utils.Shared;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CucumberRunner extends Base {
	
	private static Logger log = Logger.getLogger(CucumberRunner.class);
	
	
	public CucumberRunner() {
		
	}
	
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This Method is used for before Suite
	 * @param istx
	 */
	@BeforeSuite
	public void beforeSuite(ITestContext istx) {
		try {
			System.err.println("********************* Before Suite -XML ***********************************");
			//istx.getSuite().getParallel();
			Base.startTime=DateTimeHelper.currentDateAndTime();
			System.out.println("Start Time: "+startTime);
			Base.suiteName = istx.getSuite().getName();
			System.out.println("Suite Name: "+suiteName);
			cucumberReportPath=getCucumberResultPath();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
	

	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This method will execute before testng.xml file execution
	 * @param ctx
	 * @param FeatureName
	 * @param RunAgainst
	 * @param browser
	 * @param username
	 * @param password
	 * @param MailList 
	 */
	@Parameters({"FeatureName","RunAgainst","Browser","UserName","Password","MailList"})
	@BeforeTest
	public void beforeTest(ITestContext ctx, String FeatureName, String RunAgainst, String browser, String username, String password, String MailList) {
		
		try {
			System.err.println("************************** Before Test Method -XML **********************************");
			Base.featureName=FeatureName;
			Base.feature=Shared.splitAndConvertToListString(FeatureName, "/").get(Shared.splitAndConvertToListString(FeatureName ,"/").size()-1);
			Base.userName=username;
			Base.password=password;
			Base.sRunAgainst=RunAgainst;
			Base.mailList=MailList;
			Base.sTestName=ctx.getName();
			System.out.println("Before test TESTNG "+Thread.currentThread().getId());
			
			//Configuration Starts Here
			Base.sRunAgainst=System.getProperty("envparam")!=null ? System.getProperty("envparam") : ctx.getCurrentXmlTest().getParameter("RunAgainst");
			Base.userName=System.getProperty("usernameparam")!=null ? System.getProperty("usernameparam") : ctx.getCurrentXmlTest().getParameter("UserName");
			Base.password=System.getProperty("passwordparam")!=null ? System.getProperty("passwordparam") : ctx.getCurrentXmlTest().getParameter("Password");
			Base.browser=System.getProperty("browserparam")!=null ? System.getProperty("browserparam") : ctx.getCurrentXmlTest().getParameter("Browser");
			Base.mailList=System.getProperty("mailparam")!=null ? System.getProperty("mailparam") : ctx.getCurrentXmlTest().getParameter("MailList");
			System.out.println("SRunAgainst: "+Base.sRunAgainst);
			System.out.println(Base.featureName+ " " +Base.browser +" "+Base.sRunAgainst);
			System.out.println("Executing Feature File from : "+Base.featureName);
			
			
			//removeSeleniumSession();
			
			Base.getDriver();
			Base.driver.manage().deleteAllCookies();
			Base.maximizeWindow();
			//Base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			extent = getCucumberReport();
			
			feature_result_map.put("Total", 0);
			feature_result_map.put("Pass", 0);
			feature_result_map.put("Fail", 0);
			
		
			
		}
		catch(Exception e) {
			System.out.println("Before Test:: Exception occured while Executing feature: "+ctx.getCurrentXmlTest().getParameter(FeatureName));
			log.info("Before Test:: Exception occured while Executing feature: "+ctx.getCurrentXmlTest().getParameter(FeatureName));
			e.printStackTrace();
		}
	}
	
	
	// * -------------------************* Cucumber Test Method *************-------------------*
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This Method is used for the passing of all cucumber options
	 * @param istx
	 * @return
	 */
	public String[] OptionsSpecification(ITestContext istx) {
		List<String> runParams = new ArrayList<String>();
		
		try {
			String tags="";
			String ProjectPath= PathHelper.getProjectPath(CucumberRunner.class.getProtectionDomain().getCodeSource().getLocation().getPath());
			runParams.add(ProjectPath+"src/test/resources/FeatureFiles/"+Base.featureName);
			System.out.println("Feature RunTime: "+runParams.get(0));
			runParams.add("--glue");
			runParams.add("classpath:com/honeywell/connexo/stepdef");
			  runParams.add("--glue");
			  runParams.add("classpath:com/honeywell/connexo/runner");
			  runParams.add("--plugin");
			  runParams.add("json:target/cucumberReport.json");
			if(System.getProperty("tagsparam")!=null) {
				runParams.add("--tags");
				runParams.add(System.getProperty("tagsparam"));
				System.out.println(System.getProperty("tagsparam"));
			}
			else
			{
				tags = istx.getCurrentXmlTest().getParameter("tags");
				if(!(tags==null)) {
					if(!tags.equals("")) {
						runParams.add("--tags");
						runParams.add(tags);
						System.out.println(tags);
					}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(runParams.toString());
		return runParams.toArray(new String[runParams.size()]);
	}
	
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This method is used to execute the required feature file given in TestNG.xml file
	 * @param istx
	 * @throws Throwable
	 */
	@Test(groups="example-testng", description= "Example of using TestNG Cucumber to invoke cucumber")
	public void runCukes(ITestContext istx) throws Throwable {
		try {
			System.err.println("*************************************** Test Method -XML **************************************");
			RunningOfCukes(OptionsSpecification(istx));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// ********************* Before Scenario ********************************
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This method will execute before each scenario execution
	 * @param scenario
	 */
	@Before
	public void beforeScenario(Scenario scenario) {
		System.err.println("************************* Before Scenario ************************");
		PropertyConfigurator.configure(PathHelper.getResourcePath("/src/main/resources/Config/log4j.properties"));
		Base.strScenarioName= scenario.getName();
		log.info("Scenario Started: "+scenario.getName());
		Base.startCucumberTestReport(scenario.getName());
	}
	
	
	// ****************************** After Scenario ******************************
	/***
	 * @author Dileep.Mothe@Honeywell.com 
	 * This method will trigger after each scenario execution
	 * @param scenario
	 */
	@After
	public void afterScenario(Scenario scenario) {
		System.err.println("**************************************** After Scenario **********************");
		log.info("Scenario Completed: "+scenario.getName());
		log.info("Scenario Status: "+scenario.getStatus());
		Base.endCucumberTestReport();
	}
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This Method used for After Test execution
	 * @param ctx
	 */
	
	@AfterTest
	public void afterTest(ITestContext ctx) {
		try {
			System.err.println("********************** After Test Method -XML ************************");
			Base.quit();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			Base.result_map.put(Base.feature, new HashMap<String,Integer>(feature_result_map));
			feature_result_map.put("Total", 0);
			feature_result_map.put("Pass", 0);
			feature_result_map.put("Fail", 0);
			total=0;
			pass=0;
			fail=0;
		}
		}
	
	
	// ******************************** After Suite **********************************
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * This method is used for After Suite Execution
	 * @param ctx
	 */
	@AfterSuite
	public void afterSuite(ITestContext ctx) {
		System.err.println("**************************** After Suite - XML *********************************");
		Base.endTime = DateTimeHelper.currentDateAndTime();
		System.out.println("End Time :"+endTime);
		//Base.duration= DateTimeHelper.getDuration(startTime, endTime);
		System.out.println("Result Map ->"+result_map);
		filesArray = Shared.getAllFiles(cucumberReportPath);
		for(int i=0;i<filesArray.size();i++)
			filesArray.get(i).toString();
		
		
		// you can write code for sending email need to develop Mail.java class
	}
	
	/**
	 * This method is used to delete all the session sessions
	 */
	public static void removeSeleniumSession() {
		System.out.println("Cleaning all temp files");
		ArrayList<String> profileDirs = new ArrayList<String>();
		profileDirs.add("anonymous*webdriver-profile");
		profileDirs.add("userprofile*copy");
		profileDirs.add("SeleniumSslSupport");
		File tmpDir= new File(System.getProperty("java.io.tempdir"));
		FilenameFilter profileDirsFilter= new WildcardFilter(profileDirs);
		File[] files= tmpDir.listFiles(profileDirsFilter);
		for(File profileDir : files) {
			try {
				FileUtils.deleteDirectory(profileDir);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

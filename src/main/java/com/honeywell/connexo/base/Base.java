package com.honeywell.connexo.base;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.log4testng.Logger;

import com.honeywell.connexo.config.Environment;
import com.honeywell.connexo.config.PropertyFileReader;
import com.honeywell.connexo.config.RunStatus;
import com.honeywell.connexo.config.ScreenShot;
import com.honeywell.connexo.utils.PathHelper;
import com.honeywell.connexo.utils.Util;
import com.honeywell.connexo.utils.Waits;
import com.honeywell.connexo.utils.XMLUpdate;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.core.cli.Main;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends Util {

	private static Logger log = Logger.getLogger(Base.class);
	public static PropertyFileReader pr = new PropertyFileReader();

	public static ExtentTest extentTest;
	public static ExtentReports extent;

	public static String cucumberReport;
	public static String cucumberReportPath;
	public static String suiteName;
	public static String sRunAgainst;
	public static String machineIP;
	public static String browserVersion;
	public static String version;
	public static String browser;
	public static String strScenarioName;
	public static String sTestName;
	public static String featureName;
	public static String feature;
	public static String userName;
	public static String password;
	public static String startTime;
	public static String endTime;
	public static String duration;
	public static String mailList;
	public static ArrayList<File> filesArray;
	public static int pass;
	public static int fail;
	public static int total;

	public static Map<String, Map<String, Integer>> result_map = new HashMap<String, Map<String, Integer>>();
	public static Map<String, Integer> feature_result_map = new HashMap<String, Integer>();

	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @Description This Method is used for starting of a browser based on passed browser name
	 */
	public static void startBrowser() {
		try {
			switch (Base.browser.toUpperCase()) {

			case "CHROME":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "FIREFOX":
			case "FF":
				WebDriverManager.firefoxdriver().setup();
				System.setProperty("java.net.preferIPv4Stack", "true");
				FirefoxOptions ffOptions = new FirefoxOptions();
				if (pr.getHeadlessStatus())
					ffOptions.setHeadless(true);
				ffOptions.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
				ffOptions.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pem");
				DesiredCapabilities capability = new DesiredCapabilities();
				capability.setCapability("gecko.driver", false);
				capability.setCapability("marionette", true);
				capability.setCapability(FirefoxOptions.FIREFOX_OPTIONS, ffOptions);
				ffOptions.merge(capability);
				driver = new FirefoxDriver(ffOptions);
				break;

			case "EDGE":

				WebDriverManager.edgedriver().setup();
				System.setProperty("java.net.preferIPv4Stack", "true");
				EdgeOptions options = new EdgeOptions();
				if (!pr.getHeadlessStatus()) {
					options.addArguments("--start-maximized");
					options.addArguments("--no-sandbox");
					options.addArguments("--disable-plugins", "--disable-extensions");
				} else {
					options.addArguments("window-size=1400,800");
					options.addArguments("--no-sandbox");
					options.addArguments("--disable-plugins", "--disable-extensions");
					options.addArguments("headless");
					options.addArguments("disable-gpu");
				}

				options.setAcceptInsecureCerts(true);
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
				cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
				cap.setCapability(ChromeOptions.CAPABILITY, options);
				options.merge(cap);
				driver = new EdgeDriver(options);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Exception thrown unable to start the browser and error message is :" + e.getMessage());
		}

	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @Description This Method is used for Maximizing the window
	 */
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @Description This Method is used for checking the webdriver already running or not
	 */
	public static boolean isStarted() {
		return driver!= null;
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @Description This Method is used for returning the driver object
	 */
	public static WebDriver getDriver() {
		if(!isStarted()) {
		startBrowser();
		}
		return driver;
		
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @Description This Method is used for navigate to Connexo Application Based on Environment
	 */
	public static void navigateToUrl() throws InterruptedException {
		Waits.wait(5000);
		driver.get(Environment.DEV);
		Base.addResult("Navigate to Connexo URL", "Navigate to Connexo URL: "+Environment.DEV, "Navigate to Connexo URL successfully", "Navigated to Connexo URL successfully", RunStatus.PASS);
		
	}
	
	/***
	 *@author Dileep.Mothe@Honeywell.com
	 * @Description This Method is used for Attaching step log based on run 
	 * @param testcase
	 * @param desc
	 * @param expected
	 * @param actual
	 * @param status
	 * @param screenshotFileName
	 */
	public static void addCucumberReportStepLog(String testcase, String desc, String expected, String actual,
			byte status, String... screenshotFileName) {
		try {
			if(status==0) {
				String base64ScreenShot = "data:image/png;base64,"
						+((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
				extentTest.log(LogStatus.FAIL, "<b>TEST CASE:</b>" +testcase + "\n<br><b>DESCRIPTION:</b>"+desc
						+"\n<br><b>EXPECTED:</b>"+expected +"\t \r <b>ACTUAL:</b>"+ actual);
				if(screenshotFileName.length>0 && !screenshotFileName[0].equalsIgnoreCase("")) 
					extentTest.log(LogStatus.INFO, testcase, extentTest.addBase64ScreenShot(base64ScreenShot));
		    }
			else {
				extentTest.log(LogStatus.PASS,"<b>TEST CASE:</b>" +testcase + "\n<br><b>DESCRIPTION:</b>"+desc
						+"\n<br><b>EXPECTED:</b>"+expected +"\t \r <b>ACTUAL:</b>"+ actual);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @Description This Method is used for Adding a result
	 */
	
	public static void addResult(String testcase,String desc,String expected,String actual, byte status) {
		feature_result_map.put("Total", ++total);
		if(status==1) {
			feature_result_map.put("Pass", ++pass);
		    log.info("****************** Test Step PASSED : "+testcase);
		}
		else {
			feature_result_map.put("Fail", ++fail);
		    log.info("****************** Test Step FAILED : "+testcase);
		
		}
		addCucumberReportStepLog(testcase, desc, expected, actual, status);
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @Description This Method is used for Adding a result with screenshot in case of failure
	 */
	public static void addResult(String testcase,String desc,String expected,String actual, byte status, String screenShotFileName) {
        feature_result_map.put("Pass", ++pass);
		feature_result_map.put("Fail", ++fail);
		log.info("****************** Test Step FAILED : "+testcase);
		addCucumberReportStepLog(testcase, desc, expected, actual, status, screenShotFileName);
	}
	
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to close all browser instances
	 */
	public static void quit() {
		try {
			if(isStarted()) {
				driver.quit();
				driver =null;
				log.info("Browser has closed successfully");
				Base.addResult("Close Browser", "Close Browser", "Browser should close successfully", "Browser has closed successfully", RunStatus.PASS);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			Base.addResult("Close Browser", "Close Browser", "Browser should close successfully", "Browser is not getting closed getting exception and error message is : "+e.getMessage(), RunStatus.FAIL, ScreenShot.getScreenShot(driver, ""));
		}
	}
	
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to get the cucumber result path
	 */
	public static String getCucumberResultPath() {
		DateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String date_time=dateFormat.format(date).replace(":", "").replace(" ", "");
		cucumberReportPath=PathHelper.getBasePath()+"\\test-output\\"+Base.suiteName+date_time+"\\";
		return cucumberReportPath;
	}
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is used to putting some details in Extent Report
	 */
	public ExtentReports getCucumberReport() {
		cucumberReport =cucumberReportPath+Base.suiteName.replace(".feature", "")+".html";
		if(extent==null) {
			XMLUpdate.XMLFileUpdate_ExtentConfig();
			extent= new ExtentReports(cucumberReport);
			extent.addSystemInfo("Environment", Base.sRunAgainst);
			extent.addSystemInfo("Browser",Base.browser);
			extent.addSystemInfo("UserName",Base.userName);
			extent.addSystemInfo("ConnexoBuildNumber",pr.getBuildNumber());
			extent.addSystemInfo("Java Version","1.8");
			extent.loadConfig(new File(pr.getReportConfigPath()));
			
		}
		return extent;
	}
	
	public synchronized static ExtentTest startCucumberTestReport(String testName) {
		extentTest= extent.startTest(testName).assignCategory(Base.sTestName);
		return extentTest;
	}
	
	
	public synchronized static void endCucumberTestReport() {
		extent.endTest(extentTest);
		extent.flush();
	}
	
	public static int getStepCount(String step_name) {
		int count=0;
		for(String key : result_map.keySet()) {
			count = count +result_map.get(key).get(step_name);
		}
		return count;
	}
	
	
	public static void addInfo(String info, String desc) {
		info ="INFO: "+info;
		log.info(info);
		extentTest.log(LogStatus.INFO, info+desc);
	}
	
	
	/***
	 * @author Dileep.Mothe@Honeywell.com
	 * @description This Method is the actual run of Cucumber
	 */
	public void RunningOfCukes(String[] argv) {
		run(argv,Thread.currentThread().getContextClassLoader());
	}
		
	
	/**
	 * Launches the Cucumber JVM Command Line
	 * @param argv
	 * @param classLoader
	 * @return
	 */
	
	public static byte run(String[] argv, ClassLoader classLoader) {
		
		return Main.run(argv, classLoader);
    }
	

}

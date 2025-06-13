package com.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 1. Call this from xml file (ExtentReportDemo.xml) 
  	   Eg:- <listeners> <listener class-name="com.qa.utils.ExtentReportManager" />   </listeners>
 2. Every call class should include [ @Listeners(com.testng.demo.Test09listener.class) ] above the class name.
 3. Run the XML file and report will generate in [report] folder.
 */
public class ExtentReportManager {
	
    public static ExtentSparkReporter sparkReporter;//UI of the report
    public static ExtentReports extent; // populate common info on the report
    public ExtentTest test; //creating test case entries in the report& update status of the test methods.
 

    public static ExtentReports getInstance() {
    	sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/extentReport-Std.html");
     	
    	sparkReporter.config().setDocumentTitle("Automation Report");
    	sparkReporter.config().setReportName("Functional Testing");
    	//sparkReporter.config().setTheme(Theme.DARK);
    	sparkReporter.config().setTheme(Theme.STANDARD);
    	
    	extent=new ExtentReports();
    	extent.attachReporter(sparkReporter);
    	
    	extent.setSystemInfo("Computer Name", "localhost");
    	extent.setSystemInfo("Environment", "QA");
    	extent.setSystemInfo("TesterName", "John");
    	extent.setSystemInfo("os", "Window11");
    	extent.setSystemInfo("Browser name", "Chrome");
    	return extent;
    	
    }
 
    
}
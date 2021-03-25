package ExtentReport_Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportBasicDemo {

	public void testExtentReport() {
		// TODO Auto-generated method stub
		ExtentReports extent =new  ExtentReports();
		ExtentSparkReporter  spark= new ExtentSparkReporter("extentReport.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation ExtentReport");
		extent.attachReporter(spark);
		
		
		ExtentTest test=extent.createTest("Login Test");// create a test node
	    test.pass("Login to the application");
	    test.info("url is loaded");
	    test.info("enter password");
	    test.pass("Enter application successfully");
	
	    
		
		ExtentTest test1=extent.createTest("Home page Test");
	    test.pass("home page verified");
	    test.info("home loading");
	    test.fail("home page test successfully");
	    
	    extent.flush();// unless youcall this method, your report will not  be written with logs
	
	}

}

package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass_DemoWebShop implements Framework_constant
{
	public WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeMethod
	public void openApp(String browser) 
	{
		ExtentHtmlReporter report = new ExtentHtmlReporter("./reports/report.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(report);
		ExtentTest test = reports.createTest("test report");
		
		if(browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();		
			test.log(Status.INFO, "Browser is launched");
			driver.manage().timeouts().implicitlyWait(WAIT_TIME,TimeUnit.SECONDS);
			driver.get(URL);
		}
		else 
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new ChromeDriver();		
			test.log(Status.INFO, "Browser is launched");
			driver.manage().timeouts().implicitlyWait(WAIT_TIME,TimeUnit.SECONDS);
			driver.get(URL);
		}
		
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}

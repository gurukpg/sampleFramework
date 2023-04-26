package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TS_LoginInsta
{
	
	@Test
	public void login()
	{
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		PomLoginInsta pomLogin=new PomLoginInsta(driver);
		pomLogin.username().sendKeys("hi");
		pomLogin.password().sendKeys("hello");
		pomLogin.login().click();
		
		
	
	}
}

package scriptAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseClass_DemoWebShop;
import generic.DDT_DataProvider;

@Listeners(generic.ListenerClass.class)
public class TS_RegisterDemoWebShop extends BaseClass_DemoWebShop
{
	@Test(dataProvider = "userData",dataProviderClass = DDT_DataProvider.class)
	public void register(String fn,String ln,String mail,String pwd) 
	{
		WebDriverWait wait=new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Register']")))).click();
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(fn);
		driver.findElement(By.id("LastName")).sendKeys(ln);
		driver.findElement(By.id("Email")).sendKeys(mail);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(pwd);
		driver.findElement(By.id("register-button")).click();
		
	}
	
}
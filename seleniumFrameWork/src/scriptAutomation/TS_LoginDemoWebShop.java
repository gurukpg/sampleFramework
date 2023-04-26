package scriptAutomation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseClass_DemoWebShop;
import generic.DDT_DataProvider;
import pomClasses.PomLoginDemoWebShop;

@Listeners(generic.ListenerClass.class)
public class TS_LoginDemoWebShop extends BaseClass_DemoWebShop
{
	@Test(dataProvider = "usercred", dataProviderClass = DDT_DataProvider.class)
	public void Login(String un,String pwd) throws InterruptedException
	{
		PomLoginDemoWebShop pomlogin = new PomLoginDemoWebShop(driver);
	//Assert(hard) 	
		String title = driver.getTitle();
		Assert.assertEquals(title, "Demo Web Shop");
		Reporter.log("Home page is displayed");
		
		pomlogin.login_link().click();
		pomlogin.email().sendKeys(un);
		pomlogin.password().sendKeys(pwd);
		Thread.sleep(3000);
		pomlogin.login_btn().click();
		
		
		
	//	Assert.fail();
		
	//SoftAssert 
		String login_title=driver.getTitle();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(login_title,"Demo Web Shop. Login");
		Reporter.log("Login Page is displayed using Soft Assert");
		
		soft.assertAll();
		
		
				
	}
	
}
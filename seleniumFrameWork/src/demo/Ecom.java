package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ecom 
{
	@Test(priority = 1,groups = "smoke")
	public void signUP()
	{
		Reporter.log("framework start", true);
	}		
	
	@Test(priority = 2,groups = "system")
	public void login()
	{
		Reporter.log("Log in OK", true);
	}
	
	@Test(priority = 3,invocationCount = 4)
	public void cart()
	{
		Reporter.log("Cart added", true);
	}		
	
	@Test(priority = 4,dependsOnMethods = {"login","cart"})
	public void payment()
	{    
		Reporter.log("Payment Done", true);
	}
	
	@Test(priority = 5,enabled = false)
	public void logout()
	{
		Reporter.log("Framework Ends", true);
	}
}

package demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{
	@Test  
	public void print()
	{
		Reporter.log("framework start", true);
		Assert.fail();
	}
	
			
	@Test
	public void display()
	{
		Reporter.log("Framework Ends", true);
	}
	
}

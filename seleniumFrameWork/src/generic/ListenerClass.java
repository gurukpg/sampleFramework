package generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass extends BaseClass_DemoWebShop implements ITestListener
{
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test case is passed "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test case is Failed: "+result.getName());
		
		GenericScreenshots.getPhoto(this.driver,result);
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("test case skipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		System.out.println("test case is failed due to timeout ");
	}
	

}

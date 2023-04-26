package demo;

import org.testng.annotations.Test;

import generic.DDT_DataProvider;

public class TS_MultipleLoginDataInsta extends BaseclassInsta
{

	@Test(dataProvider = "userData" , dataProviderClass = DDT_DataProvider.class)
	public void script(String email,String pwd)
	{
		PomLoginInsta pomLogin=new PomLoginInsta(driver);
		pomLogin.username().sendKeys(email);
		pomLogin.password().sendKeys(pwd);
		pomLogin.login().click();
		//driver.navigate().refresh();
		
	}

}

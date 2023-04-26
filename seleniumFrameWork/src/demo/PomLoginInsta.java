package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginInsta
{
	@FindBy(id = "email")
	private WebElement user_name;
	@FindBy(name="pass")
	private WebElement pass_word;
	@FindBy(xpath = "//button[@name='login']")
	private WebElement login;
	
	public PomLoginInsta(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement username()
	{
		return user_name;
	}  
	public WebElement password()
	{
		return pass_word;
	}
	public WebElement login()
	{
		return login;
	}

	

}
package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginDemoWebShop 
{
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement login_link;
	
	@FindBy(name = "Email")
	private WebElement email;
	
	@FindBy(name = "Password")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement login_btn;
	
	public PomLoginDemoWebShop(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement login_link() 
	{
		return login_link;
	}
	public WebElement email()
	{
		return email;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement login_btn()
	{
		return login_btn;
	}
}

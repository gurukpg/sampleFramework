package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_SelectDropDown 
{
	public Select select_drop(WebElement drop)
	{
		Select sel = new Select(drop);
		return sel;
	}
	public void select_by_value(WebElement drop,String value)
	{
		select_drop(drop).selectByValue(value);
	}
}

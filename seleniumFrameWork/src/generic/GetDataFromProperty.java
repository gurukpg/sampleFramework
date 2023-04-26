package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class GetDataFromProperty
{
	@Test
	public static void GetData() throws IOException
	{
		FileInputStream fis = new FileInputStream("./propertyFiles/sampleData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String name=prop.getProperty("name");
		System.out.println(name);
	}
}
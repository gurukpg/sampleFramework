package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DDT_DataProvider 
{
	@DataProvider(name="userData")
	public String[] [] getData()
	{
		String[] [] userData= {{"guru","kp"},{"gurukp@gmail.com","gurukp"}};
		
		return userData;	
	}
	
	
		
	//get data from Excel sheet
	@DataProvider(name="usercred")
	public Object[][] getUserCred()
	{
		return getExcelData("Sheet1");		
	}
	
	public Object[][] getExcelData(String sheet)
	{
		FileInputStream fis=null;
		Sheet sht = null;
			
		try {
		fis = new FileInputStream("C:\\Users\\user\\Desktop\\TestDataDWS.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			sht = WorkbookFactory.create(fis).getSheet(sheet);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int actual_row = sht.getPhysicalNumberOfRows();
		int actual_cell=sht.getRow(0).getPhysicalNumberOfCells();
	//	System.out.println(actual_row);
	//	System.out.println(actual_cell);
	
		Object[][] data= new Object[actual_row-1][actual_cell];
		
		for(int i=1;i<actual_row;i++)
		{
			for(int j=0;j<actual_cell;j++)
			{
				data[i-1][j]=sht.getRow(i).getCell(j).toString();
			}
		}
	return data;
	}
}

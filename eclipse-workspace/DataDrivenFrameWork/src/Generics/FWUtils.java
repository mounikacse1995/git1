package Generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FWUtils extends BaseTest{
	
public static void verifyPage(WebDriver driver,String expTitle)
{
	String actTitle=driver.getTitle();
	if(expTitle.contentEquals(actTitle))
	{
		System.out.println("expected page is displayed "+expTitle);
	}
	else
	{
		System.out.println("expected page is not displayed "+actTitle);
	}
}
/**
 * This Method Use To Read The Data From The Excel
 * @param path
 * @param sheet
 * @param row
 * @param cell
 * @return 
 * @return
 * @throws EncryptedDocumentException
 * @throws FileNotFoundException
 * @throws IOException
 */
public static String readXlData(String path,String sheet,int row,int cell)
{/**
	 * This Method is Used to Verify The page.
	 * @param driver
	 * @param expectedTitle
	 */
	String data="";
	try
	{
	Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	 data= wb.getSheet(sheet).getRow(row).getCell(cell).toString();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return data;	
}
public static int xl_RowCount(String path,String sheet)
{
	int rc=0;
	try
	{
	Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	rc=wb.getSheet(sheet).getLastRowNum();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return rc;
}
/**
 * This Method is Created For Specifying ExplicitWaiting Conditions
 * @param wait
 * @return
 */

public static WebDriverWait waitingCondition(WebDriverWait wait)
{
	return new WebDriverWait(driver,ETO);
}

}

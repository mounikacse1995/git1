package Scripts;

import Generics.BaseTest;
import Generics.FWUtils;
import Pages.LoginPage;

public class TestValidLoginPage extends BaseTest {
	public static void main(String args[]) throws InterruptedException
	{
		
	
	String un = FWUtils.readXlData(EXCEL_PATH,"sheet2",1,0);
	String pw = FWUtils.readXlData(EXCEL_PATH,"sheet2",1,1);
	String expectedTitle = FWUtils.readXlData(EXCEL_PATH,"sheet2",1,2);
			
	openApplication("chrome");
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(un);
	lp.setPassWord(pw);
	lp.clickOnLgnBTN();
	Thread.sleep(2000);
	FWUtils.verifyPage(driver,expectedTitle);
			
	BaseTest.closeApplication();
	
}
	}

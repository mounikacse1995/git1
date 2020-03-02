import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01 {

@Test
public void test1()
{
	WebDriverManager.chromedriver().version("79").setup();
 WebDriver driver=new ChromeDriver();
 driver.get("http://www.selenium.dev");
 System.out.println(driver.getTitle());
 driver.close();
}
}

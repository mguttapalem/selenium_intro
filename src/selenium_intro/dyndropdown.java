package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dyndropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://spicejet.com/");
		 driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 driver.findElement(By.xpath("//a[@value='GOI']")).click();
		 driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		 driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
	}

}

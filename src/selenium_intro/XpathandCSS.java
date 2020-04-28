package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathandCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://login.salesforce.com");
		/* driver.findElement(By.xpath("//*[@id='username']")).sendKeys("manasareddy525@gmail.com");
		 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Manu@1436$");
		 driver.findElement(By.xpath("//*[@id='Login']")).click();
		 driver.close(); */
		 
		/* driver.findElement(By.cssSelector("input#username")).sendKeys("manasareddy525@gmail.com");
		 driver.findElement(By.cssSelector("input#password")).sendKeys("Manu@1436$");
		 driver.findElement(By.cssSelector("input#Login")).click(); */
		 
		 driver.findElement(By.xpath("//*[contains(@class,'username')]")).sendKeys("manasareddy525@gmail.com");
		 driver.findElement(By.xpath("//*[contains(@class,'password')]")).sendKeys("Manu@1436$");
		// driver.findElement(By.xpath("//*[contains(@id,'Log')]")).click();
		 driver.findElement(By.cssSelector("input[class*='button']")).click();
		 
		 
	}

}

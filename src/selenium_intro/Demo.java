package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
		 //driver.navigate().to("http://yahoo.com");
	 //driver.navigate().back();
	 //driver.navigate().forward();
		/* driver.get("http://yahoo.com");
	 //driver.findElement(By.id("uh-search-box")).sendKeys("selenium");
	 //driver.findElement(By.id("uh-search-button")).click();
	 driver.findElement(By.id("uh-signin")).click();
	 //driver.findElement(By.linkText("Lifestyle")).click();
	 driver.findElement(By.id("login-username")).sendKeys("manasareddy525@gmail.com");
	 driver.findElement(By.id("login-signin")).click();
	 driver.close();*/
	 driver.get("http://login.salesforce.com");
	 driver.findElement(By.xpath("//*[@type='email']")).sendKeys("manasareddy525@gmail.com");
	 /*driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Manu@1436$");
	 driver.findElement(By.xpath("//*[@id='Login']")).click();*/
	 //driver.findElement(By.cssSelector("#username")).sendKeys("manasareddy525@gmail.com");
	 driver.findElement(By.cssSelector("#password")).sendKeys("Manu@1436$");
	 driver.findElement(By.cssSelector("#Login")).click();
	 //driver.wait();
	 driver.close();
	}

}


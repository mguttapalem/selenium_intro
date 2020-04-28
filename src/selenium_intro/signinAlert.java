package selenium_intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signinAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.spirit.com");
		
		driver.findElement(By.xpath("//a[@id='loginlink']")).click();
		 
		
		driver.findElement(By.xpath("//input[@id='emailField']")).sendKeys("manasareddy525@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Manu@1436$");
	driver.findElement(By.cssSelector("#login > div > div > div.modal-footer.no-border-top > div:nth-child(1) > div > button")).click();
	
		//driver.close();
	}

}

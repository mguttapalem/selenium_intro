package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement framedriver = driver.findElement(By.xpath("//*[@id='courses-iframe']"));
		 driver.switchTo().frame(framedriver);
		 
		 Thread.sleep(3000l);
		 driver.findElement(By.xpath("//*[@id='homepage']/div[5]/div[2]/div/div/div/span/div/div[5]/div/div/input")).sendKeys("Manasa");
		 driver.findElement(By.xpath("//*[@id='homepage']/div[5]/div[2]/div/div/div/span/div/div[2]/div/div/button")).click();
	}

}

package selenium_intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://support.google.com/mail/answer/56256?hl=en");
		 driver.findElement(By.className("action-button")).click();
		 System.out.println(driver.getTitle());
		 
		 Set<String> ids = driver.getWindowHandles();
		 Iterator<String> it = ids.iterator();
		 String parentid = it.next();
		 String Childid= it.next();
		 driver.switchTo().window(Childid);
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Manasa");
		 driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("reddy");
		 driver.findElement(By.xpath("//*[@id='accountDetailsNext']/content/span")).click();
		 
		 Thread.sleep(3000l);
		 driver.switchTo().window(parentid);
				 
	}

}

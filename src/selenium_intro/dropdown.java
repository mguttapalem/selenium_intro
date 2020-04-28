package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.makemytrip.com");
		 
		 driver.findElement(By.xpath("//input[@id='hp-widget__paxCounter_pot']")).click();
		 Thread.sleep(3000L);
		 Select s=new Select(driver.findElement(By.xpath(".//*[@id='js-adult_counter']/ul")));
		 s.selectByIndex('2');
		 
		 
		 
		 
		 
		 /*Select s= new Select(driver.findElement(By.id("paxAdults")));
		 s.selectByValue("2");*/
		 
	}

}

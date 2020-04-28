package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceSpicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://spicejet.com/");
		 driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		 Thread.sleep(3000L); 
		 driver.findElement(By.xpath(".//span[@id='hrefIncAdt']")).click();
		 driver.findElement(By.xpath(".//span[@id='hrefIncAdt']")).click();
		 driver.findElement(By.xpath(".//span[@id='hrefDecAdt']")).click();
		 driver.findElement(By.xpath(".//input[@id='btnclosepaxoption']")).click();
	
	}

}

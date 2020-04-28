package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autodropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 /*driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("BENG");
		 driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		 //driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 String script = "return document.getElementById(\"fromPlaceName\").value;";
		 String text = (String) js.executeScript(script);
		 
		 System.out.println(text);*/
		 
		 driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("seleni");
		 Thread.sleep(2000l);
		 driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ARROW_DOWN);
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 String script = "return document.getElementById(\"lst-ib\").value;";
		 String text = (String) js.executeScript(script);
		 System.out.println(text);
		 int i=0;
		 while(!text.equalsIgnoreCase("selenium"))
		 {
			 i++;
			 driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ARROW_DOWN);
			 text = (String) js.executeScript(script);
			 if(i>10){
				 break;
			 }
			 
		 }
		 driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
		 
	
	}

}

package selenium_intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("http://spicejet.com/");
			 driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
			 driver.findElement(By.xpath("//a[@value='GOI']")).click();
			 driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
			 driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
			 
			 WebElement monthFirst = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]//div[@class='ui-datepicker-title']"));
			 WebElement monthSec= driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]//div[@class='ui-datepicker-title']"));
			 while(!(monthFirst.getText().contains("August") || monthSec.getText().contains("August")))
			 {
				 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			 
			 }
			 Thread.sleep(2000);
			 List<WebElement> dates=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
			 int count=driver.findElements(By.xpath("//td[@data-handler='selectDay']")).size();
			 
			 for(int i=0;i<count;i++)
			 {
				 String text= driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();
				 if(text.equalsIgnoreCase("23"))
				 {
					 dates.get(i).click();
					 break;
				 }
			 }
		
		

	}

}

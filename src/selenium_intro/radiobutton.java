package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.spirit.com");
		 int count=driver.findElements(By.xpath("//input[@type='radio']")).size();
		 for(int i=0;i<count;i++)
		 {
		 String text=driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value");
		 
		 if(text.equals("oneWay"))
		 {
			 driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
		 }
		}
		 
		 driver.findElement(By.cssSelector("#departCityCodeSelect")).click();
		 driver.findElement(By.xpath("//*[@value='BOS']")).click();
		 driver.findElement(By.cssSelector("#destCityCodeSelect")).click();
		 driver.findElement(By.xpath("(//*[@value='ATL'])[2]")).click();
		 
		 Select s= new Select(driver.findElement(By.id("paxAdults")));
		 s.selectByValue("2");
		 
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
//driver.close();
	}
}
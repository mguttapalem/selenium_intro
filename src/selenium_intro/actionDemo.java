package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 
		Actions a = new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		//a.moveToElement(move).build().perform();
		//a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[1]/span"))).click().build().perform();
		WebElement sub=driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"));
		a.moveToElement(sub).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		a.moveToElement(sub).doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();
		
		
		
	}

}

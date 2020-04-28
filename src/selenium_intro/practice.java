package selenium_intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.qaclickacademy.com/practice.php");
		// System.out.println(driver.findElements(By.tagName("a")).size());
         
         WebElement subdriver = driver.findElement(By.id("gf-BIG"));
      //  System.out.println(subdriver.findElements(By.tagName("a")).size());
        
        WebElement subfooter = subdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        	//	System.out.println(subfooter.findElements(By.tagName("a")).size());	
        		
        int count = subfooter.findElements(By.tagName("a")).size();
        for(int i=1;i<count;i++)
        {
        	
        	 String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
             subfooter.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
             Thread.sleep(5000l);
        }  
             Set<String> abc = driver.getWindowHandles();
             Iterator<String> it = abc.iterator();
            
            while(it.hasNext())
            {
            	
            	driver.switchTo().window(it.next());
            	System.out.println(driver.getTitle());
            	//driver.switchTo().window(it.next());
            }
            
        
        
        
        	     		
	}

}

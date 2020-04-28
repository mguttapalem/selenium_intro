package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18871/eng-vs-aus-1st-odi-australia-tour-of-england-2018");
		 
		 WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		 int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		 int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		 
		 for(int i=0;i<count-2;i++)
		 {
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		    int valueInt = Integer.parseInt(value);
		    sum=sum+valueInt;
		    
		 }
		 
		 
		 String Extra = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		 int ExtraInt = Integer.parseInt(Extra);
		 int score=sum+ExtraInt;
		 
		 String Total = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		 int Totalscore = Integer.parseInt(Total);
		if(Totalscore==score)
		{
			System.out.println("total matches");
		}
		else
		{
			System.out.println("total not matched");
		}
	}

}

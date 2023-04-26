package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomativeAutoSuggationFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	driver.findElement(By.name("q")).sendKeys("iphone");
	List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'iphone')]"));
	int count = allSugg.size();
	System.out.println(count);
	for(WebElement w:allSugg)
		
	{
		System.out.println(w.getText());
	}
	allSugg.get(count-1).click();
	Thread.sleep(5000);
	driver.close();
		}

}

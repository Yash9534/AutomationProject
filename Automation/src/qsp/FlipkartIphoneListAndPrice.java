package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartIphoneListAndPrice {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
	driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	List<WebElement> pname = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14')]"));
	List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone ')]/../../div[2]/div[1]/div[1]/div[1]"));
	int count = pname.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		String text = pname.get(i).getText();
		String p=price.get(i).getText();
		System.out.println(text+"===>"+p);
	}
		driver.close();
		}
}

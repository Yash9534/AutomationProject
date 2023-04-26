package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingSingleSelectListbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create New Account")).click();
	//Thread.sleep(3000);
	WebElement monthListbox = driver.findElement(By.id("month"));
		Select s=new Select(monthListbox);
		s.selectByIndex(3);
		//Thread.sleep(3000);
		s.selectByValue("9");
		//Thread.sleep(3000);
		s.selectByVisibleText("Feb");
		//Thread.sleep(3000);
		driver.close();
		}
}

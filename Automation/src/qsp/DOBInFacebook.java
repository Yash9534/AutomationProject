package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DOBInFacebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create New Account")).click();
	Thread.sleep(3000);
	WebElement dayListbox = driver.findElement(By.id("day"));
	Select d=new Select(dayListbox);
	d.selectByIndex(8);
	Thread.sleep(2000);
	WebElement monthList = driver.findElement(By.id("month"));
	Select m=new Select(monthList);
	m.selectByValue("6");
	Thread.sleep(2000);
	WebElement yearList = driver.findElement(By.id("year"));
	Select y=new Select(yearList);
	y.selectByVisibleText("1997");
	Thread.sleep(2000);
	driver.close();
		}
}

package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		//driver.findElement(By.xpath("//svg[@fill='none']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("BLR");
		driver.findElement(By.xpath("//p[contains(.,'Bangalore, IN - Kempegowda International Airport (BLR)')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("GOI");
		driver.findElement(By.xpath("//p[contains(.,'Goa')]")).click();
		driver.findElement(By.xpath("//span[.='Search flights']")).click();
	}
}

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HndlingIFrame {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	
	//1st iframe
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	
	//2nd iframe
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
	driver.switchTo().defaultContent();
	
	//3rd iframe
	
	driver.switchTo().frame("classFrame");
	driver.findElement(By.xpath("//a[text()='Help']")).click();
	Thread.sleep(3000);
	driver.close();
		}

}

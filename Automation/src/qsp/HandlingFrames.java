package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Asus/Desktop/page1.html");
driver.switchTo().frame(0);
Thread.sleep(2000);
driver.findElement(By.id("t2")).sendKeys("jsp");
driver.switchTo().parentFrame();
Thread.sleep(2000);
driver.findElement(By.id("t1")).sendKeys("qsp");
Thread.sleep(2000);
driver.close();
		}
}

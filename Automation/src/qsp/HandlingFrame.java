package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Asus/Desktop/page1.html");
driver.findElement(By.id("t1")).sendKeys("Qsp");
Thread.sleep(3000);
driver.switchTo().frame(0);
driver.findElement(By.id("t2")).sendKeys("Jsp");
	}

}

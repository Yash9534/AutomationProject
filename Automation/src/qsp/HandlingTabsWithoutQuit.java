package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabsWithoutQuit {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
Thread.sleep(3000);
driver.findElement(By.linkText("actiTIME Inc.")).click();
Thread.sleep(3000);
Set<String> allwh = driver.getWindowHandles();
for(String wh:allwh)
{
	Thread.sleep(5000);
driver.switchTo().window(wh);
driver.close();
}
	}

}

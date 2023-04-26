package qsp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingTabLeadingDropdown {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
driver.findElement(By.linkText("actiTIME Inc.")).click();
Set<String> allwh = driver.getWindowHandles();
for(String wh:allwh)
{
	driver.switchTo().window(wh);
}
Thread.sleep(3000);
List<WebElement> allHeadings= driver.findElements(By.xpath("//li/span"));
Thread.sleep(3000);
for(int i=0;i<allHeadings.size();i++)
{
String text=allHeadings.get(i).getText();
Thread.sleep(3000);
System.out.println(text);
}
driver.quit();
	}
}

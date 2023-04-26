package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyWebsite {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.vtiger.com/");
WebElement resources = driver.findElement(By.partialLinkText("Resources"));
Actions a=new Actions(driver);
a.moveToElement(resources).perform();
driver.findElement(By.partialLinkText("Customers")).click();
WebElement ft = driver.findElement(By.partialLinkText("15 DAYS FREE TRIAL"));
a.doubleClick(ft).perform();
String t1 = driver.getTitle();
System.out.println(t1);
String t2 = "Start Your Free Trial - Vtiger";
if(t1.equals(t2))
{
	System.out.println("you are on the right page ");
}
else {
	System.out.println("you are on the wrong page");
}
driver.quit();
}	
}

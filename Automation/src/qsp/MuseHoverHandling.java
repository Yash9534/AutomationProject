package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MuseHoverHandling {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.vtiger.com/");
WebElement resources = driver.findElement(By.partialLinkText("Resources"));
Actions a=new Actions(driver);
a.moveToElement(resources).perform();
driver.findElement(By.partialLinkText("Contact Us")).click();
String phno = driver.findElement(By.xpath("//p[contains(text(),' Bengaluru, India')]/../p[2]")).getText();
System.out.println(phno);

driver.close();
	}

}

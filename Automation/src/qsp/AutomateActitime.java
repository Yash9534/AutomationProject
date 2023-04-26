package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateActitime {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[text()='Login ']")).click();
driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
driver.findElement(By.linkText("About your actiTIME")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[contains(.,'Read Service Agreement')]")).click();
Set<String> allwh = driver.getWindowHandles();
int count = allwh.size();
System.out.println(count);
for(String wh:allwh)
{
	driver.switchTo().window(wh);
}
List<WebElement> heading = driver.findElements(By.xpath("//h2"));
for(WebElement allHeadings:heading)
{
	System.out.println(allHeadings.getText());
}
driver.quit();
	}
}

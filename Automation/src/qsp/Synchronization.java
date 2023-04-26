package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Synchronization {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
//maximize the browser
driver.manage().window().maximize();
//implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Explicit wait
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.titleContains("Enter"));

//Fluent wait for implicit wait
FluentWait fw=new FluentWait(driver);
fw.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1));

//Fluent wait for Explicit wait
FluentWait fw1=(FluentWait) new FluentWait(Duration.ofSeconds(10))
.pollingEvery(Duration.ofSeconds(1)).until(ExpectedConditions.titleContains("Enter"));
	}
}

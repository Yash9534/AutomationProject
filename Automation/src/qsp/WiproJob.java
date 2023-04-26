package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJob {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys("wipro jobs");
Thread.sleep(3000);
List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
int count = allLinks.size();
System.out.println(count);
for(int i=0;i<count;i++)
{
	String link = allLinks.get(i).getAttribute("href");
	System.out.println(link);
}
driver.close();

	}

}

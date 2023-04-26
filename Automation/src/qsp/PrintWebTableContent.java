package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintWebTableContent {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Asus/Desktop/hotel.html");
List<WebElement> allContent = driver.findElements(By.xpath("//td"));
for(int i=0;i<allContent.size();i++) {
String text = allContent.get(i).getText();
}
	driver.close();
	}

}

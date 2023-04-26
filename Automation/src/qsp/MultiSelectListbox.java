package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultiSelectListbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Asus/Desktop/hotel.html");
WebElement mtrListbox = driver.findElement(By.id("mtr"));
Select s=new Select(mtrListbox);
	s.selectByIndex(0);
	Thread.sleep(2000);
	s.selectByValue("v");
	Thread.sleep(2000);
	s.selectByVisibleText("dosa");
	Thread.sleep(2000);
	s.deselectByVisibleText("idly");
	Thread.sleep(2000);
	s.deselectByValue("d");
	Thread.sleep(2000);
	s.deselectByIndex(2);
	Thread.sleep(2000);
	//s.deselectAll();
	System.out.println(s.isMultiple());
	driver.close();
	}
}

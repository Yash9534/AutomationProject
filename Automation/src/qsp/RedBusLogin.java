package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RedBusLogin {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.redbus.in/");
driver.findElement(By.id("src")).sendKeys("Bangalore");
driver.findElement(By.id("dest")).sendKeys("pune");
driver.findElement(By.id("onward_cal")).click();

Select d=new Select(null);
d.selectByIndex(15);
driver.findElement(By.id("search_btn")).click();

	}

}

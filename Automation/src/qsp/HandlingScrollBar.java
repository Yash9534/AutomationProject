package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingScrollBar {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.get("https://www.bbc.com/");
driver.manage().window().maximize();
JavascriptExecutor j=(JavascriptExecutor) driver;
	j.executeScript("window.scrollBy(0,3000)");
Thread.sleep(3000);
driver.close();
	}
}

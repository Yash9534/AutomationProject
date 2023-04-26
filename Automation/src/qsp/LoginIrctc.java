package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginIrctc {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("BHOPAL  JN - BPL");
	 driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("PATNA JN - PNBE");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
	 driver.close();
			}
}
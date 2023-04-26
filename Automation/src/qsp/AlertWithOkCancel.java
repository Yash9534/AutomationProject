package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOkCancel {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(4000);
	Alert a=driver.switchTo().alert();
	a.dismiss();
	boolean checktext = driver.findElement(By.id("demo")).isDisplayed();
	if (checktext==true)
	{
		System.out.println("you pressed cancel message is display and pass");
	}
	else
	{
		System.out.println("you pressed cancel message is not displayed and fail");
	}
	driver.close();
		}

}

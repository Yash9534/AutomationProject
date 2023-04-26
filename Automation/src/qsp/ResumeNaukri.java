package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeNaukri {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.naukri.com/");
Thread.sleep(3000);
driver.findElement(By.id("login_Layer")).click();
driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("yashwantk300@gmail.com");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tit9534@");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
Thread.sleep(3000);
File f=new File("./data/yashwant22.pdf");
String path=f.getAbsolutePath();
Thread.sleep(3000);
driver.findElement(By.id("attachCV")).sendKeys(path);
	}

}

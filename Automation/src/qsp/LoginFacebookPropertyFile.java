package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebookPropertyFile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		FileInputStream fis=new FileInputStream("./data/facebook.property");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		driver.get(url);
		driver.findElement(By.name("email")).sendKeys(un);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(pw);
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.close();
			}
	}



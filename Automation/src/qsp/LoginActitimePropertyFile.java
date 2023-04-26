package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActitimePropertyFile {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws IOException, InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
FileInputStream fis=new FileInputStream("./data/commondata.property");
Properties p=new Properties();
p.load(fis);
String un = p.getProperty("username");
String pw = p.getProperty("password");
driver.findElement(By.id("username")).sendKeys(un);
Thread.sleep(3000);
driver.findElement(By.name("pwd")).sendKeys(pw);
Thread.sleep(3000);
driver.findElement(By.xpath("//div[text()='Login ']")).click();
Thread.sleep(3000);
driver.close();
	}
}


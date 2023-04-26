package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CloseSpecific {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
System.out.println("enter the title to be closed");
Scanner sc=new Scanner(System.in);
String eTitle=sc.nextLine();
WebDriver driver=new ChromeDriver();
driver.get("https://secure.indeed.com/");
driver.findElement(By.id("apple-signin-button")).click();
driver.findElement(By.id("login-facebook-button")).click();
Set<String> allwh = driver.getWindowHandles();
for(String wh:allwh) {
	driver.switchTo().window(wh);
	String aTitle = driver.getTitle();
	if(aTitle.equals(eTitle)) {
		driver.close();
	}
}
	}
}

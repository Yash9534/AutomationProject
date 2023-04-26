package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPom {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
//stores the username textbox address as @a1in untbx
WebElement untbx = driver.findElement(By.id("username"));
//refresh and username textbox gets new address as @p1
driver.navigate().refresh();
//try to enter admin using old address ie,@a1
untbx.sendKeys("admin");
	}

}

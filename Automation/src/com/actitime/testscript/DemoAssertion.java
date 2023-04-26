package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAssertion {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void verifyTitle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String eTitle = "Soogle";
	String aTitle = driver.getTitle();
	if(aTitle.equals(eTitle)) {
		Reporter.log("Title is matching and pass");
	}
	else {
		Reporter.log("Title is not matching and fail");
	}
	driver.close();
}
}

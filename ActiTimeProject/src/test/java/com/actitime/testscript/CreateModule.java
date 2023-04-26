package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateModule {
static {
	System.setProperty("webdriver.chrome.driver","./src/main/resources/Driver/chromedriver.exe");
}
	
	@Test
	public void CreateCustomer() {
		Reporter.log("CreateCustomer",true);
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/");
	}
}

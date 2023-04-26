package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	@DataProvider
	public Object[][] getLogin() {
		Object[][] objArr=new Object[4][2];
		objArr[0][0]="admin";
		objArr[0][1]="manager";
		objArr[1][0]="admin2";
		objArr[1][1]="manager2";
		objArr[1][0]="admin3";
		objArr[1][1]="manager3";
		objArr[1][0]="admin4";
		objArr[1][1]="manager4";
		return objArr;
	}
	@Test(dataProvider="getLogin")
	public void testInvalidLogin(String un,String pw) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(5000);
	}
}

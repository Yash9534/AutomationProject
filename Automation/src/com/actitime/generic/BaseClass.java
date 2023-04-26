package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
@BeforeTest
public void openBrowser() {
	Reporter.log("openBrowser",true);
}
@AfterTest
public void closeBrowser() {
	Reporter.log("closeBrowser",true);
}
@BeforeMethod(groups= {"smokeTest","regressionTest"})
public void login() {
	Reporter.log("login",true);
}
@AfterMethod
public void logout() {
	Reporter.log("logout",true);
}
}

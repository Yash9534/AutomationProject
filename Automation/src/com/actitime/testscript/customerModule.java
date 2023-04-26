package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class customerModule extends BaseClass{
@Test(groups={"smokeTest","regressionTest"})
public void createCustomer() {
	Reporter.log("createCustomer",true);
	
}
@Test(groups="regressionTest")
public void modifyCustomer() {
	Reporter.log("modifyCustomer",true);
}
@Test(groups="regressionTest")
public void deleteCustomer() {
	Reporter.log("deleteCustomer",true);
}
}
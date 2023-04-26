package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class projectModule extends BaseClass{
	@Test(groups={"smokeTest","regressionTest"})
	public void createProject() {
		Reporter.log("createProject",true);
	}
	@Test(groups="regressionTest")
	public void modifyProject() {
		Reporter.log("modifyProject",true);
	}
	@Test(groups="regressionTest")
	public void deleteProject() {
		Reporter.log("deleteProject",true);
	}
}

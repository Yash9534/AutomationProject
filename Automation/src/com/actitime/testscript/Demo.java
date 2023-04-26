package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import graphql.schema.diff.reporting.CapturingReporter;

public class Demo {
@Test
public void testDemo() {
	Reporter.log("welcome to testing",true);
}
}
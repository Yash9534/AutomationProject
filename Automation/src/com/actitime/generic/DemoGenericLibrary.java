package com.actitime.generic;

import java.io.IOException;

public class DemoGenericLibrary {

	public static void main(String[] args) throws IOException {
FileLib f=new FileLib();
String un = f.getPropertyData("username");
System.out.println(un);
String cn = f.getExcelData("CreateCustomer", 1, 2);
System.out.println(cn);
f.setExcelValue("CreateCustomer", 1, 4, "PASS");

	}

}

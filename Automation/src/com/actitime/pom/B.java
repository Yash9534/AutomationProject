package com.actitime.pom;

public class B {
public static void main(String[] args) {
	A a1=new A(10);
	int x=a1.getValue();
	System.out.println(x);
	a1.setValue(40);
	System.out.println(a1.getValue());
}
}

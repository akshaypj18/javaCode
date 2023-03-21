package com.javlearning;

public class variable {
	int a=10;
	String name="akshay";
	static int b=31;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		variable instanceObj = new variable();
		System.out.println("value of a=" + instanceObj.a);
		System.out.println(instanceObj.name);
		
		
		System.out.println(instanceObj.b);
	}

}

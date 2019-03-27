package com.hdfc.loans.Carlons;

public class FirstClass {
	//int a=10,b=20;
//int c;
	public void add(int a,int b) {
		int c;
		c=a+b;
		System.out.println("The addition of a&b is "+c);
		
	}
	public void sub(int a,int b) {
		int c;
		c=a-b;
		System.out.println("The subtraction of a&b is"+c);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hi ! This is my First class");
		FirstClass obj=new FirstClass();
		//System.out.println(obj.c);
		obj.add(10,20);
		obj.sub(10,20);
		//System.out.println(obj.a);
		//System.out.println(obj.b);
		//System.out.println(obj.c);
		FirstClass obj1=new FirstClass();
		obj1.add(20,40);
	}

}

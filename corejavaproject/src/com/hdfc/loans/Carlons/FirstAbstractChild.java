package com.hdfc.loans.Carlons;

public class FirstAbstractChild  extends FirstAbstractClass{
	

	public static void main(String[] args) {
		FirstAbstractChild obj=new FirstAbstractChild();
		obj.m1();
		obj.m2();

	}

	@Override
	public void m2() {
		System.out.println("I am overridden method of m2 in FirstAbstratChildCClass ");
		
		
	}

}

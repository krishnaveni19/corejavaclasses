package com.hdfc.loans.Carlons;

public class Icici  implements Rbi{

	public static void main(String[] args) {
		Icici obj=new Icici();
		obj.deposit();
		obj.withdrawl();
		

	}

	@Override
	public void withdrawl() {
		System.out.println("I am overridden withdrawl of ICICI");
		
	}

	@Override
	public void deposit() {
		System.out.println(" I am overridden deposit of ICICI");
		
	}

}

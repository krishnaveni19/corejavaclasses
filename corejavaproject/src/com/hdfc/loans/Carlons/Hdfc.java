package com.hdfc.loans.Carlons;

public class Hdfc  implements Rbi {
	

	public static void main(String[] args) {
		Hdfc obj=new Hdfc();
		obj.deposit();
		obj.withdrawl();
		Rbi r=new Hdfc();
		r.deposit();
		r.withdrawl();
		
	}

	@Override
	public void withdrawl() {
		System.out.println("I am overridden withdrawl of HDFC");
		
		
		
		
	}

	@Override
	public void deposit() {
		System.out.println(" I am overridden deposit of HDFC");
		
	
		
		
	}

}

package com.abstraction;

public class AbstarctionExample {

	public static void main(String args[]){
		Sbi sbi=new Sbi();
		sbi.display_to_clerk();
		sbi.display_to_manager();
	}
}


abstract class Bank{
	abstract void display_to_clerk();
}

class Sbi extends Bank{
	void display_to_clerk(){
		System.out.println("Clerk :");
		System.out.println("Acc no:123457955");
		System.out.println("Name :ygn");
		
	}
	
	void display_to_manager(){
		System.out.println("Manager");
		System.out.println("Acc no:123457955");
		System.out.println("Name :ygn");
		System.out.println("Loan :yes");
		System.out.println("Bal : 125000");
	}
}
package com.collection.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComaratorAndComaprable {
	public static void main(String args[]){
		
		ArrayList<NumberTest> numList=new ArrayList<NumberTest>();
		numList.add(new NumberTest(5));
		numList.add(new NumberTest(8));
		numList.add(new NumberTest(4));
		numList.add(new NumberTest(2));
		numList.add(new NumberTest(7));
		
	String s=new String("gangu");
	String s1=new String("gangu");
	System.out.println(s.equals(s1));
	
		System.out.println("before  sorting");
		System.out.println(numList);
		
		System.out.println("After sorting");
		Collections.sort(numList);
		System.out.println(numList);
		
 	}
}

class NumberTest implements Comparable<NumberTest>{

	private int n;
	
	
	public NumberTest(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	/* ascending order
	  @Override
	public int compareTo(NumberTest o) {
		if(this.n>o.getN()){
			return 1;
		}else if(this.n<o.getN()){
			return -1;
		}else 
		return 0;
	}*/
	
	/* Descending order*/
	 /*@Override
		public int compareTo(NumberTest o) {
			if(this.n>o.getN()){
				return -1;
			}else if(this.n<o.getN()){
				return 1;
			}else 
			return 0;
		}*/
	
	/* Descending order*/
	 @Override
	 public int compareTo(NumberTest o) {

		 /*if(this.n%2==0 && o.getN()%2==0){
			 return 0;
		 }
		 else */if(this.n%2==0){
			 return 1;
		 }/*else if(o.getN()%2==0){
			 return 1;
		 }*/
		 else if(this.n%2!=0){
			 return -1;
		 }/*else if(o.getN()%2!=0){
			 return -1;
		 }*/else return 0;
	 }

	@Override
	public String toString() {
		return "NumberTest [n=" + n + "]";
	}
	
	
}
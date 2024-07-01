package com.tns.staticprograms;

public class Myclass {
	private int section;//instance variable
	static int srno;//static variable
	
	static {
		System.out.println("------static block-----");
		srno=1000;
		System.out.println(srno++);
		
	}

	public Myclass(int section) {
		super();
		this.section = section;
	}

	public Myclass() {
		super();
		System.out.println("-----Default constructor");
		
	}
	static void display() {
		System.out.println("-----static method----");
		srno++;
		System.out.println("The serial no is:"+srno++);
	}

	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	
	

}

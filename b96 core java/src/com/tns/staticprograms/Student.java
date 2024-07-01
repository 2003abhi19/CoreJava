
package com.tns.staticprograms;

public class Student {
	private String name;//instance variable
	private int id;
	
	//static variables
	static String collegeName="DBIT";
	// a constructor for the name nd id
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
	

}

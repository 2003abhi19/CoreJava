package com.tns.Inheritance;

public class Student extends Customer{
	private String collegename;
	private int rollNo;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int id, long adharNo, long phNo,String collegename,int rollNo) {
		super(name, id, adharNo, phNo);
		this.collegename=collegename;
		this.rollNo=rollNo;
	}
	@Override
	public String toString() {
		return "Student [collegename=" + collegename + ", rollNo=" + rollNo + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getAdharNo()=" + getAdharNo() + ", getPhNo()=" + getPhNo() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
		
	}



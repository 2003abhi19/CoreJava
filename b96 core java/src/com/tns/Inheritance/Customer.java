//program to demonstrate the single inheritance
package com.tns.Inheritance;

public class Customer {
	
	private String name;
	private int id;
	private long adharNo;
	private long phNo;
	
	//a default constructor
	public Customer() {
		super();
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public Customer(String name, int id, long adharNo, long phNo) {
		super();
		this.name = name;
		this.id = id;
		this.adharNo = adharNo;
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", adharNo=" + adharNo + ", phNo=" + phNo + "]";
	}
	

}

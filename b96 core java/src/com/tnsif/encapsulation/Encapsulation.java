//program to demonstrate the encapsulation//
package com.tnsif.encapsulation;

public class Encapsulation {
	private int serialNum;//Data members//
	private String name;
	private int age;
	//by using the getters and setters we can access the private data members//
	public int getSerialNum() {
		return serialNum;
	}
// to display string represetation of the string
	@Override
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}

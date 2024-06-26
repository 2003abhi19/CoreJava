package com.abhishek.assignment.employee;

public class Employee {
	private String name;
	private String empid;
	private int salary;
	
	//the function to display the details//
	void show()
	{
		System.out.println("Name:"+name +"/n Employee id"+empid+ "/n Salary:"+salary);
	}
		//implementing the getters nd setters//
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

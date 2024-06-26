package com.abhishek.assignment.employee;

public class Developer extends Employee{
	private String devname;
	private String project;
	private int exp;
	
	//generate the getters nd setters
	public String getDevname() {
		return devname;
	}
	public void setDevname(String devname) {
		this.devname = devname;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	//display the variables
	@Override
	public String toString() {
		return "Developer [devname=" + devname + ", project=" + project + ", exp=" + exp + "]";
	}

}

package com.abhishek.assignment.employee;

public class Manager extends Employee{
	private String managername;
	private String teamname;
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	@Override
	public String toString() {
		return "Manager [managername=" + managername + ", teamname=" + teamname + "]";
	}
	
	//generate the getteres nd setters
	

}

package com.abhishek.assignment.utilities;
import com.abhishek.assignment.employee.*;

public class EmployeeUtilities {
	
	public void manager_details(String name ,String empid , int salary ,String devname ,String project) {
		Manager m=new Manager();
		m.setEmpid(empid);
		m.setName(name);
		m.setSalary(salary);
	}

}

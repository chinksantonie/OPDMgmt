package com.pckg.opd;

import javax.jdo.annotations.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class EmployeeDetails 
{
	@Id
	@GeneratedValue
	int Employee_Details_No;
	int Employee_No;
	String First_Name;
	String Middle_Name;
	String Last_Name;
	@Embedded
	EmployeeAddress empaddr;
	public int getEmployee_Details_No() {
		return Employee_Details_No;
	}
	public void setEmployee_Details_No(int employee_Details_No) {
		Employee_Details_No = employee_Details_No;
	}
	public int getEmployee_No() {
		return Employee_No;
	}
	public void setEmployee_No(int employee_No) {
		Employee_No = employee_No;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getMiddle_Name() {
		return Middle_Name;
	}
	public void setMiddle_Name(String middle_Name) {
		Middle_Name = middle_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	
}

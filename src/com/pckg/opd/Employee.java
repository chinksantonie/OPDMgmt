package com.pckg.opd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue
	int Employee_no;
	String Employee_id;
	int Job_Type_id;
	int cred_no;
	
	@OneToOne
	EmployeeDetails ed;
	
	public int getEmployee_no() {
		return Employee_no;
	}
	public void setEmployee_no(int employee_no) {
		Employee_no = employee_no;
	}
	public String getEmployee_id() {
		return Employee_id;
	}
	public void setEmployee_id(String employee_id) {
		Employee_id = employee_id;
	}
	public int getJob_Type_id() {
		return Job_Type_id;
	}
	public void setJob_Type_id(int job_Type_id) {
		Job_Type_id = job_Type_id;
	}
	public int getCred_no() {
		return cred_no;
	}
	public void setCred_no(int cred_no) {
		this.cred_no = cred_no;
	}
	
}

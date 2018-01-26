package com.pckg.opd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient 
{
	@Id
	@GeneratedValue
	int Patient_no;
	String Patient_id;
	public int getPatient_no() {
		return Patient_no;
	}
	public void setPatient_no(int patient_no) {
		Patient_no = patient_no;
	}
	public String getPatient_id() {
		return Patient_id;
	}
	public void setPatient_id(String patient_id) {
		Patient_id = patient_id;
	}
	
}

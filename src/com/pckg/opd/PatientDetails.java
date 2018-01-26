package com.pckg.opd;

import javax.jdo.annotations.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PatientDetails 
{
	@Id
	@GeneratedValue
	int Patient_det_no;
	int Patient_no;
	String First_Name;
	String Middle_Name;
	String Last_Name;
	@Embedded
	PatientAddress patientaddr;
	public int getPatient_det_no() {
		return Patient_det_no;
	}
	public void setPatient_det_no(int patient_det_no) {
		Patient_det_no = patient_det_no;
	}
	public int getPatient_no() {
		return Patient_no;
	}
	public void setPatient_no(int patient_no) {
		Patient_no = patient_no;
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

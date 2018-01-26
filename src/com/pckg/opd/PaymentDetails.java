package com.pckg.opd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PaymentDetails 
{
	@Id
	@GeneratedValue
	int Payment_no;
	int Patient_no;
	int Doctor_no;
	int Consultation_Fees;
	String Payment_Status;
	public int getPayment_no() {
		return Payment_no;
	}
	public void setPayment_no(int payment_no) {
		Payment_no = payment_no;
	}
	public int getPatient_no() {
		return Patient_no;
	}
	public void setPatient_no(int patient_no) {
		Patient_no = patient_no;
	}
	public int getDoctor_no() {
		return Doctor_no;
	}
	public void setDoctor_no(int doctor_no) {
		Doctor_no = doctor_no;
	}
	public int getConsultation_Fees() {
		return Consultation_Fees;
	}
	public void setConsultation_Fees(int consultation_Fees) {
		Consultation_Fees = consultation_Fees;
	}
	public String getPayment_Status() {
		return Payment_Status;
	}
	public void setPayment_Status(String payment_Status) {
		Payment_Status = payment_Status;
	}
	
}

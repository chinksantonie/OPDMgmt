package com.pckg.opd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Medicine 
{
	@Id
	@GeneratedValue
	int Medicine_no;
	String Medicine_slno;
	String Medicine_Name;
	int No_of_strips;
	float Price_per_Strip;
	public int getMedicine_no() {
		return Medicine_no;
	}
	public void setMedicine_no(int medicine_no) {
		Medicine_no = medicine_no;
	}
	public String getMedicine_slno() {
		return Medicine_slno;
	}
	public void setMedicine_slno(String medicine_slno) {
		Medicine_slno = medicine_slno;
	}
	public String getMedicine_Name() {
		return Medicine_Name;
	}
	public void setMedicine_Name(String medicine_Name) {
		Medicine_Name = medicine_Name;
	}
	public int getNo_of_strips() {
		return No_of_strips;
	}
	public void setNo_of_strips(int no_of_strips) {
		No_of_strips = no_of_strips;
	}
	public float getPrice_per_Strip() {
		return Price_per_Strip;
	}
	public void setPrice_per_Strip(float price_per_Strip) {
		Price_per_Strip = price_per_Strip;
	}
	
}

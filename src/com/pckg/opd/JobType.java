package com.pckg.opd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JobType 
{
	@Id
	@GeneratedValue
	int job_type_id;
	String description;
	public int getJob_type_id() {
		return job_type_id;
	}
	public void setJob_type_id(int job_type_id) {
		this.job_type_id = job_type_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

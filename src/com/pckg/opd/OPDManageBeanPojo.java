package com.pckg.opd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.stereotype.Component;

@ManagedBean(name="OPDMngBean",eager=true)
@RequestScoped
@Component
@Entity
@Table(name="credentials")
public class OPDManageBeanPojo 
{
	@Id
	@GeneratedValue
	int cred_no;
	String username;
	String password;
	
	
	public int getCred_no() {
		return cred_no;
	}
	public void setCred_no(int cred_no) {
		this.cred_no = cred_no;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String action()
	{
		return "welcome";
	}
	
}

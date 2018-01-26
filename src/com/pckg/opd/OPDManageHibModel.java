package com.pckg.opd;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class OPDManageHibModel 
{
	SessionFactory factory;
	public OPDManageHibModel() 
	{
		// TODO Auto-generated constructor stub
		Configuration config=new Configuration().configure();
		factory=config.buildSessionFactory();
	}
	public String check(OPDManageBeanPojo beanpojo)
	{
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Query q=session.createQuery("from credentials where username=? and password=?");
		q.setParameter(0,beanpojo.username);
		q.setParameter(1, beanpojo.password);
		List<OPDManageBeanPojo>cred=q.list();
		if(cred.size()>0)
		{
			return "success";
		}
		else
		{
			return "failure";
		}
	}
}

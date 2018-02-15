package com.pckg.opd.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pckg.opd.dao.PatientDetailsDao;
import com.pckg.opd.dao.PaymentDetailsDao;
import com.pckg.opd.dao.main.AbstractDao;
import com.pckg.opd.hibernate.Credentials;
import com.pckg.opd.hibernate.EmployeeDetails;
import com.pckg.opd.hibernate.PatientDetails;
import com.pckg.opd.hibernate.PaymentDetails;

@Repository(value="paydetDao")
@Transactional
public class PaymentDetailsDaoImpl extends AbstractDao implements PaymentDetailsDao
{
	@Autowired
	private PatientDetailsDao patientDetailsDao;

	@Override
	public void save(PaymentDetails paymentDetails) 
	{
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		System.out.println("paymentDetails before save:"+ paymentDetails);
		paymentDetails.setPatientDetails(patientDetailsDao.getPatientById(paymentDetails.getPatientID()));
		session.save(paymentDetails);
		System.out.println("paymentDetails after save:"+ paymentDetails);
		transaction.commit();
	}

	@Override
	public List<PaymentDetails> getAll() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<PaymentDetails> getPatient(List<String> doctorname)
	{
		Criteria criteria=getSession().createCriteria(PaymentDetails.class);
		criteria.add(Restrictions.eq("doctorName",doctorname));
		List<PaymentDetails> patientId =criteria.list();
		System.out.println(criteria.list());
		if (patientId.size() == 1)
		{
			return patientId;
		}
		return null;
	}*/
	@Override
	public List<PaymentDetails> getPatient(List<String> doctorname)
	{
		String doctor=doctorname.get(0).toString();
		Criteria criteria=getSession().createCriteria(PaymentDetails.class);
		criteria.add(Restrictions.eq("doctorName",doctor));
		List<PaymentDetails> patientId =criteria.list();
		System.out.println(criteria.list());
		if (patientId.size() == 1)
		{
			System.out.println("success");
			return patientId;
		}
		System.out.println("fail");
		return null;
	}
}

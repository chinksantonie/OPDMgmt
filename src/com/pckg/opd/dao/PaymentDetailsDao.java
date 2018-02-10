package com.pckg.opd.dao;

import java.util.List;

import com.pckg.opd.hibernate.PaymentDetails;

public interface PaymentDetailsDao 
{
	public void save(PaymentDetails paymentDetails);
	public List<PaymentDetails> getAll();
}

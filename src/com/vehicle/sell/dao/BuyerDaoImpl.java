package com.vehicle.sell.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicle.sell.entity.Buyer;

@Repository
public class BuyerDaoImpl implements BuyerDao {
	@Autowired
	SessionFactory factory;

	public boolean addBuyer(Buyer buyer) {
		Session session = factory.getCurrentSession();
		try {
			session.save(buyer);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Buyer validate(String email) {
		Session session = factory.getCurrentSession();
		String hql = "from Buyer where buyer_username=:p_email";
		Query q = session.createQuery(hql);
		q.setParameter("p_email", email);
		return (Buyer) q.getSingleResult();
	}
}

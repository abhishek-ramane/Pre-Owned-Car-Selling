package com.vehicle.sell.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicle.sell.entity.Owner;

@Repository
public class OwnerDaoImpl implements OwnerDao{
	@Autowired
	SessionFactory factory;
	
	public Owner validate(String email){
		Session session=factory.getCurrentSession();
		String hql="from Owner where owner_username=:p_email";
		Query q=session.createQuery(hql);
		q.setParameter("p_email",email);
		return (Owner) q.getSingleResult();
	}
	
	public void addOwner(Owner o){
		Session session=factory.getCurrentSession();
		session.persist(o);
	}
	
	public Owner getOwnerById(int id){
		return factory.getCurrentSession().get(Owner.class, id);
	}
	
	public boolean UpdateOwner(Owner owner){
		Session session=factory.getCurrentSession();
		
		try {
			session.update(owner);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
}

package com.vehicle.sell.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicle.sell.entity.Brand;

@Repository
public class BrandDaoImpl implements BrandDao{

	@Autowired
	private SessionFactory factory;
	
	public boolean addBrand(Brand brand){
		Session session=factory.getCurrentSession();
		try {
			session.save(brand);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}

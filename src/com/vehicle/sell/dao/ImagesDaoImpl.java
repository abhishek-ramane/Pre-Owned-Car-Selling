package com.vehicle.sell.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vehicle.sell.entity.Images;

@Repository
public class ImagesDaoImpl implements ImagesDao{
	@Autowired
	private SessionFactory factory;
	
	public boolean addImage(Images img){
		try {
			Session session=factory.getCurrentSession();
			session.save(img);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}

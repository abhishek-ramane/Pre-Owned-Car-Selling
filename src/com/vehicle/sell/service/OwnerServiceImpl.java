package com.vehicle.sell.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.sell.dao.OwnerDao;
import com.vehicle.sell.entity.Owner;
import com.vehicle.sell.model.Login;

@Service
public class OwnerServiceImpl implements OwnerService {
	@Autowired
	private OwnerDao dao;

	@Transactional
	public Owner validate(Login cred) {
		Owner o = dao.validate(cred.getEmail());
		if (cred.getPassword().equals(o.getowner_password()))
			return o;
		else
			return null;
	}

	@Transactional
	public void addOwner(Owner o) {
		dao.addOwner(o);
	}
	
	@Transactional
	public Owner getOwnerById(int id){
		return dao.getOwnerById(id);
	}
}

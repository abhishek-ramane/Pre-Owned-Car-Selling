package com.vehicle.sell.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.sell.dao.BuyerDao;
import com.vehicle.sell.entity.Buyer;
import com.vehicle.sell.entity.Owner;
import com.vehicle.sell.model.Login;

@Service
public class BuyerServiceImpl implements BuyerService{
	@Autowired
	private BuyerDao dao; 
	
	@Transactional
	public boolean addBuyer(Buyer buyer) {
		return dao.addBuyer(buyer); 
	}

	@Transactional
	public Buyer validate(Login cred) {
		Buyer o = dao.validate(cred.getEmail());
		if (cred.getPassword().equals(o.getbuyer_password()))
			return o;
		else
			return null;
	}


}

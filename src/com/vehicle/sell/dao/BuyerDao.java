package com.vehicle.sell.dao;

import com.vehicle.sell.entity.Buyer;

public interface BuyerDao {

	boolean addBuyer(Buyer buyer);

	Buyer validate(String email);

}

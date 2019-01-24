package com.vehicle.sell.service;

import com.vehicle.sell.entity.Buyer;
import com.vehicle.sell.model.Login;

public interface BuyerService {

	boolean addBuyer(Buyer buyer);

	Buyer validate(Login cred);

}

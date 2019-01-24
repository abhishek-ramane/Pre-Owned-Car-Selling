package com.vehicle.sell.service;

import com.vehicle.sell.entity.Owner;
import com.vehicle.sell.model.Login;

public interface OwnerService {
	public Owner validate(Login cred);
	public void addOwner(Owner o);
	public Owner getOwnerById(int id);
}

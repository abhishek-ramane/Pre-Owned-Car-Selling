package com.vehicle.sell.dao;

import com.vehicle.sell.entity.Owner;

public interface OwnerDao {
	public Owner validate(String email);
	public void addOwner(Owner o);
	public Owner getOwnerById(int id);
	public boolean UpdateOwner(Owner owner);
}

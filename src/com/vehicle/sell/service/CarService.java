package com.vehicle.sell.service;

import java.util.List;

import com.vehicle.sell.entity.Car;
import com.vehicle.sell.model.CarDataModel;

public interface CarService {
	public Car getCarById(int car_id);
	public List<Car> getAllAvailableCars();
	public boolean addCar(CarDataModel c);
	public boolean removeCar(int id);
}

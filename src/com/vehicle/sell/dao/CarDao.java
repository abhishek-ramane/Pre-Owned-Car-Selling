package com.vehicle.sell.dao;

import java.util.List;

import com.vehicle.sell.entity.Car;
import com.vehicle.sell.model.CarDataModel;

public interface CarDao {
	public Car getCar(int car_id);
	public void addCar(Car c);
	public List<Car> getAllCars();
	public boolean removeCar(int id);
}

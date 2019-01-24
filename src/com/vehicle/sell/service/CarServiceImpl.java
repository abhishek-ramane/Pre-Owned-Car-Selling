package com.vehicle.sell.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.sell.dao.BrandDao;
import com.vehicle.sell.dao.CarDao;
import com.vehicle.sell.dao.ImagesDao;
import com.vehicle.sell.entity.Brand;
import com.vehicle.sell.entity.Car;
import com.vehicle.sell.entity.Images;
import com.vehicle.sell.model.CarDataModel;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarDao dao;
	@Autowired
	ImagesDao imageDao;
	@Autowired
	BrandDao brandDao;

	@Transactional
	public Car getCarById(int car_id) {
		return dao.getCar(car_id);
	}

	@Transactional
	public List<Car> getAllAvailableCars() {
		return dao.getAllCars();
	}

	@Transactional
	public boolean addCar(CarDataModel c) {
		Car car = new Car();
		try {
			car.setOwner_id(c.getOwner_id());
			car.setCar_registration_year(c.getCar_registration_year());
			car.setTraveled_distance(c.getTraveled_distance());
			car.setExpected_price(c.getExpected_price());
			dao.addCar(car);
			Images img = new Images();
			img.setCar_id(car.getCar_id());
			img.setCar_images(c.getCar_image());
			imageDao.addImage(img);
			Brand brand = new Brand();
			brand.setCar_brand(c.getCar_brand());
			brand.setCar_brand_model(c.getCar_model());
			brand.setCar_id(car.getCar_id());
			brand.setCar_varient(c.getCar_varient());
			brandDao.addBrand(brand);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Transactional
	public boolean removeCar(int id) {
		return dao.removeCar(id);
	}
}

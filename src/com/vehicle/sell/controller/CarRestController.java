package com.vehicle.sell.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.sell.entity.Car;
import com.vehicle.sell.model.CarDataModel;
import com.vehicle.sell.service.CarService;

@RestController
public class CarRestController {
	@Autowired
	CarService service;
	
	@GetMapping("/car/{id}")
	public Car getCar(@PathVariable("id")int car_id){
		return service.getCarById(car_id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/car")
	public List<Car> getAllAvailableCars(){
		return service.getAllAvailableCars();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/car/add-car")
	public void addCar(@RequestBody CarDataModel c){
		System.out.println(c);
		service.addCar(c);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/car/{id}")
	public boolean removeCar(@PathVariable int id){
		return service.removeCar(id);
	}
	
	
}

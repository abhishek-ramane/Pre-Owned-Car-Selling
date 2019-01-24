package com.vehicle.sell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.sell.entity.Buyer;
import com.vehicle.sell.model.Login;
import com.vehicle.sell.service.BuyerService;

@RestController
public class BuyerController {
	@Autowired
	private BuyerService service;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/buyer/register")
	public boolean addBuyer(@RequestBody Buyer buyer){
		System.out.println(buyer);
		return service.addBuyer(buyer);
	}
	
	@CrossOrigin("http://localhost:4200")
	@PostMapping("/buyer/login")
	public Buyer validate(@RequestBody Login cred) {
			return service.validate(cred);
	}

}

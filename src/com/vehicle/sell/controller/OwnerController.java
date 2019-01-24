package com.vehicle.sell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.sell.entity.Owner;
import com.vehicle.sell.model.Login;
import com.vehicle.sell.service.OwnerService;

@RestController
public class OwnerController {
	
	@Autowired
	private OwnerService service;
	
	@CrossOrigin("http://localhost:4200")
	@PostMapping("/owner/login")
	public Owner validate(@RequestBody Login cred) {
		return service.validate(cred);
	}
	
	@CrossOrigin("http://localhost:4200")
	@PostMapping("/owner/register")
	public void addOwner(@RequestBody Owner o){
		System.out.println(o.toString());
		service.addOwner(o);
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/owner/{id}")
	public Owner getOwnerById(@PathVariable int id){
		return service.getOwnerById(id);
	}
}

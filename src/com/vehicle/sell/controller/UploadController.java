package com.vehicle.sell.controller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.ResponseWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.vehicle.sell.service.StorageService;

@RestController
public class UploadController {

	@Autowired
	StorageService service;
	
	List<String> files = new ArrayList<String>();
	
	@CrossOrigin("http://localhost:4200")
	@PostMapping("/upload/car")
	public String uploadFile(@RequestParam("file")MultipartFile file){
		String message = "";
		try {
			//service.init();
			message=service.store(file);
			files.add(message);
			return message;
		} catch (Exception e) {
			message = "FAIL to upload " + file.getOriginalFilename() + "!";
			return message;
		}
	}
}

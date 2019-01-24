package com.vehicle.sell.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
	public String store(MultipartFile file);
	public Resource loadFile(String fileName);
	public void init();
}

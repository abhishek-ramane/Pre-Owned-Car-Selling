package com.vehicle.sell.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageServiceImpl implements StorageService {
	public final Path rootLocation = Paths
			.get(StorageService.class.getResource("/../../upload/").getPath());

	public String store(MultipartFile file) {
		try {
			
			System.out.println(rootLocation);
			String fileName = UUID.randomUUID().toString()+"."+FilenameUtils.getExtension(file.getOriginalFilename());
			Files.copy(file.getInputStream(), this.rootLocation.resolve(fileName));
			return fileName;
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to upload");
		}
	}

	public Resource loadFile(String fileName) {
		try {
			Path file = rootLocation.resolve(fileName);
			Resource resource = new UrlResource(file.toUri());
			if (resource.exists() || resource.isReadable()) {
				return resource;
			} else {
				throw new RuntimeException("FAIL!");
			}
		} catch (MalformedURLException e) {
			throw new RuntimeException("FAIL!");
		}
	}

	public void init() {
		try {
			Files.createDirectory(rootLocation);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Could not initialize storage!");
		}
	}
}

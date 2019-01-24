package com.vehicle.sell.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "car_images")
public class Images {
	@GenericGenerator(name="gn",strategy="native")
	@GeneratedValue(generator="gn")
	@Id
	@Column(name="image_id")
	private int image_id;
	@Column(name = "car_id")
	private int car_id;
	@Column(name = "car_images")
	private String car_images;
	


	public Images(int image_id, int car_id, String car_images) {
		super();
		this.image_id = image_id;
		this.car_id = car_id;
		this.car_images = car_images;
	}
	

	public Images() {
		this(0,0,"");
	}


	public int getImage_id() {
		return image_id;
	}

	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}


	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getCar_images() {
		return car_images;
	}

	public void setCar_images(String car_images) {
		this.car_images = car_images;
	}

	@Override
	public String toString() {
		return "Images [image_id=" + image_id + /*", car_id=" + car_id + */", car_images=" + car_images + "]";
	}

	

}

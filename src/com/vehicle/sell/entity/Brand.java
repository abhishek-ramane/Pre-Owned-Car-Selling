package com.vehicle.sell.entity;

import javax.persistence.*;

@Entity
@Table(name = "car_brand")
public class Brand {
	@Id
	@Column
	private int car_id;
	@Column(name = "car_brand")
	private String car_brand;
	@Column(name = "car_brand_model")
	private String car_brand_model;
	@Column(name = "car_varient")
	private String car_varient;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Car car;

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getCar_brand() {
		return car_brand;
	}

	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}

	public String getCar_brand_model() {
		return car_brand_model;
	}

	public void setCar_brand_model(String car_brand_model) {
		this.car_brand_model = car_brand_model;
	}

	public String getCar_varient() {
		return car_varient;
	}

	public void setCar_varient(String car_varient) {
		this.car_varient = car_varient;
	}

	@Override
	public String toString() {
		return "Brand [car_id=" + car_id + ", car_brand=" + car_brand + ", car_brand_model="
				+ car_brand_model + ", car_varient=" + car_varient + "]";
	}

	public Brand(Car c, int car_id, String car_brand, String car_brand_model, String car_varient) {
		super();
		this.car_id = car_id;
		this.car_brand = car_brand;
		this.car_brand_model = car_brand_model;
		this.car_varient = car_varient;
	}

	public Brand() {
		this(null, 0, "", "", "");
	}

}

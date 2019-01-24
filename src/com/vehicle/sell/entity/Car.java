package com.vehicle.sell.entity;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "car_table")
public class Car {
	@Id
	@Column(name = "car_id")
	@GenericGenerator(name="gn",strategy="native")
	@GeneratedValue(generator="gn")
	private int car_id;
	@Column(name = "owner_id")
	private int owner_id;
	@Column(name = "car_registration_year")
	private int car_registration_year;
	@Column(name = "traveled_distance")
	private int traveled_distance;
	@Column(name = "expected_price")
	private double expected_price;
	@Column(name = "car_status")
	private String car_status;
	@OneToMany(mappedBy = "car_id", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Images> listImages;

	@OneToOne(mappedBy="car",fetch=FetchType.EAGER)
	private Brand brand;

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public List<Images> getListImages() {
		return listImages;
	}

	public void setListImages(List<Images> listImages) {
		this.listImages = listImages;
	}

	public Car() {
		this(0, 0, 0, 0, 0.0, "");
	}

	public Car(int car_id, int owner_id, int car_registration_year, int traveled_distance, double expected_price,
			String car_status) {
		super();
		this.car_id = car_id;
		this.owner_id = owner_id;
		this.car_registration_year = car_registration_year;
		this.traveled_distance = traveled_distance;
		this.expected_price = expected_price;
		this.car_status = "AVAILABLE";
	}

	@Override
	public String toString() {
		return "Car [car_id=" + car_id + ", owner_id=" + owner_id + ", car_registration_year="
				+ car_registration_year + ", traveled_distance=" + traveled_distance
				+ ", expected_price=" + expected_price + ", car_status=" + car_status + "]";
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public int getCar_registration_year() {
		return car_registration_year;
	}

	public void setCar_registration_year(int car_registration_year) {
		this.car_registration_year = car_registration_year;
	}

	public int getTraveled_distance() {
		return traveled_distance;
	}

	public void setTraveled_distance(int traveled_distance) {
		this.traveled_distance = traveled_distance;
	}

	public double getExpected_price() {
		return expected_price;
	}

	public void setExpected_price(double expected_price) {
		this.expected_price = expected_price;
	}

	public String getCar_status() {
		return car_status;
	}

	public void setCar_status(String car_status) {
		this.car_status = car_status;
	}
}

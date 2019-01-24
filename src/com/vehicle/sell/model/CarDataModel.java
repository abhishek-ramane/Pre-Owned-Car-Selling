package com.vehicle.sell.model;

public class CarDataModel {
	private int owner_id;
    private int  car_registration_year;
    private int  traveled_distance;
    private double  expected_price;
    private String car_image;
    private String car_brand;
    private String car_varient;
    private String car_model;
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
	public String getCar_image() {
		return car_image;
	}
	public void setCar_image(String car_image) {
		this.car_image = car_image;
	}
	public String getCar_brand() {
		return car_brand;
	}
	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}
	public String getCar_varient() {
		return car_varient;
	}
	public void setCar_varient(String car_varient) {
		this.car_varient = car_varient;
	}
	
	public CarDataModel(int owner_id, int car_registration_year, int traveled_distance, int expected_price,
			String car_image, String car_brand, String car_varient, String car_model) {
		super();
		this.owner_id = owner_id;
		this.car_registration_year = car_registration_year;
		this.traveled_distance = traveled_distance;
		this.expected_price = expected_price;
		this.car_image = car_image;
		this.car_brand = car_brand;
		this.car_varient = car_varient;
		this.car_model = car_model;
	}
	@Override
	public String toString() {
		return "CarDataModel [owner_id=" + owner_id + ", car_registration_year=" + car_registration_year
				+ ", traveled_distance=" + traveled_distance + ", expected_price=" + expected_price + ", car_image="
				+ car_image + ", car_brand=" + car_brand + ", car_varient=" + car_varient + ", car_model=" + car_model
				+ "]";
	}
	public String getCar_model() {
		return car_model;
	}
	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}
	public CarDataModel() {
		this(0,0,0,0,"","","","");
	}
    
}

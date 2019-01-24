package com.vehicle.sell.entity;

import java.sql.Date;

import javax.persistence.*;


import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "reports")
public class Report {
	@Id
	@Column(name = "car_id")
	private int car_id;
	@Column(name = "owner_id")
	private int owner_id;
	@Column(name = "cust_id")
	private int cust_id;

	//possibilities of error
	@GenericGenerator(name="gen", strategy="native")
	@GeneratedValue(generator="gen")
	@Column(name = "created_at")
	private Date created_at;

	public Report(int car_id, int owner_id, int cust_id, Date created_at) {
		super();
		this.car_id = car_id;
		this.owner_id = owner_id;
		this.cust_id = cust_id;
		this.created_at = created_at;
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

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "Report [car_id=" + car_id + ", owner_id=" + owner_id + ", cust_id=" + cust_id + ", created_at="
				+ created_at + "]";
	}

}

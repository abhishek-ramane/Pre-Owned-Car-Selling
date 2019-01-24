package com.vehicle.sell.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "car_buyer")
public class Buyer {
	@Id
	@Column(name = "cust_id")
	@GenericGenerator(name="gn",strategy="native")
	@GeneratedValue(generator="gn")
	private int buyer_id;
	@Column(name = "cust_name")
	private String buyer_name;
	@Column(name = "cust_email")
	private String buyer_email;
	@Column(name = "cust_password")
	private String buyer_password;
	@Column(name = "cust_mobile")
	private String buyer_mobile;
	@Column(name = "cust_username")
	private String buyer_username;
	@Column(name = "cust_address")
	private String buyer_address;

	public Buyer(int buyer_id, String buyer_name, String buyer_email, String buyer_password, String buyer_mobile,
			String buyer_username, String buyer_address) {
		super();
		this.buyer_id = buyer_id;
		this.buyer_name = buyer_name;
		this.buyer_email = buyer_email;
		this.buyer_password = buyer_password;
		this.buyer_mobile = buyer_mobile;
		this.buyer_username = buyer_username;
		this.buyer_address = buyer_address;
	}

	public Buyer() {
		this(0, "", "", "", "", "", "");
	}

	@Override
	public String toString() {
		return "buyer [buyer_id=" + buyer_id + ", buyer_name=" + buyer_name + ", buyer_email=" + buyer_email
				+ ", buyer_password=" + buyer_password + ", buyer_mobile=" + buyer_mobile + ", buyer_username="
				+ buyer_username + ", buyer_address=" + buyer_address + "]";
	}

	public int getbuyer_id() {
		return buyer_id;
	}

	public void setbuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}

	public String getbuyer_name() {
		return buyer_name;
	}

	public void setbuyer_name(String buyer_name) {
		this.buyer_name = buyer_name;
	}

	public String getbuyer_email() {
		return buyer_email;
	}

	public void setbuyer_email(String buyer_email) {
		this.buyer_email = buyer_email;
	}

	public String getbuyer_password() {
		return buyer_password;
	}

	public void setbuyer_password(String buyer_password) {
		this.buyer_password = buyer_password;
	}

	public String getbuyer_mobile() {
		return buyer_mobile;
	}

	public void setbuyer_mobile(String buyer_mobile) {
		this.buyer_mobile = buyer_mobile;
	}

	public String getbuyer_username() {
		return buyer_username;
	}

	public void setbuyer_username(String buyer_username) {
		this.buyer_username = buyer_username;
	}

	public String getbuyer_address() {
		return buyer_address;
	}

	public void setbuyer_address(String buyer_address) {
		this.buyer_address = buyer_address;
	}

}

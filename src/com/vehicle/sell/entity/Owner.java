package com.vehicle.sell.entity;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="car_owner")
public class Owner {
	@Id
	@Column(name="owner_id")
	@GenericGenerator(name="gn",strategy="native")
	private int owner_id;
	@Column(name="owner_name")
	private String owner_name;
	@Column(name="owner_email")
	private String owner_email;
	@Column(name="owner_password")
	private String owner_password;
	@Column(name="owner_mobile")
	private String owner_mobile;
	@Column(name="owner_username")
	private String owner_username;
	@Column(name="owner_address")
	private String owner_address;
	@OneToMany(mappedBy="owner_id",fetch=FetchType.EAGER)
	private List<Car>carList;
	
	
	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	public Owner(int owner_id, String owner_name, String owner_email, String owner_password, String owner_mobile,
			String owner_username, String owner_address) {
		super();
		this.owner_id = owner_id;
		this.owner_name = owner_name;
		this.owner_email = owner_email;
		this.owner_password = owner_password;
		this.owner_mobile = owner_mobile;
		this.owner_username = owner_username;
		this.owner_address = owner_address;
	}

	public Owner() {
		this(0, "", "", "", "", "", "");
	}

	@Override
	public String toString() {
		return "owner [owner_id=" + owner_id + ", owner_name=" + owner_name + ", owner_email=" + owner_email
				+ ", owner_password=" + owner_password + ", owner_mobile=" + owner_mobile + ", owner_username="
				+ owner_username + ", owner_address=" + owner_address + "]";
	}

	public int getowner_id() {
		return owner_id;
	}

	public void setowner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public String getowner_name() {
		return owner_name;
	}

	public void setowner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getowner_email() {
		return owner_email;
	}

	public void setowner_email(String owner_email) {
		this.owner_email = owner_email;
	}

	public String getowner_password() {
		return owner_password;
	}

	public void setowner_password(String owner_password) {
		this.owner_password = owner_password;
	}

	public String getowner_mobile() {
		return owner_mobile;
	}

	public void setowner_mobile(String owner_mobile) {
		this.owner_mobile = owner_mobile;
	}

	public String getowner_username() {
		return owner_username;
	}

	public void setowner_username(String owner_username) {
		this.owner_username = owner_username;
	}

	public String getowner_address() {
		return owner_address;
	}

	public void setowner_address(String owner_address) {
		this.owner_address = owner_address;
	}
}

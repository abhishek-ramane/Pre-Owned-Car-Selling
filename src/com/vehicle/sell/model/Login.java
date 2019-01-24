package com.vehicle.sell.model;

public class Login {
private String email;
private String password;
private String typeOfUser;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getTypeOfUser() {
	return typeOfUser;
}
public void setTypeOfUser(String typeOfUser) {
	this.typeOfUser = typeOfUser;
}
@Override
public String toString() {
	return "Login [email=" + email + ", password=" + password + ", typeOfUser=" + typeOfUser + "]";
}
public Login(String email, String password, String typeOfUser) {
	super();
	this.email = email;
	this.password = password;
	this.typeOfUser = typeOfUser;
}
public Login() {
	this("","","");
}

}

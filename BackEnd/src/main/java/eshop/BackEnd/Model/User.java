package eshop.BackEnd.Model;

public class User 
{
String email;

String password;

String userName;

String mobileNumber;

String address;

String role;

boolean enabled;

public void setEmail(String email)
{
	this.email= email;
}
public String getEmail()
{
	return email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}

}

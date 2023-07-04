import java.util.Scanner;

public abstract class User {
int id =0;
private String name;
private String address;
private String username;
private String password;
private String phone;
public int getId() {
	return id;
}
public User( String name, String address, String username, String password, String phone) {
	setName(name);
	setAddress(address);
	setUsername(username);
	setPassword(password);
	setPhone(phone);
}
public void setId(int id) {
	this.name = name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}


@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", address=" + address + ", username=" + username + ", password="
			+ password + ", phone=" + phone + "]";
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}


}

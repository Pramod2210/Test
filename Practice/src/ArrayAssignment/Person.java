package ArrayAssignment;

import java.util.Arrays;

public class Person {
  int id;
  String name,Address;
  Idproof ip[];
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public Idproof[] getIp() {
	return ip;
}
public void setIp(Idproof[] ip) {
	this.ip = ip;
}
@Override
public String toString() {
	return "Person id=" + id + ", name=" + name + ", Address=" + Address + ", ip=" + Arrays.toString(ip) + "]";
}
  
}

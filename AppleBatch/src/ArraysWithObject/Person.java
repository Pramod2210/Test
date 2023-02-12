package ArraysWithObject;

import java.util.Arrays;

public class Person {
 int id;
 String name,address;
 Idproof i[];
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
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Idproof[] getI() {
	return i;
}
public void setI(Idproof[] i) {
	this.i = i;
}
@Override
public String toString() {
	return "Person id=" + id + ", name=" + name + ", address=" + address + ", i=" + Arrays.toString(i);
}
 
 
}

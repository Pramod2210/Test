package Test4;

public class Person {
int salary;
 String name,address;
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
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
@Override
public String toString() {
	return "Person [salary=" + salary + ", name=" + name + ", address=" + address + "]";
}
 
}



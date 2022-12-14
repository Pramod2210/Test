package contaniment;

public class Car {
  int id, price;
  String name;
  Engine e;
  
  public void setE(Engine e) {
	  this.e=e;
  }
  public Engine  getE() {
	  return e;
  }
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
}

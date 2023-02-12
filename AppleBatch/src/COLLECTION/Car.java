package COLLECTION;

public class Car {
  int id, year;
  String name,price;
  
  Car(int id,String name,int year,String price){
	  this.id=id;
	  this.name=name;
	  this.year=year;
	  this.price=price;
	  
  }

@Override
public String toString() {
	return "Car id=" + id + ", year=" + year + ", name=" + name + ", price=" + price ;
}
  
}

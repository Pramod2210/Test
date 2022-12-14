package Overriding;

public class Patient extends Person {
  int id,bedno;
  String disease;
public void setId(int id) {
	this.id = id;
}
public void setBedno(int bedno) {
	this.bedno = bedno;
}
public void setDisease(String disease) {
	this.disease = disease;
}
  
  void display() {
	  super.display();
	  System.out.println("id : "+id+"\nbedno : "+bedno+" \ndisease : "+disease);
  }
}

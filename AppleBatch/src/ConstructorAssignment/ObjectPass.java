package ConstructorAssignment;

public class ObjectPass {
// Question 
	//2.	Write a program to copy values of one object into another by assigning the values of
	//one object into another.

	int id;
	String name;
	
	ObjectPass(int i,String n){
		id=i;
		name=n;
	}
	ObjectPass(ObjectPass o){
		id=o.id;
		name=o.name;
				
	}
	 void display() {
		 System.out.println("id :"+id+" name : "+name);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectPass o1=new ObjectPass(1,"patil");
		ObjectPass o2=new ObjectPass (o1);
		o1.display();
		o2.display();
	}

}

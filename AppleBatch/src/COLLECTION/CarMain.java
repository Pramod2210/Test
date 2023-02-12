package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class CarMain {
	
	
	void card_detail(ArrayList<Car>c) {
		c.add(new Car(1,"swift",1990,"700000"));
		c.add(new Car(2,"audi",1995,"2700000"));
		c.add(new Car(3,"thar",2013,"1300000"));
		c.add(new Car(4,"indica",1990,"400000"));
		c.add(new Car(5,"Ambasitar",1990,"500000"));
	}

	 void Display(ArrayList<Car>c) {
		 Iterator<Car>it=c.iterator();
		 while(it.hasNext()) {
			 Car c1=it.next();{
				 if(c1.year==1990) {
					 it.remove();
				 }
			 }
		 }
		 System.out.println(c);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car>cd=new ArrayList<>();
		CarMain  c=new CarMain();
		c.card_detail(cd);
		System.out.println(cd);
		c.Display(cd);
	}

}

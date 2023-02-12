package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;      
public class Personmain2 {
	
	void element(ArrayList<Person2>p){ 
		p.add(new Person2(1,"pramod","9545443151",new Address1("pune","mh","india")));
		p.add(new Person2(2,"pravin","9545443151",new Address1("akkalkot","mh","india")));
		p.add(new Person2(3,"pratik","9545443151",new Address1("pune","mh","india")));
		p.add(new Person2(4,"raja","9545443151",new Address1("pune","mh","india")));
		p.add(new Person2(5,"prem","9545443151",new Address1("solapur","mh","india")));
		p.add(new Person2(6,"atif","9545443151",new Address1("pune","mh","india")));
		p.add(new Person2(7,"pradip","9545443151",new Address1("pune","mh","india")));
		p.add(new Person2(8,"sahil","9545443151",new Address1("chikkehalli","mh","india")));
		p.add(new Person2(9,"karik","9545443151",new Address1("pune","mh","india")));
		p.add(new Person2(10,"preeti","9545443151",new Address1("nsdhik","mh","india")));
	}
	 void dispaly(ArrayList<Person2>p1) {
		 for(Person2 x:p1) {
			 if(x.add.city.equalsIgnoreCase("pune")) {
				 System.out.println(x);
			 }
		 }
	 }
	 
	 void Remove(ArrayList<Person2>p2) {
		 Iterator<Person2>it=p2.iterator();
		 while(it.hasNext()) {
			  Person2 p=it.next();
			  if(p.add.city.equalsIgnoreCase("pune")) {
				  it.remove();
				 
			 }
			 
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Person2>person=new ArrayList<>();//0
         Personmain2 z=new Personmain2();
         z.element(person);   //0
        System.out.println(person);
        z.dispaly(person);//
        z.Remove(person);
        System.out.println("-------remove--------");
        System.out.println(person);
	}

}

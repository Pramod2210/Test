package Encapsulation;

import java.util.Scanner;

public class Flight {
	String source,destination,clas;
	int person,fare;
	
	public void setSource(String source) {
		this.source=source;
	}
	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		destination = destination;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}

	
	void setdata() {
	
	Scanner sc=new Scanner (System.in);
	System.out.println("enter source,destination,person");
    source=sc.next();
    destination=sc.next();
    person=sc.nextInt();
    System.out.println("enter the class");
    clas=sc.next().toLowerCase();
     
    if (clas.equalsIgnoreCase("economy")) 
    	System.out.println("fare is:  "+person*5000);
    	else if(clas.equalsIgnoreCase("businees"))
    		System.out.println("fare is:  "+person*8000);
    	else
    		System.out.println("fare :"+4000);
    
	}



public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Flight f=new Flight ();
   f.setdata();
   System.out.println("Source is :"+f.getSource()+"Destination is: "+f.getDestination()+"Person : "+f.getPerson()+" class is : "+f.getClas());
	
}
}

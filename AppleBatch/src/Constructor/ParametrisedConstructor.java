package Constructor;

import java.util.Scanner;

public class ParametrisedConstructor {
	 
	int id,salary;
	String name;
	
	ParametrisedConstructor (){
		
	}
	ParametrisedConstructor(int ed,int es,String en){
		id=ed;
		salary=es;
		name=en;
	}
	public String toString() {
		return (id+" "+salary+" "+name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the id,salary,name");
       int ed=sc.nextInt();
       int es=sc.nextInt();
       String en=sc.next();
       
       ParametrisedConstructor p=new ParametrisedConstructor(ed, es, en);
       ParametrisedConstructor p1=new ParametrisedConstructor();
       ParametrisedConstructor p3=p;
          
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p3);
	}

}

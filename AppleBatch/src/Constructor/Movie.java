package Constructor;

import java.util.Scanner;

public class Movie {
	String name, producre, budget;
	
	Movie(String name,String producre,String budget ){
		
		  this.name=name; 
		  this.producre=producre;
		  this.budget=budget;
		 
	}
	public String toString(){
		return ("name :"+name+"\nproducre : "+producre+"\nbudget : "+budget);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		for(int i=1;i<=3;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enetr the name,producre,budget");
			String n=sc.next();
			String p=sc.next();
			String b=sc.next();
			Movie m=new Movie(n,p, b);
			System.out.println(m);
		}
	}

}

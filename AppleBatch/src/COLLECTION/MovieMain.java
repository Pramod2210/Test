package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class MovieMain {
	
	  void setActor(ArrayList<Movie>m1) {
	
	ArrayList<Actor>ac1=new ArrayList<>();
      ac1.add(new Actor(1,"Amitab Bacchan"));
      ac1.add(new Actor(2,"salman khan"));
      ac1.add(new Actor(3,"rushi kapur"));
      ac1.add(new Actor(4,"amir khan"));
     
      ArrayList<Actor>ac2=new ArrayList<>();
      ac2.add(new Actor(10,"Shahruk khan"));
      ac2.add(new Actor(2,"salman khan"));
      ac2.add(new Actor(3,"rushi kapur"));
      ac2.add(new Actor(4,"amir khan"));
	  
      ArrayList<Actor>ac3=new ArrayList<>();
      ac3.add(new Actor(1,"Amitab Bacchan"));
      ac3.add(new Actor(10,"Sharuk khan"));
      ac3.add(new Actor(30,"JayaBacchan"));
      ac3.add(new Actor(40,"Abhishek Bacchan"));
      
      ArrayList<Actor>ac4=new ArrayList<>();
      ac4.add(new Actor(10,"Shahruk khan"));
      ac4.add(new Actor(22,"Jockey Sraf"));
      ac4.add(new Actor(33,"Madhuri dixit"));
      ac4.add(new Actor(44,"priynka chopda"));
      
     
      
		m1.add(new Movie(1,"hum","15cr",ac1));
		m1.add(new Movie(2,"raja hindustani","115cr",ac2));
		m1.add(new Movie(3,"Kabhi khui Kabhi gum","105cr",ac3));
		m1.add(new Movie(4,"Devdas","45cr",ac4));
		
	}
     
	
	  
	 void display(ArrayList<Movie>m) {
	  Iterator<Movie> itr = m.iterator();
	  while(itr.hasNext()) {
		  Movie mo=itr.next();
		  
			  for(Actor a:mo.Ac) {
				  if(a.name.contains("Amitab Bacchan")) {
					  itr.remove();
				  }
			  }
		  }
		  System.out.println(m);
	  }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Movie>m1=new ArrayList<>();
 
     MovieMain f=new MovieMain();
     f.setActor(m1);
     System.out.println(m1);
     f.display(m1);
	}

}

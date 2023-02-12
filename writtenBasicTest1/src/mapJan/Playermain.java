package mapJan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Playermain {
	void setdata( ArrayList<Player>a) {
		
		 a.add(new Player(1,"virat","India","RCB"));
		 a.add(new Player(2,"abd","SouthAfrika","RCB"));
		 a.add(new Player(3,"maxwell","Australi","RCB"));
		 a.add(new Player(4,"msdhoni","India","CSK"));
		 a.add(new Player(5,"Rohit","India","MI"));
		 a.add(new Player(6,"samcurran","India","CSK"));
		 a.add(new Player(7,"abd","SouthAfrika","CSK"));
		 a.add(new Player(8,"maxwell","Ingland","CSK"));
		 a.add(new Player(9,"hardik","India","MI"));
		 a.add(new Player(10,"PANTH","India","MI"));
		 a.add(new Player(11,"PRAMOD","India","MI"));
		 a.add(new Player(12,"ATIF","India","MI"));
		 a.add(new Player(13,"RAJU","India","MI"));
	
		
	}
	void display(ArrayList<Player>a,HashMap<String,Integer>hm) {
		for(Player p:a) {
			String s=p.team;
			String s1=p.country;
			if(s1.equalsIgnoreCase("India")) {
				if(hm.containsKey(s)) {
					hm.put(s, hm.get(s)+1);
				}
				else {
					hm.put(s, 1);
				}
			}
		}
		System.out.println(hm);
		
		 Iterator<Map.Entry<String,Integer>>it=hm.entrySet().iterator();
		 int max=0;
		 int min=0;
		 
		// max=it.next().getValue();
		  while(it.hasNext()) {
		 //max=it.next().getValue();
		 min=it.next().getValue();
				  if(max<min) {
					  max=min;
				  }
			  
		  }
		  System.out.println(max);
		  
		  for(Map.Entry<String,Integer>it1:hm.entrySet()){
			 if(it1.getValue()==max) {
				 System.out.println(it1.getKey()+" "+it1.getValue());
			 }
		  }
	
		}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Player>X=new ArrayList<>();
		 HashMap<String,Integer>h=new HashMap<>();
		 Playermain p=new Playermain();
		 p.setdata(X);
		 p.display(X, h);
		 //System.out.println(X);
	}

}

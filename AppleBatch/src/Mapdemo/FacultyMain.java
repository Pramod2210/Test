package Mapdemo;

import java.util.ArrayList;
import java.util.HashMap;

public class FacultyMain {

	void setdata(ArrayList<Faculty>f) {
		f.add(new Faculty("pramod","mech","98000",1,new Address("pune","Maharashtra")));
		f.add( new Faculty("Rahukl","it","88000",5,new Address("jaipur","Rajasthan")));
		f.add( new Faculty("Prera","comp","96000",6,new Address("patna","bihar")));
		f.add( new Faculty("Duksh","mech","98000",45,new Address("satna","up")));
		f.add( new Faculty("Raj","mech","98000",50,new Address("itaras","Mp")));
		f.add( new Faculty("ravi","entc","95000",84,new Address("pune","Maharashtra")));
		f.add( new Faculty("raki","mech","98000",56,new Address("jaipur","Rajysthan")));
		f.add( new Faculty("Atul","civil","78000",4,new Address("pune","Maharashtra")));
		f.add( new Faculty("baba","it","48000",6,new Address("jaipur","Rajysthan")));
		f.add( new Faculty("dilip","comp","58000",89,new Address("satna","up")));
		
	}
	
	void creathashmap(ArrayList<Faculty>f,HashMap<String,Integer>hm) {
		for(Faculty f1:f) {
			String s=f1.a.city;
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}
			else {
				hm.put(s,1);
			}
		}
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Faculty>ff=new ArrayList<>();
     HashMap<String ,Integer>hm=new HashMap<>();
     FacultyMain o=new FacultyMain();
     o.setdata(ff);
     o.creathashmap(ff, hm);
     System.out.println(hm);
	}

}

package Mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PramodMain {
	
	void sedata(LinkedHashMap<pramod,Integer>hm) {
		hm.put(new pramod(1,"pravin","mech", "55"), 25);
		hm.put(new pramod(21,"pem","civil", "75"), 15);
		hm.put(new pramod(22,"ram","mech", "85"), 28);
		hm.put(new pramod(11,"ajay","comp", "95"), 24);
		hm.put(new pramod(10,"raki","it", "45"), 21);
		hm.put(new pramod(10,"rohit","it", "45"), 31);
		hm.put(new pramod(10,"rohit","mech", "45"), 31);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<pramod,Integer>hm=new LinkedHashMap<>();
		PramodMain  pp=new PramodMain ();
		pp.sedata(hm);
		System.out.println(hm);
	}

}

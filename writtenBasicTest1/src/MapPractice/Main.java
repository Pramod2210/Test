package MapPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



public class Main {
	
	void setdata(LinkedHashMap<Integer,Student>hm) {
		hm.put(1,new Student(4,"pramod","mech",78000));
		hm.put(11,new Student(16,"pravin","it",65000));
		hm.put(10,new Student(18,"amar","comp",88000));
		hm.put(7,new Student(11,"dilip","mech",78000));
		hm.put(4,new Student(1,"raki","civil",45000));
		hm.put(18,new Student(15,"atif","mech",56000));
		hm.put(31,new Student(35,"raj","comp",60000));
	}
	
	/*void setdata(TreeMap<Student,Integer>hm) {
		hm.put(new Student(4,"pramod","mech",78000),1);
		hm.put(new Student(16,"pravin","it",65000),15);
		hm.put(new Student(18,"amar","comp",88000),45);
		hm.put(new Student(11,"dilip","mech",78000),5);
		hm.put(new Student(1,"raki","civil",45000),7);
		hm.put(new Student(15,"atif","mech",56000),14);
		hm.put(new Student(35,"raj","comp",60000),2);
	}*/
	
	
      void operation(HashMap<Integer,Student>hm) {
    	//Iterator<Map.Entry<Integer,Student>>it=hm.entrySet().iterator();
    	for(Entry<Integer, Student> hmt:hm.entrySet()) {
    		if(hmt.getValue().dept.equals("mech")) {
    		 System.out.println(hmt);
    		}
  
    	}
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,Student>hm =new LinkedHashMap<>();
		Collections.sort(hm, new Sortid());
		//TreeMap<Student,Integer>hm =new TreeMap<>(new Sortname() );
		Main m=new Main();
		m.setdata(hm);
		
		
		//System.out.println(hm);
		//m.operation(hm);
	System.out.println(hm);
	}

}

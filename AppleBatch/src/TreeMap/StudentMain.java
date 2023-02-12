package TreeMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,Student>tm=new TreeMap<>();
		tm.put(1,new Student(1,"pramod","akkalkot"));
		tm.put(5,new Student(15,"kartik","chinchwad"));
		tm.put(3,new Student(11,"amar","mumbai"));
		tm.put(30,new Student(18,"baba","solpur"));
		tm.put(4,new Student(7,"rinku","up"));
		tm.put(16,new Student(65,"amir","pune"));
		
		System.out.println(tm);
		
		ArrayList<Student>a=new ArrayList<>();   // tree map to arraylist
		for(Student s:tm.values()) {
		   a.add(s);
			
		}
		System.out.println(a);
	   Collections.sort(a, new StudentSotname());
	   System.out.println(a);
	   
	   LinkedHashMap<Integer,Student>hm=new LinkedHashMap<>();// 
	       for(Student s:a) { 
	    	   int key=0;
	    	   for(Map.Entry<Integer, Student> st:tm.entrySet()) {
	    		   if(s.name.equalsIgnoreCase(st.getValue().name)) {
	    			   key=st.getKey();
	    			   if(!hm.containsKey(key)) {
	    				   hm.put(key, s);
	    			   }
	    		   }
	    	   }
	       }
	       System.out.println(hm);
	}

}

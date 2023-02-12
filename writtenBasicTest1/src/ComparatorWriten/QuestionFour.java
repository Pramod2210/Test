package ComparatorWriten;

import java.util.HashMap;
import java.util.LinkedList;

public class QuestionFour {
	

	void Count(LinkedList<Integer>l1,HashMap<String,Integer>hm) {
		for(Integer i:l1) {
			String name="";
		
			switch(i) {
			case 1:
				name="one";
				break;
			case 2:
				name="two";
				break;
			case 3:
				name="three";
				break;
			case 4:
				name="four";
				break;
				
			}
			if(hm.containsKey(name)) {
				int x=hm.get(name);
				hm.put(name,x+1);
			}
			else {
				hm.put(name, 1);
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<Integer>ll=new LinkedList<>();
     ll.add(1);
     ll.add(4);
     ll.add(2);
     ll.add(1);
     ll.add(3);
     ll.add(1);
     ll.add(4);
     
     HashMap<String,Integer>hm=new HashMap<>();
     QuestionFour f=new QuestionFour();
     f.Count(ll, hm);
     System.out.println(hm);
	}
}


package WrittentestArray;

import java.util.ArrayList;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Integer>it=new ArrayList<>();
       it.add(10);
       it.add(20);
       it.add(30);
       it.add(10);
       it.add(20);
       it.add(30);
       it.add(40);
       ArrayList<Integer>a=new ArrayList<>();
        for(Integer i:it) {
        	if(!a.contains(i)) {
        		a.add(i);
        	}
        }
        System.out.println(a);
	}

}

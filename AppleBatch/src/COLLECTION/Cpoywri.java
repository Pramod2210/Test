package COLLECTION;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cpoywri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<Integer> cal=new CopyOnWriteArrayList<>();
		cal.add(10);
		cal.add(10);
		cal.add(20);
		cal.add(10);
		cal.add(30);
		cal.add(40);
		cal.add(10);
		
		Iterator<Integer>it=cal.iterator();
		while(it.hasNext()) {
			if(it.next()==10) {
				cal.add(5000);   // ii is safe fail iterator
				
			}
		}
		System.out.println(cal);
			
	}
	

}

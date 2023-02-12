package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Curdoperation {
	Scanner sc=new Scanner(System.in);
	void add(ArrayList<Integer>a) {
		System.out.println("enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			a.add(sc.nextInt());
		}
		System.out.println(a);
	}
	
	void update(ArrayList<Integer>a) {
		System.out.println("enter new index and value");
		int index=sc.nextInt();
		int value=sc.nextInt();
		a.add(index, value);
		System.out.println(a);
	}
 
	void delete(ArrayList<Integer>a) {
		System.out.println("enter the value");
		int value=sc.nextInt();
		Iterator<Integer>it=a.iterator();
		while(it.hasNext()) {
		if(it.next()==value) {
				it.remove();
			}
		}
		System.out.println(a);
	}
	
	void search(ArrayList<Integer>a) {
		System.out.println("enter the id");
		int index=sc.nextInt();
		System.out.println(a.get(index));
	}

}

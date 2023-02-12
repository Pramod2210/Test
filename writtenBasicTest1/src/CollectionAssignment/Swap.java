package CollectionAssignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ArrayList<Integer>a=new ArrayList<>(); 
		 a.add(10); 
		 a.add(20); 
		 a.add(45);
		  a.add(1); 
		  a.add(23); 
		  System.out.println(a);
		 
		  ArrayList<Integer>b=new ArrayList<>();
		//int a[]= {1,2,4,6,8,7};
		
		//System.out.println(Arrays.toString(a));
		for(int i=0;i<a.size();i++) {
			b.add(b.size(), a.get(i));	
		}
		System.out.println(b);
	}
		//System.out.println(Arrays.toString(a));
	}



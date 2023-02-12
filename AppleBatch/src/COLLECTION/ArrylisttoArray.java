package COLLECTION;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrylisttoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer>a=new ArrayList<>();
    a.add(10);
    a.add(20);
    a.add(300);
    a.add(40);
    a.add(50);
    
    System.out.print(a);
    
    int arr[]=new int[a.size()];    //arrylist ti int
    for(int i=0;i<arr.length;i++) {
    	arr[i]=a.get(i);
    }
    System.out.println(Arrays.toString(arr));
	

	Integer irr[]= {1,2,3,4,5,6};   // wrapper to arrylist
	ArrayList <Integer>b=new ArrayList<>(Arrays.asList(irr));
	
	 
	int x[]= {100,101,102,103,104,105};  // int to arraylist
  ArrayList<Integer>s=new ArrayList<>();
	for(int i:x) {
		s.add(i);
	}
	System.out.println(s);
}
}


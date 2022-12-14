package Array;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //  int a[]= {60,10,40,80,20};
		char a[]= {'a','X','z','b','c','y'};
      for(int i=0;i<a.length;i++) {
    	  for(int j=0;j<a.length-1;j++) {
    		  if(a[j]>a[j+1]) {    // 
    			  
    			  char temp=a[j];
    			  a[j]=a[j+1];
    			  a[j+1]=temp;
    		  }
    	  }
      }
      System.out.println(Arrays.toString(a));
	}

}

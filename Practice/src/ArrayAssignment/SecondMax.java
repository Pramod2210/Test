package ArrayAssignment;

import java.util.Arrays;

//1. WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]
public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {20, 0, 31, 45, 100, 1, 105, 90};
        /*for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a.length-1;j++) {
        		if(a[j]>a[j+1]) {
        			int temp=a[j];
        			a[j]=a[j+1];
        			a[j+1]=temp;
        		}
        	}
        }
       // System.out.println(a.length);
       // System.out.println(Arrays.toString(a));
        System.out.println(a[a.length-2]);*/
      
      // without using second loop find max number
      
      int max=a[0];
      for(int i=1;i<a.length;i++) {
    	  if (a[i]>max) {
    		  max=a[i];
    	  }
      }
      System.out.println(max);
      
      
	}

}

package RakshaMamExtraPreparation;

import java.util.Arrays;

//2. write a program to find the second smallest element in an array without using 
//sorting technique

public class smallestNumberWithoutSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {2,8,3,1,5,7,9,15,11,18};
     int min=a[0];
     int second_min=a[0];
     for(int i=0;i<a.length;i++) {
    	if(a[i]<min) {
    		min=a[i];
    	}
     }
     for(int i=0;i<a.length;i++) {
    	if(a[i]<second_min && a[i]!=min) {
    		second_min=a[i];
    	}
     }
     System.out.println(min);
     System.out.println(second_min);
	
     // max 
     int max=a[0];
     int second_max=a[0];
     for(int i=0;i<a.length;i++) {
    	if(a[i]>max) {
    		max=a[i];
    	}
     }
     for(int i=0;i<a.length;i++) {
    	if(a[i]>second_max && a[i]!=max) {
    		second_max=a[i];
    	}
     }
     System.out.println(max);
     System.out.println(second_max);
	}

}
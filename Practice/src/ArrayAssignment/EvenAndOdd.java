package ArrayAssignment;

import java.util.Arrays;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {11,7,4,8,5,3};
     int j=-1;
     for(int i=0;i<a.length;i++) {
    	// for(int j=0;j<a.length;j++) {
    	 if(a[i]%2==0) {
    		 j++;
    		 int temp=a[i];
    		 a[i]=a[j];
    		       
    		 a[j]=temp;
    	 }
    	 
    	 }
     
     
     System.out.println(Arrays.toString(a));
     }
	}



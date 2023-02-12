package ArrayAssignment;

import java.util.Arrays;

public class Average {
//1. WAP to calculate average of all elements in an Array except max and min element 
//	(Means don’t include the highest and lowest number of your array in your average).
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // int a[]= {10,20,30,40,50,60,70};
         int sum=0;
        /* for(int i=1;i<a.length-1;i++) {
        	 sum=sum+a[i];
         }
         System.out.println(sum);*/
        
         
         int b[]= {20,40,60,30,10,50};
         Arrays.sort(b);
         for(int i=1;i<b.length-1;i++) {
        	 sum=sum+b[i];
        	 }
         System.out.println(sum);
         System.out.println(Arrays.toString(b));
         }

        	 
         
	
}


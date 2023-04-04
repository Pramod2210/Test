package Create;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrylista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {10,3,7,2,18,5,17}; 
		 System.out.println(a.length);
	     ArrayList<Integer>arr=new ArrayList<>();                    //[2, 3, 5, 7, 10, 17, 18]
	      Arrays.sort(a);                              //               0  1  2  3  4    5   6
	      int count=0;
	      System.out.println(Arrays.toString(a));       //2 3 10 5 18 7
	      for(int i=0;i<a.length;i++) { //0   1 2 3  6
	    	 if (count==0) {
	    	 if(i%2==0) {
	    		 for(int k=0;k<=a.length;k++) { 
	    			 if(k!=a.length-1) {                        //  0 1 2 3 4
	    		if(a[k]%2==0) {
	    			if(!arr.contains(a[k])) {
	    			arr.add(a[k]) ; 
	    			  break;   
	    		}
	    		}
	    			 }
	    			else {
	    				if(k==a.length) {
	    					count++;
	    					break;
	    				}
	    			}
	    	 }
	    	 }
	    	 
	    	 else {
	    		 for(int k=0;k<a.length;k++) {//3
	    			
	    			 if(k!=a.length-1) {
	    		 if(a[k]%2!=0) {
	    			 if(!arr.contains(a[k])) {
	 	    			arr.add(a[k]) ;
	    			     break;
	    		 }
	    		 }
	    			 }
	    			 else {
	    				 if(k==a.length-1) {
	    					 count++;
	    					 System.out.println("pramod");
	    					 break;
	    				 }
	    			 }
	    	 }
	      }
	      
	      }
	
	    	 else {
	    		 for(int k=0;k<a.length;k++) {//3
		    		 
		    			 if(!arr.contains(a[k])) {
		 	    			arr.add(a[k]) ;
	    	 }
		    		 }
	    	 }
	      }
	      System.out.println(arr);
	
	}
}

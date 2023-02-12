package vithamas;

import java.util.Arrays;

public class commonElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {10,20,10,30,40,10,20,30};
 
     for(int i=0;i<a.length;i++) {
    	 if(a[i]!=0) {
    	 for(int j=i+1;j<a.length;j++) {
    		 if(a[i]==a[j]) {
    			 a[j]=0;
    		 }
    	 }
     }
     }
     for(int i=0;i<a.length;i++)
    	 if(a[i]!=0) {
     System.out.print(a[i]+",");
	}
	}
}

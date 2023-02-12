package vithamas;

import java.util.Arrays;

public class RemoveCommonFromTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {10,20,30,40,50,60};
      int b[]= {11,12,10,15,20,30};
      int c[]=new int[a.length+b.length];
      for(int i=0;i<a.length;i++) {
    	  for(int j=0;j<b.length;j++) {
    		  if(a[i]==a[j]) {
    			 c[i]=a[i];
    			
    		  }
    	  }
      }
      System.out.println(Arrays.toString(c));
      
	}

}

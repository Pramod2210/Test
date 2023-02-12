package ArrayAssignment;

import java.util.Arrays;

public class ReplaceWithimmidateSquare {
//13. WAP to replace all negative value with its immediate left elements square. Means 
	//arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
	//		Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49]. 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {12, 3, -19, 29, 5, -61, 44, 7, -9};
      
      for(int i=0;i<a.length;i++) {
    	  if(a[i]<0) {
    		//a[i]=a[i-1]*a[i-1];
    		  a[i]=(int) Math.pow( a[i-1],2);
    	  }
      }
      System.out.println(Arrays.toString(a));
		
	}

}

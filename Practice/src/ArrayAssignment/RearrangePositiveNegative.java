package ArrayAssignment;

import java.util.Arrays;

public class RearrangePositiveNegative {
 // 15. WAP to arrange the elements of an given array of integers where all negative 
	//integers appear before all the positive integers.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {10,-2,4,5,8,-5,-9,3};
      for(int i=0;i<a.length;i++) {
    	  for(int j=0;j<a.length-1;j++) {
    	  if(a[j]>a[j+1]) {
    		  int temp=a[j];
    		  a[j]=a[j+1];
    		  a[j+1]=temp;
    				  
    	  }
      
      
      }
      }
      System.out.println(Arrays.toString(a));
	

}
}

package Create;

import java.util.Arrays;

public class ArrayEvenOdd {
                                                   //2,3,10,5,18,7,17
	public static void main(String[] args) {      // 0 1  2 3  4 5 6 
		// TODO Auto-generated method stub
		
     int a[]= {10,3,7,2,18,5,17};                      
     int b[]=new int[a.length];                    //[2, 3, 5, 7, 10, 17, 18]
      Arrays.sort(a);                              //  0  1  2  3  4    5   6
      
      System.out.println(Arrays.toString(a));       //2 3 10,
      for(int i=0;i<a.length;i++) { //0  1 2 3 
    	 
    	 if(i%2==0) {
    		 for(int k=i;k<a.length;k++) { //
    		if(a[k]%2==0) {
    			b[i]=a[k];              
    			  break;   
    		}
    	 }
    	 }
    	 else {
    		 for(int k=i;k<a.length;k++) {//3
    		 if(a[k]%2!=0) {
    			 b[i]=a[k];
    			     break;
    			   
    		 }
    	 }
      }
      }
      System.out.println(Arrays.toString(b));
	}

}

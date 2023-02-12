package ArrayAssignment;

import java.util.Arrays;

//9. Write a Java program to test the equality of two arrays. Means e.g arr1[] = [12, 22, 
//32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] 
public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {12, 22, 32, 42, 52, 62};
     
     int b[]= {22,52,62,12,42,32};
    int count=0;
   //Arrays.sort(a);
  // Arrays.sort(b);
  int s1=a.length;
  //int s2=b.length;
 // if(s1==s2) {
     
         for(int i=0;i<a.length;i++) {
        	for(int j=0;j<b.length;j++) 
        		 if(a[i]==b[i]) {
        		  count=count+1;
        		  
        		 }
        		
        	 }
         
         System.out.println(count);
         if(count==s1) {
        	 System.out.println("same");
         }
         else {
        	 System.out.println("not");
}
  }     
	}



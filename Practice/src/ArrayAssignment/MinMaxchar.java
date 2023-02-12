package ArrayAssignment;

import java.util.Arrays;

public class MinMaxchar {
//17. WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, 
	//‘R’], so min character is ‘A’. 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c[]={'A', 'D', 'E', 'x','R','Z','p'};
   for(int i=0;i<c.length;i++) {
	   for(int j=0;j<c.length-1;j++) {
		  if( c[j]>c[j+1]){
			 char temp=c[j] ;
			 c[j]=c[j+1];
			 c[j+1]=temp;
		  }
		   
	   }
	   //System.out.println(c[0]);
   }
   System.out.println("min : "+c[0]);
   System.out.println("max : "+c[c.length-1]);
   System.out.println(Arrays.toString(c));

		
		
	}

}

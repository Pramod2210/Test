package Create;

import java.util.Scanner;

public class Dissopained {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //  Scanner sc=new Scanner(System.in);
     // int size=sc.nextInt();
      int a[]= {15,2,4,54,3};
      int output=0;
      for(int i=0;i<a.length;i++) {
    	  int count=0;
    	
    	  int num=a[i];
    	  while(num>0) {
    		  num=num/10;
    		  count++;
    	  }
    	  if(count==1) {
    		  output++;
    	  }
      }
      System.out.println(output);
	}

}

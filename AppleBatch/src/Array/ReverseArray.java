package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {60,50,40,30,20,10};
     int n=a.length;
     int mid=n/2;
     int temp;
     System.out.println(Arrays.toString(a));
     for(int i=0;i<mid;i++) {
    	temp=a[i];
    	a[i]=a[n-i-1];
    	a[n-i-1]=temp;
     }
     System.out.println(Arrays.toString(a));
     
	}

}

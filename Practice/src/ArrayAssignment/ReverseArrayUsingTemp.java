package ArrayAssignment;

import java.util.Arrays;

//4. WAP to reverse the array itself, don’t print array in reverse – I want current array 
//reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 
//37, 29, 45, 90, 3] by using temporary array. 
public class ReverseArrayUsingTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a[]= {3, 90, 45, 29, 37, 78};
       int n=a.length;
       int mid=n/2;
       for(int i=0;i<mid;i++) {
    	   int temp=a[i];
    	   a[i]=a[n-i-1];
    	   a[n-i-1]=temp;
       }
       System.out.println(Arrays.toString(a));
	}

}

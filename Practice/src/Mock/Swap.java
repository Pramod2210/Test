package Mock;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {1,4,7,3,2,6};
   int mid=a.length/2;
   for(int i=0;i<mid;i++) {
	   int temp=a[i];
	   a[i]=a[mid+i];
	   a[mid+i]=temp;
   }
   System.out.println(Arrays.toString(a));
	}  

}

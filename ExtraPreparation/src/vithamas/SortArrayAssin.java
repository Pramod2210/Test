package vithamas;

import java.util.Arrays;

public class SortArrayAssin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {10,8,4,1,18,9,7};
     int temp=0;
     for(int i=0;i<a.length;i++) {
    	 for(int j=i+1;j<a.length;j++) {
    		 if(a[i]>a[j]) {
          temp=a[i];
    	 a[i]=a[j];
    	 a[j]=temp;
     }
	}
}
System.out.println(Arrays.toString(a));
}
}
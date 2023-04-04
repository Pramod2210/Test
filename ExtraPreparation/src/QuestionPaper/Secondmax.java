package QuestionPaper;

import java.util.Arrays;

public class Secondmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,9,5,55,77,3};
     int l=a.length;
    /* int h=Integer.MIN_VALUE;
     int s=Integer.MIN_VALUE;
     
     for(int i=0;i<l;i++) {
    	 if(a[i]>h) {
    		 s=h;
    		 h=a[i];
    	 }
    	 if(a[i]<h && a[i]>s) {
    		 s=a[i];
    	 }
     }
     System.out.println(s);*/
     
     System.out.println(Arrays.toString(a));
     while(l>0) {
    	 for(int i=0;i<l;i++) {
    		 l--;
    		 if(a[i]>a[i+1]) {
    			 int temp=a[i];
    			 a[i]=a[i+1];
    			 a[i+1]=temp;
    		 }
    	 }
     }
     System.out.println(Arrays.toString(a));
     System.out.println(a[a.length-2]);
	}

}

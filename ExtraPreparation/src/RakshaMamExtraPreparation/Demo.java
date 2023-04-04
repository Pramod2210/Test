package RakshaMamExtraPreparation;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*ArrayList<String>a=new ArrayList<>();
         a.add("A+5");
         a.add("b+15");
         a.add("c+35");
         a.add("d+55");
         
         for(String s:a) {
        	 String a1[] =s.split("+");
        	 System.out.println(Arrays.toString(a1));*/
		
		int a[]= {4,2,4,1,3};
		for(int i=0;i<a.length;i++) {
			a[i]=a[(a[i]+3)%a.length];
	}
		System.out.println(a[1]);
        

}
}
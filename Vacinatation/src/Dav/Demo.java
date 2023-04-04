package Dav;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Integer> d=new ArrayList<>();
		List<Integer> a=new ArrayList<>();
		List<Integer> b=new ArrayList<>();
		a.add(5);
		a.add(4);
		a.add(7);
		
		b.add(3);
		b.add(6);
		b.add(10);
		
		  int x[]=new int [a.size()];
	        int y[]=new int [b.size()];
	        int l=0;
	        		int m=0;
	       
	        int k=0;
	        int j=0;
	        for(Integer i:a){
	            x[k]=i;
	            k++;
	        }
	        for(Integer i:b){
	            y[j]=i;
	            j++;
	        }
	       
	        for(int i=0;i<x.length;i++){
	       
	            if(x[i]>y[i]){
	              l=l+1;
	            }
	            else if(x[i]<y[i]){
	                m=m+1;
	            }
	        }
	        System.out.println(l+" "+m);
	           d.add(l);
	        d.add(m);
	    System.out.println(d);        
		

}
}

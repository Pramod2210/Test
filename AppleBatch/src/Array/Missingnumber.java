package Array;

public class Missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {1,3,5,7,9};
       int j=1;
       for(int i=0;i<a.length;i++) {
    	   if(a[i]!=j) {
    		   System.out.println(j);
    		   //j++;
    		   i--;
    	   }
    	   j++;
       }
       
       
       
       // continus missing  number
       
      /* int count =0;
       for(int i=a[0];i<a[a.length-1];i++) {
    	   if(a[count]==i) {
    		   count++;
    	   }
    	   else {
    		   System.out.println(i);
    	   }
       }*/
	}

}

package Myexamo;

public class AverageOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {1,2,3,4,5,6,7};
      int sum=0;
      int count=0;
      for(int i=0;i<a.length;i++ ) {
    	  if(i%2!=0) {
    		  sum=sum+a[i];
    		  count++;
    	  }
      }
      int avg=sum/count;
      System.out.println(avg);
	
	}
}

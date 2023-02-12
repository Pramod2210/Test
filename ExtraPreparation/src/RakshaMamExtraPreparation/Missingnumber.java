package RakshaMamExtraPreparation;

public class Missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a[] ={1,2,4,5,9,12,15};
	      int j =1;
	      
	      for(int i = 0;i< a.length;i++) 
	      {
	    	  if(a[i] == j) 
	    	  {
	     		  j++; 
	    	  }
	    	  else
	    	  {
	    		  System.out.print(j+" ");
	    		  j++;
	    		  i--;
	    	  }
	      }
	      
		}
}

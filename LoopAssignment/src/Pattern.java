
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int i=9;i>0;i--) {
    	   for(int g=1;g<=i;g++) {
    		   System.out.print(" ");
    	   }
    	   for(int k=8;k>=i;k--)
    	   {
    		   System.out.print(k);
    	   }
    	   for(int j=9;j>=i;j--) {
    		   
    		   System.out.print(j);
    	   }
    	   System.out.println();
    	   
       }
	}

}

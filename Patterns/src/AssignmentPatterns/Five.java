package AssignmentPatterns;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*");
      for(int i=1;i<=5;i++) {
    	  System.out.print("*");
    	  for(int j=1;j<=i;j++) {
    		  System.out.print(j);
    	  }
    	  for(int j=i-1;j>=1;j--) {
    		  System.out.print(j);
    	  }
    	  System.out.print("*");
    	  System.out.println();
      }
      for(int i=5;i>0;i--) {
    	  System.out.print("*");
    	  for(int j=1;j<=i;j++) {
    		  System.out.print(j);
    	  }
    	  for(int j=i-1;j>=1;j--) {
    		  System.out.print(j);
    	  }
    	  System.out.print("*");
    	  System.out.println();
      }
	}

}

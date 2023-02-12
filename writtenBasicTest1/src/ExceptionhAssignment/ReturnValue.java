package ExceptionhAssignment;
//1.	WAP to return int value in try block and return int value in 
//finally block and observe which return takes precedence.

public class ReturnValue {
	int dispaly() {
		
		try {
			System.out.println("hi");
	    	  return 10;
	    	
	       }
	       catch(ArithmeticException e) {
	    	   System.out.println(e);   
	       }
		
	       finally {
	    	  return 100;
	       }
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnValue r=new ReturnValue();
		  System.out.println(r.dispaly());
       }
	}



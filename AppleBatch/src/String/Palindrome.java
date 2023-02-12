package String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="Nayan";     
      String Reversed="";   
     
   for(int i=s.length()-1;i>=0;i--) {
    	Reversed=Reversed+s.charAt(i);
    }
    System.out.println(Reversed);
    if(Reversed.equalsIgnoreCase(s)) {
    	System.out.println("given string is palindrome");
    }
    else {
    	System.out.println("given string is not palindrome");
    }
   
    // Geeta ion leave till friday 
 //leave using for loop 
 //it is substring or not;
    }
    	
    	 
     
  
      
      
    
	
}

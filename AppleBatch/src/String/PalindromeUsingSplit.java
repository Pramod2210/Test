package String;

public class PalindromeUsingSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="nayan";
    String s2="";
      String[] s1=s.split(" ");
      for(int i=0;i<s1.length;i++) {
      	for(int j=s1[i].length()-1;j>=0;j--) {
      		
      		s2=s2+(s1[i].charAt(j));
      	}
      }
    
      if(s2.equalsIgnoreCase(s)) {
    	  System.out.println("palindrome");
      }
      else {
    	  System.out.println("not");
      }
    	
      
      
	}

}
	



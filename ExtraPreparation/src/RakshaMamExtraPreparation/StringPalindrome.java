package RakshaMamExtraPreparation;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="samas";
     String temp=s;
       String reverse="";
       for(int i=s.length()-1;i>=0;i--) {
    	   reverse=reverse+s.charAt(i);
       }
     
       if(temp.equalsIgnoreCase(reverse)) {
    	   System.out.println("palindrome");
       }
       else {
    	   System.out.println("not palindrome");
       }
	}

}

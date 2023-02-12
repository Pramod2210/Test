

	import java.util.*; 
	import java.io.*;

	class Main {

	  public static String PalindromicSubstring(String str) {
	    // code goes here 
	  
	    char ch[]=str.toCharArray();
	    
	   for(int i=0;i<ch.length;i++){
	     for(int j=ch.length-1;j>=0;j--){
	       if(ch[i]==ch[j]){
	          str=str+ch[i];
	       }
	     }
	   }
	    return str;
	  }
	  

	    

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter");
	      String str=s.next();
	    System.out.print(PalindromicSubstring(s.nextLine())); 
	  }


	
}


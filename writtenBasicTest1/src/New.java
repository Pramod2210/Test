import java.util.*; 
	import java.io.*;
public class New {
	

	

	  public static String PalindromicSubstring(String str) {
	    // code goes here 
	     int start=0,end=0;
	     for(int i=0;i<str.length();i++) {
	    	int len1= expandFromCenter(str,i,i+1);
	    	int len2= expandFromCenter(str,i,i);
	    	int len=Math.max(len1, len2);
	    	 if(end-start<len) {
	    		 start=i-(len-1)/2;
	    		 end=i+len/2;
	    	 }
	     }
	 
	    return str.substring(start, end+1);
	  }
	
	  private static  int expandFromCenter(String str, int i, int j) {
		if(i>=0 && j<str.length()&& str.charAt(i)==str.charAt(j)) {
			i--;j++;
		}
		return j-i-1;
	}




	public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	  
	    System.out.print(PalindromicSubstring(s.nextLine())); 
	  }

	}


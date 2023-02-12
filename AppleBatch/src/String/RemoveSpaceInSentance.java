package String;

import java.util.Arrays;

public class RemoveSpaceInSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="pramod is good boy";
      s.toCharArray();
       
       for(int i=0;i<s.length();i++) {
    	   if(s.charAt(i)==' ') {
    		   continue;
    	   }
       System.out.print(s.charAt(i));
	}
    //System.out.println(s.replaceAll("\\s+",""));
	}
}

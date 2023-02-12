package String;

import java.util.Arrays;

public class SplitAndReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="java is a good programming language";
    String s1[]=s.split("");
    //System.out.println(Arrays.toString(s1));
     //String s
    for(int i=0;i<s1.length;i++) {
    	for(int j=s1[i].length()-1;j>=0;j--) {
    		
    		System.out.print(s1[i].charAt(j));
    	}
    	System.out.println();
    }
	}
}
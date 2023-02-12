package StringAssignment;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HELLOW WORLD";
		char ch []=s.toCharArray();
		
		String s1[]= s.split(" ");
		

		for(int i=0;i<s1.length;i++) {
			
				System.out.println(s1[i]);
			}
		}
			
	
     /*StringTokenizer t=new StringTokenizer(s);
   while(t.hasMoreTokens()) {
     System.out.println(t.nextToken());*/
	}
	
	


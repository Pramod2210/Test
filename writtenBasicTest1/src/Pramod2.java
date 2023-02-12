import java.util.Scanner;

public class Pramod2 {
	
	public String longestpalindrome(String s) {
		
		int start=0,end=0;
		for(int i=0;i<s.length();i++) {
		int len1 = expandFromCenter(s,i,i+1);
		int len2= expandFromCenter(s,i,i);
		int len3=Math.max(len1, len2);
		if(end-start<len3) {
			start=i-(len3-1)/2;
			end=i+len3/2;
			
		}
		}
		/*if(s.substring(start, end+1)==null) {
			System.out.println("none");
		}*/
	
		return s.substring(start, end+1);
	}

	 int expandFromCenter(String s, int i, int j) {
		while(i>=0 && j<s.length()&& s.charAt(i)==s.charAt(j)) {
			i--;j++;
		}
		return j-i-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner (System.in);
      String s="abanayanbcb";
      Pramod2 p=new Pramod2();
      System.out.println(p.longestpalindrome(s));
	}

}

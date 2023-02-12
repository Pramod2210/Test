package StringAssignment;

public class countOccouramce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" poojashree ";
		char[] s1=s.toCharArray();
		int count=0;
		
	  for(int i=0;i<s1.length-1;i++) {
		 if(s1[i]==s1[i+1]) {
			count++;
		 }
	}
	  System.out.println(count);
	}
}

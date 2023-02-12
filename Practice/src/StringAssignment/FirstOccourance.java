package StringAssignment;

public class FirstOccourance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="pojashree";
		char[] s1=s.toCharArray();
	  for(int i=0;i<s1.length;i++) {
		 if(s1[i]==s1[i+1]) {
			 System.out.println(s1[i]);
			 break;
		 }
	
	}
	}
}

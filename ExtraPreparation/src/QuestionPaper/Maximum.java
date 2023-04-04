package QuestionPaper;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1="sudarshan";
       String s2="sua";
       System.out.println(issubstring (s1,s2));
	}

	public static boolean issubstring(String s1,String s2) {
		int a=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==s2.charAt(a)) {
				a++;
			}
			if(a==s2.length()) {
				return false;
			}
			else {
				a=0;
			}
		}
		return true;
	}
}

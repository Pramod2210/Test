package StringAssignment;

public class Abcabcab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcaabbbcaab";
		String s1 = "bca";
		String s5 = "";
		char[] s2 = s.toCharArray();
		char[] s3 = s1.toCharArray();
		for (int i = 0; i < s2.length; i++) {
			System.out.println("gi");
			for (int j = 0; j < s3.length; j++) {
				System.out.println("hi");
				if (s3[j] == s2[i]) {
					System.out.println("by");
					s5 = s5 + s2[i];
				}
			}
			if (s5 == s1) {
				System.out.println(s5);
			}
		}
	}

}

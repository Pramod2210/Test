package StringAssignment;

import java.util.Arrays;

public class RemoveLastOccranmce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world"; // helloword
		char[] ch = s.toCharArray();
  char s2=' ';
  String s3="";
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			int store=0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					 count++;
				}
				if (count >2  && ch[i] == ch[j]) {

					ch[j] = 0;

				}

			}

		}

		for (int i = ch.length - 1; i >= 0; i--) {
			if (ch[i] == 0) {
				continue;
			}
			
		}

		System.out.print(Arrays.toString(ch));
		String s5=new String(ch);
		System.out.println();
		System.out.println(s5);

	}
}

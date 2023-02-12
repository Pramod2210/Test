
package MockPreparation;

public class Stringtotoint {
	public static void main(String[] args) {
		String s = "1234";
		int count = 0;
		int num = Integer.parseInt(s);
		long sum = 1;
		while (num > 0) {
			int r = num % 10;
			int product = 0;
			for (int i = 1; i <= 3; i++) {
				product = r * i;
				sum = sum * product;
			}
			num = num / 10;
		}
		String s1 = String.valueOf(sum);
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("number is passinate");
		} else {
			System.out.println("not pasinate");
		}
		System.out.println(sum);

	}
}

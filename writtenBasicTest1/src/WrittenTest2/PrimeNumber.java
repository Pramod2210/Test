package WrittenTest2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int num = 400; num >= 300; num--) {
			int i = 2;
			int mid = num / 2;
			while (i <= mid) {
				if (num % i == 0) {
					break;
				}
				i++;
			}

			if (i > mid) {
				System.out.println(num);
			}
		}

	}
}

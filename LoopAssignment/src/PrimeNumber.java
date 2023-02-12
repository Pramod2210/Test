
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 400; i >= 300; i--) {
			int mid = i / 2;
			int j = 2;
			while (j <= mid) {
				if (i % j == 0) {
					break;
				}
				j++;
			}
			if (j >mid) {
				System.out.println(i);
			}
		}
	}

}

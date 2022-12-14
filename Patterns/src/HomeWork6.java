
public class HomeWork6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 4; i++) {
			int a = 0, b = 1, c;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(a);
				c = a + b;
				a = b;
				b = c;

			}
			System.out.println();
		}
	}

}

package AssignmentPatterns;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 4; i > 0; i--) {
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

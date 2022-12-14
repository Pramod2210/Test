
public class thinktive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = 1; k <= 5 - 2 * i; k++) {
				System.out.print(" ");
			}
			for(int l=5;l>5-i;l--) {
				if(l>=4)
			System.out.print(l);
		}
			System.out.println();
	}
}
}
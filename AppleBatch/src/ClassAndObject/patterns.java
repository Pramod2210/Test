package ClassAndObject;

public class patterns {
	
	void star() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void number() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				if (i%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      patterns p=new patterns();
      p.star();
      p.number();
	}

}

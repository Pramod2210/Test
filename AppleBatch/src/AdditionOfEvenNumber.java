
public class AdditionOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i = 1,
		int sum = 0;

		/*
		 * while (i <= 8) { //2+4+6+8 if (i % 2 == 0) { sum = sum + i; } i++; }
		 */
		for(int i=1;i<=8;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}

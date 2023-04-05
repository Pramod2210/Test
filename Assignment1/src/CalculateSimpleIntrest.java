
public class CalculateSimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 10000;
		float s;
		float t = 1, r = 2; // t indicate time in month p and r indicate rate of interest.
		s = (p * t * r) / 100;

		System.out.println("Simple interst per month : " + s);
	}

}

package String;

public class RemoveNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java5Core8language9";
		int sum = 0;
		int i1 = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
				
				sum=sum+s.charAt(i)-48;
			//if (s.charAt(i) <= 57) {
			//	sum=sum+Character.getNumericValue(s.charAt(i));
			}

		}
	
		System.out.println(sum);
	}
}

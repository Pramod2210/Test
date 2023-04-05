import java.util.Scanner;

public class CalculatePercentage {

	public static void main(String[] args) {
		int English, Maths, Science, Hindi, History;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Obtained Marks in English ");
		English = scan.nextInt();
		System.out.println("Enter the Obtained Marks in Maths ");
		Maths = scan.nextInt();
		System.out.println("Enter the Obtained Marks in Science ");
		Science = scan.nextInt();
		System.out.println("Enter the Obtained Marks in Hindi ");
		Hindi = scan.nextInt();
		System.out.println("Enter the Obtained Marks in History ");
		History = scan.nextInt();
		double Percentage = ((English + Maths + Science + Hindi + History)*100)/500;
		
		System.out.println("The Obtained Percentage is: " + Percentage);
		
		
	}
	

}

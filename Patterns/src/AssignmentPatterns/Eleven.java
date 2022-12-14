package AssignmentPatterns;

public class Eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   for(char ch='F';ch>='A';ch--) {
	   for(char ch1='A';ch1<=ch;ch1++) {
		   System.out.print(ch1+" ");
	   }
	   System.out.println();
   }
   for(char ch='A';ch<='F';ch++) {
	   for(char ch1='A';ch1<=ch;ch1++) {
		   System.out.print(ch1+" ");
	   }
	   System.out.println();
   }
	   
   }

}

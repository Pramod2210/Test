
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   for(char ch='a';ch<='d';ch++) {
	   for(char ch1='d';ch1>ch;ch1--) {
		   System.out.print(" ");
	   }
	   for(char ch2='a';ch2<=ch;ch2++) {
		   System.out.print(ch2+" ");
	   }
	   System.out.println();
   }
	}

}

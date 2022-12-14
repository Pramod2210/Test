package AssignmentPatterns;

public class Sixteen {

	public static void main(String[] args) {
		for(char ch='A';ch<='F';ch++) {       //a
			for(char ch1='F';ch1>ch;ch1-- ) {  //-----A
				                             // ----A B
				System.out.print(" " );
			}
			for(char ch2='A';ch2<=ch;ch2++) {
				System.out.print(ch2+" ");
			}
			System.out.println();
		}
        for(char ch='A';ch<='F';ch++) {
        	for(char ch1='F';ch1>=ch;ch1--) {
        		System.out.print(ch1+" ");
        	}
        	System.out.println();
        }
	}

}
package AssignmentPatterns;

public class Seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char ch='A';ch<='F';ch++) {
        	for(char ch1='F';ch1>=ch;ch1--) {
        		System.out.print(ch1+" ");
        	}
        	System.out.println();
        }
	}

}

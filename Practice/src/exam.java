

	import java.io.BufferedReader;
	import java.io.InputStreamReader;
import java.util.Scanner;


	class Main {
	    public static void main(String args[] ) throws Exception {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // read the name from the input
	        String input_from_question = br.readLine();

	      	//Write your answer here
	    Scanner Sc= new Scanner(System.in);
	    int num= Sc.nextInt();
	      int sum=0;
	      
	     
		while(num !=0){
	        int r= num % 10;
	        sum= sum + r ;
	        num = num / 10;
	        
	      }

	        System.out.println(sum);
	      
	        System.out.println(input_from_question);

	    }
	}



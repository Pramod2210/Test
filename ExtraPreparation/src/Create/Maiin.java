package Create;


	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
import java.util.Iterator;

	public class Maiin {
	    public static void main(String args[] ) throws Exception {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        // read the name from the input
	      //  String input_from_question = br.readLine();

	      	//Write your answer here
	      ArrayList<Integer>a=new ArrayList<>();
	      ArrayList<Integer>a1=new ArrayList<>();
	    for(int i=0;i<6;i++){
	    	System.out.println("enter");
	       String input_from_question = br.readLine();
	      int x=Integer.parseInt(input_from_question);
	      a.add(x);
	    }
	    System.out.println(a);
	     
	        for(Integer i:a) {
	        	
	        	if(!a1.contains(i))	{
	        		a1.add(i);
	        	}
	        	
	        
	         }
	       

	    
	
	        System.out.println(a1);
	      }
}

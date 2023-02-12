package EnomDemo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Rainbow rb=Rainbow.orange;
   System.out.println(rb.ordinal());
   rb.display();
   Rainbow rbc[]=Rainbow.values();
   
   for(Rainbow r1:rbc) {
	   System.out.println(r1.ordinal()+" "+r1);
   }
   System.out.println(Arrays.toString(rbc));
	}

}

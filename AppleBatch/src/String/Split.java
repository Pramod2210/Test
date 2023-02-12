package String;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="pramod is good boy";
   
   for(String s1:s.split(" ")){
	   
	   if(s1.equalsIgnoreCase("good")) {
		   System.out.println(s1);
	   }
	   
   }
	   
   }
	}


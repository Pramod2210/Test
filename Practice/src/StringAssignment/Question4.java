package StringAssignment;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="poojashree";
      char ch []= s.toCharArray();
      
      for(int i=0;i<ch.length-1;i++) {
    	  if(ch[i]!=ch[i+1]) {
    		  System.out.println(ch[i]);
    	  }
      }
	}
	
}

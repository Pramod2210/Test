package CustomException;

public class Marks {
     void marks(int marks) throws marksNotvallidException {
    	  if(marks==0) {
    		 throw new marksNotvallidException ("marks not zero");
    	  }
    	  else {
    		  System.out.println(marks);
    	  }
     }
	public static void main(String[] args) throws marksNotvallidException {
		// TODO Auto-generated method stub
		Marks m=new Marks();
		m.marks(0);
	}

}

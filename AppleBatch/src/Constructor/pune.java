package Constructor;

public class pune {
  int id;
  String name;
  static String un="Pune University";
  static String State ="maharashtra";
  
  pune(){
	  id=1;
	  name="pramod";
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  pune s=new pune();
      System.out.println(un);
      System.out.println(s.id);
	}

}

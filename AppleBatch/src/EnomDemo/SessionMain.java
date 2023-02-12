package EnomDemo;

public class SessionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Session s[]= Session.values();
    for(Session s1:s) {
    	System.out.println(s1);
    	s1.Discription();
    }
    }

}


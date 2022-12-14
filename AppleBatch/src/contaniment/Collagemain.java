package contaniment;

public class Collagemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Department d=new Department();
   d.setDid(1258);
   d.setDname("mechanical");
   
   Liabrary l= new Liabrary();
   l.setBooks(1000);
   l.setInchargeName("pramod");
   
   Collage c=new Collage();
   c.setCid(12545);
   c.setCname("jspm");
   c.setAddress("pune");
   c.setDept(d);
   c.setLib(l);
   
   System.out.println(c);
	}

}

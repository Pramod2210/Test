package Inhertance;

public class FatherSonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Son s=new Son();
     s.setAge(15);
     s.setName("raj");
     s.Address();
     System.out.println(s);
     System.out.println(Father.surname);
      System.out.println("-*****---* doughter detail --*****");
      
      Doughter d=new Doughter();
    	d.setAge(22);  
    	d.setName("riya");
    	d.Address();
    	System.out.println(d);
    	System.out.println(Father.surname);
      
	}

}

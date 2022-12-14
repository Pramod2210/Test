package Overriding;

public class IplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Csk c=new Csk();
      c.setPlayers(12);
      c.setRun(115);
      c.setPlayers(1);
      
      
      
      Rcb r=new Rcb();
      r.setPlayers(14);
      r.setRun(132);
      
      c.play();
      r.play();
	}

}

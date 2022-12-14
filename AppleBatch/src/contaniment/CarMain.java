package contaniment;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Engine e1=new Engine();
    e1.setRpm(1200);
    e1.setPower(1250);
    e1.setSpeed(60);
    
   Car c= new Car();
      c.setId(1);
      c.setName("Swift");
      c.setPrice(15000);
      c.setE(e1);
        
        System.out.println(c.getId()+c.getName()+c.getPrice());
     System.out.println(c.getE()); 
      
      
	}

}

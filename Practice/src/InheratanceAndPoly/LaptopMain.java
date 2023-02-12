package InheratanceAndPoly;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Laptop l=new Laptop();
  l.setNoOfUsbPoart(3);
  l.setProcesserSpeed(156);
  
  System.out.println("No of Ports : "+l.getNoOfUsbPoart()+"\nProcesser Speed :"+l.getProcesserSpeed());
	}

}

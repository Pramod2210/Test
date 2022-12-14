package Interface;

public class Fca implements Project  {
 
	public void requirments() {
		System.out.println("all part detail, drawing,ppap");
	}
	
	public void deadline() {
		System.out.println("1 year");
	}

	@Override
	public void planning() {
		System.out.println("planning map");
			
		}
		
	

	@Override
	public void design() {
		// TODO Auto-generated method stub
		System.out.println("design");
	}

	@Override
	public void testing() {
		// TODO Auto-generated method stub
		System.out.println("test riding");
	}

	@Override
	public void deployment() {
		// TODO Auto-generated method stub
		System.out.println("deployment");
	}

	@Override
	public void maintanance() {
		System.out.println("1 year warenty");
	}
	
	}


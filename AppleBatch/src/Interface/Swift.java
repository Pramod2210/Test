package Interface;

public class Swift implements TestCar {
	
	@Override
	public void milage() {
		// TODO Auto-generated method stub
		System.out.println("80");
	}

	@Override
	public void crash() {
		// TODO Auto-generated method stub
		System.out.println("crash");
	}

	@Override
	public void speedtest() {
		// TODO Auto-generated method stub
		System.out.println("80km/hr");
	}

	@Override
	public void breaktest() {
		// TODO Auto-generated method stub
		System.out.println("breakfast");
	}

	@Override
	public void loadtesting() {
		// TODO Auto-generated method stub
		System.out.println("loadtesting");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Swift s=new Swift();
        s.breaktest();
        s.crash();
        s.milage();
        s.speedtest();
        s.loadtesting();
	}

}

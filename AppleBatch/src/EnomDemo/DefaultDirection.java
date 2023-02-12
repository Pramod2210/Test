package EnomDemo;

public enum DefaultDirection {
 east(150),west(200),north(350),south(400);
	int rate;
	private DefaultDirection(int rate){
		this.rate=rate;
		System.out.println("default");
	}
	/*DefaultDirection(){
		System.out.println("fgh");
	}*/
}

package MockPreparation;

public class y extends x {
	y show() {
		super.show();
		System.out.println("y is show");
		return this;
	}
	
	public static void main(String[] args) {
		y a=new y();
		a.show();
	}
    
}

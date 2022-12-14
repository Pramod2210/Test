package Constructor;

public class Default {
	int i,s;
	float f;
	String n;
	
	Default(){
		i=1;
		s=5;
		f=0.5f;
		n="pppp";
				
	}
 void display() {
	 System.out.println(i+" "+s+" "+f+" "+n);
 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Default d= new Default();
     d.display();
	}

}

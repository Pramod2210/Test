package Constructor;

public class ConstructorChainning {
	
	
	ConstructorChainning() {

		System.out.println("const 1");
		System.out.println("***");
	}

	ConstructorChainning(int i) {
		this(10,20);
		System.out.println(i);
	}

	ConstructorChainning(int x, int y) {
		this(10,20,30);
		System.out.println("const 3");
	}

	ConstructorChainning(int x,int y,int z){
	
		System.out.println("const 4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChainning c= new ConstructorChainning(10,20);
		
	    
	}

}

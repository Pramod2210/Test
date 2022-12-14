package Constructor;

public class InstanceBlock {
	int id;
	String name;
	
	{
		System.out.println("instance block 1");
		id=1;
		name="pramod";
	}
	{
		System.out.println("instance block 2");
		id=2;
		name="patil";
	}
	InstanceBlock(){
		System.out.println("in simple constructor");
		id=3;
		name="Pravin";
	}
	void display() {
		System.out.println(id+" "+name);
	}
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 InstanceBlock b=new  InstanceBlock();
		 b.display();
		 System.out.println("-------------*/*****--------------");
		 InstanceBlock b1=new  InstanceBlock();
		 b1.display();
	}

}

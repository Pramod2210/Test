package Overriding;

public class FruitDynamicDispatchMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*Fruit f=new Fruit();
  f.taste();
  
  f=new apple();
  f.taste();
  
  f=new grapes();
  f.taste();*/
 
  apple a=new apple();
  a.taste();
  
  a=(apple) new Fruit();
  
  
	}

}

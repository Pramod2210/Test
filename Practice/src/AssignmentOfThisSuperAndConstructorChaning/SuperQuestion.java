package AssignmentOfThisSuperAndConstructorChaning;

/*Super Assignments

1.	super can be used to refer immediate parent class instance variable. 
2.	super can be used to invoke immediate parent class method. 
3.	super() can be used to invoke immediate parent class constructor.*/ 




public class SuperQuestion {
	 
	int x, y;
	SuperQuestion(){
		this.x=10;
		this.y=20;
	}
	void display() {
		System.out.println(x+"."+y);
	}

}
class B extends SuperQuestion{
	int a, b;
	B(){
		super();
		this.a=30;
		this.b=40;
	}
	
		
	}


package Mock;

public class AddEvenOD {
	int a[]= {1,2,3,4,6,5,7};
	int add=0;
	void display() {
	
	for(int i=0;i<a.length;i++) {
		
	if(a[i]!=5) {
		if(a[i]%2==0) {
			add=add+1;
		}
		else {
			add=add+3;
		}
	}
	else {
		add =add+5;
	}
	}
	System.out.println(add);
	}
	

	public static void main(Lenth[] args) {
		// TODO Auto-generated method stub
      AddEvenOD o=new AddEvenOD();
      o.display();
	}

}

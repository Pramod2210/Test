package ClassAndObject;

public class Returntype {
	 
	 float marks(int m1, int m2,int m3){
		float sum=m1+m2+m3;
		return sum;
	}
	 void display(float total) {
		   total=total/3;
		 System.out.println(total);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Returntype r=new Returntype();
	float total=r.marks(30, 50, 85);
	r.display(total);
	}

}

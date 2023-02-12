package Mock;

public class VariableArgument {

	void add (String s,double...a) {
		float sum=0;
		for(int i=0;i<a.length;i++) {
			sum=(float)(sum+a[i]);
		}
		System.out.println(sum);
		System.out.println(s);
	}
	void add(String s,int...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=(sum+a[i]);
		}
		System.out.println(sum);
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArgument v=new VariableArgument();
		v.add("pramod ",1,2.5f,3,4.3f,5,5,6);
		v.add("pravin", 2,4,6,7,8.5,9);
	}

}

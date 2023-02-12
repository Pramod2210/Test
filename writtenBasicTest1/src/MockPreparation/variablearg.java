package MockPreparation;

public class variablearg {
   void add(int...a) {
	   int sum=0;
	   for(int x:a) {
	   sum=sum+x;
	   }
	   System.out.println(sum);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variablearg v=new variablearg();
		v.add(10,20);
	}

}

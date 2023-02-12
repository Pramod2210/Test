package Mock;

public class Swapadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int num=7;
		int sum=0;
		  for(int i=0;i<a.length;i++) {
			  for(int j=0;j<a.length;j++) {
				sum=a[i] +a[j] ;
				if(sum==num) {
					System.out.println(a[i]+","+a[j]);
				}
			  }
		  }
		   
		   }
	

}

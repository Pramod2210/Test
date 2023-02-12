package Mock;

public class Sum10 {
  int a[]= {1,2,3,4,5,2,7,8,9};
  int sum=0;
  void dispaly() {
	  for(int i=0;i<a.length;i++) {
		  for(int j=i+1;j<a.length;j++) {
		  sum=a[i]+a[j];
		  if(sum==10) {
			  System.out.println(a[i]+","+a[j]);
		  }
	  }
	  }
  }
	public static void main(Lenth[] args) {
		// TODO Auto-generated method stub
      Sum10 s=new Sum10();
      s.dispaly();
	}

}

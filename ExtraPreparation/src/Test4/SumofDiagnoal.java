package Test4;

public class SumofDiagnoal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[][]= {{1,2,3,5},{5,16,7,8},{8,2,3,4},{1,5,3,4}};
   int sum=0;
   int sum1=0;
   for(int i=0;i<a.length;i++) {                             // \14  /14
	   for(int j=0;j<a.length;j++) {
	   System.out.print(a[i][j]+" ");
   }
	   System.out.println();
	}
   
   for(int i=0;i<a.length;i++) {                             // \14  /14
	   for(int j=0;j<a.length;j++) {
		   if(i==j) {
			  sum=sum+a[i][j];
		   }
	   }
	}
   System.out.println(sum);
   
   for(int i=a.length-1;i>=0;i--) {                             // \14  /14
	   for(int j=0;j<a.length;j++) {
		   if(i+j==a.length-1) {
			  sum1=sum1+a[i][j];
		   }
	   }
	}
   System.out.println(sum1);
   String s="" ;
}
}
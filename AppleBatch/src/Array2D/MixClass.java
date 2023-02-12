package Array2D;

public class MixClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int r=2,c=2;
		//int a[][]=new int[r][c];
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		System.out.println("**---display the matrix-- **");
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("**---display the  sum of matrix-- **");
		System.out.println();
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				sum=sum+a[i][j];
			}
			
		}
		System.out.println("sum of matrix is :"+sum);
		System.out.println("****-----***");
		
		
		System.out.println("**---display the sum of rows matrix-- **");
		System.out.println();
		for(int i=0;i<a.length;i++) {
			int sum1=0;
			for(int j=0;j<a[i].length;j++) {
				
				sum1=sum1+a[i][j];
			}
			System.out.println( "sum of first row is: "+sum1);
	}
		 System.out.println("***--****");
		 
		 System.out.println("**---display thesum of diagnoal element matrix-- **");
		 System.out.println();
		int  sum3=0;
		 for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					if(i==j)
					sum3=sum3+a[i][j];
				}
	}
System.out.println("Diagnoal element sum is: "+sum3);
System.out.println("***---***");

System.out.println("**---display the sum of upper  matrix-- **");

System.out.println();
int sum4=0;
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
		
	if(i<j) {
		
		sum4=sum4+a[i][j];
	}
}
	
}
System.out.println("upper trangle sum : "+sum4);

System.out.println("***---***");

System.out.println("**---display the matrix lowar matrix -- **");
System.out.println();
int sum5=0;
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
		
	if(i>j) {
		
		sum5=sum5+a[i][j];
	}
}
	
}
System.out.println("lowar trangle sum : "+sum5);

}
}
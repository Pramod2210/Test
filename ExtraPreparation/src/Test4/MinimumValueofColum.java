package Test4;

public class MinimumValueofColum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,5},{5,6,7,8},{9,10,1,41},{51,5,31,44}};
		
		 for(int i=0;i<a.length;i++) {                             // 1 2 3 4
			   for(int j=0;j<a.length;j++) {
			   System.out.print(a[i][j]+" ");
		   }
			   System.out.println();
			}
		  
		   // mim element in column
		 for(int i=0;i<a.length;i++) {
			 int min=a[0][i];
			 for(int j=i;j<a.length;j++) {
				 if(a[i][j]<min) {
					 min=a[i][j];
				 }
			 }
		 
			 System.out.println(min);
		 }
		 
		 System.out.println("********");
		 
		 // min element in row
		 for(int i=0;i<a.length;i++) {
			 int min=a[i][0];
			 for(int j=i;j<a.length;j++) {
				 if(a[i][j]<min) {
					 min=a[i][j];
				 }
			 }
		 
			 System.out.println(min);
		 }
	}
}
	


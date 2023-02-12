package Demo;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   for(int i=5;i>=1;i--) {          //1 
	   for(int j=1;j<=5-i;j++) {   //123454
		   System.out.print(" ");
	   }
	   for(int k=1;k<=i;k++) {
		   System.out.print(k+" ");
	   }
	   for(int l=i-1;l>=1;l--) {
		   System.out.print(l+" ");
	   }
	   System.out.println();
   }
	}

}

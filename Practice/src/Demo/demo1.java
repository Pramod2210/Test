package Demo;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  for(int i=9;i>0;i--) {       //  9 8 7
	  for(int k=1;k<i;k++) {     //--------9
		  System.out.print(" "); //-------898
	  }                          //------78987
	  for(int j=i;j<=9;j++ ) {
		  System.out.print(j); 
	  }
	  for(int l=i;l<9;l++) {
		  System.out.print(l);
	  }
	  System.out.println();
  }
}
}

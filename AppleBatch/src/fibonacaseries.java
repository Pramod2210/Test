import java.util.Scanner;

class  Main
{
	public static void main(String a[])
    {
       
        //********* START: PLEASE DO NOT CHANGE ANY CODE LINES GIVEN BELOW
       //DO NOT WRITE ANY EXTRA PRINT or SCAN STATEMENT
      int a1=0,b=1;
    	Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        // ***************** END: UNTIL THIS LINE
     
       // START: WRITE YOUR LOGIC BELOW THIS STATEMENT
          for(int i=1;i<=num;i++)
          {
        System.out.print(a1+" ");
        int c=a1+b;
        a1=b;
        b=c;
        
    }
      	// END: WRITE YOUR LOGIC ABOVE THIS STATEMENT
      
    }


}

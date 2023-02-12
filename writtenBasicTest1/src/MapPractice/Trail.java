package MapPractice;
import java.util.Scanner;
class Trail {
	
	public static boolean findThree(int num)
	{
		boolean ispresent=false;
		//WRITE CODE HER
    if(num>0){
    while(num!=0){
      int r=num%10;
      if(r==3){
        ispresent=true;
      }
    num=num/10;
    }

    }
	return ispresent;
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
        boolean isPresent=false;
	//WRITE CODE TO CALL METHOD
    Trail m=new Trail();
   isPresent= m.findThree(num);
		System.out.println(isPresent);

	}

}


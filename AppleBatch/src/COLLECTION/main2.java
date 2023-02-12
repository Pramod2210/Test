package COLLECTION;
import java.util.Scanner;
public class main2 {
	

		
		public static  boolean isPrime(int n)
		{
	    //Do NOT CHANGE GIVEN CODE
			int count=0;
			boolean flag=false;
	    int i=2;
	    int mid=n/2;
			while(i<=mid){
	      if(n%i==0){
	      count++;
	      break;
	      }
	      i++;
	    }
			if(count>0)
			{
				return false;
			}
			else
			{
				return true;
			}
			
			
		}

		public static void main(String[] args) {
			//DO NOT CHANGE GIVEN CODE
			int a[]=new int[5];
			Scanner sc=new Scanner(System.in);
			
			for(int i=0;i<a.length;i++)
			{
				//WRITE LOGIC FOR INPUT
	      a[i]=sc.nextInt();
			}
			
			for(int i=0;i<a.length;i++)
			{
				if(isPrime(a[i]))
				{
					//WRITE LOGIC FOR DISPLAY OUPUT
	        System.out.println(a[i]);
				}
			}
			
			

		}

	}


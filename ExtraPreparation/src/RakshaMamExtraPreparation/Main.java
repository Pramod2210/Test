package RakshaMamExtraPreparation;

import java.util.Scanner;

class Main
{
	public static void main(String args[])
    {
       
        Scanner sc= new Scanner(System.in);
        System.out.println("enter");
        String s= sc.nextLine();
        
    	//  write your code here
   int count=0;
    char ch[]=s.toCharArray();
    String s1="";
    for(int i=0;i<ch.length;i++){
    	  
      if(ch[i]!=' ' ){
        s1=s1+ch[i];
        count=0;
      }
      else{
       if(count==0){
         s1=s1+ch[i];
         count++;
      }
    }
   
    }
    System.out.println(s1);
    }    


	}



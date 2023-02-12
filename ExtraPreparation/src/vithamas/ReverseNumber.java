package vithamas;
 
//1. write a program to reverse number without using array or string
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=5432;
      int reverse=0;
      while(num>0) {
    	  int r=num%10;
    	  reverse=(reverse*10)+r;
    	  num=num/10;
      }
      System.out.println(reverse);
	}

}

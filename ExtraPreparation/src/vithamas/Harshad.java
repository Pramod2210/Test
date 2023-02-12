package vithamas;

public class Harshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=11;
    int temp=num;
    int sum=0;
    while(num>0) {
    	int r=num%10;
    	sum=sum+r;
    	num=num/10;
    }
    if(temp%sum==0) {
    	System.out.println("is harshad");
    }
    else {
    	System.out.println("not harshad");
    }
	}

}

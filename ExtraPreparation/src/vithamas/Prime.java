package vithamas;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num=11;
     int mid=num/2;
     int i=2;
     while(i<=mid) {
    	if(num%i==0) {
    		break;
    	}
    	i++; 
     }
     if(i>=mid) {
    	 System.out.println("is prime");
     }
     else {
    	 System.out.println("not prime"); 
     }
	}

}

package ComparatorWriten;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=121;
    int temp=i;
    int sum=0;
    while(i>0) {
    	int r=i%10;
    	sum=(sum*10)+r;
    	i=i/10;
    }
    if(temp==sum) {
    	System.out.println("palindroome");
    }
    else {
    	System.out.println("not");
    }
    
	}

}

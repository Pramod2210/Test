
public class range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,n;
       for(int i=100;i<=500;i++) {
    	   n=i;
    	   while(n>0) {
    		   r=n%10;
    		   n=n/10;
    		   sum=sum*10+r;
    	   }
    	   if(sum==i) {
    		   System.out.println(i);
    	   }
    	   sum=0;
       }
	}

}

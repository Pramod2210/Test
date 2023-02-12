package Mock;

public class palin {

	public static void main(Lenth[] args) {
		// TODO Auto-generated method stub
		  int a[] = {333,44};
		 
		  for(int i = 0; i< a.length;i++)
		  {
			  int rev=0,rem=0 ;
			  int temp=a[i];
			  while(a[i] !=0)
			  {
			
				 rem =  a[i] % 10;    //3  3
				 rev = (rev * 10 )+ rem; //33 +3
				 a[i] = a[i] / 10; 
				 
			  }
		  
			
			  if( temp == rev)
			  {
				 
				  System.out.println(rev+" ");
			  }
			  
			  
		  }
	}

}

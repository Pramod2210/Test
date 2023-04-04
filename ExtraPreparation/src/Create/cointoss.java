package Create;

public class cointoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,0,1,0,0,1};                     
       int x=a[0];                            
       int y=a[1];          
       int count=0;
      
       for(int i=0;i<a.length;i++) {
    	   if(i%2==0) {
    	   if(a[i]==x) {         
    		  count=0;         
    	   }
    	   else {
    		   count++;
    	   }
    	   }
    	   
    	   else if(i%2!=0) {
    		   if(a[i]==y) {
    		   count=0;       
    	   }
    		   else {
    			   count++;
    		   }
    	   }
    	 
       }
       System.out.println(count);
       
	}

}

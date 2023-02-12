package ArrayDemo;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {1,2,3,4,2,5,6,4,5};
      int cnt=0;
     for(int i=0;i<a.length;i++) {
    	 for(int j=i+1;j<a.length;j++){
    	 if(a[i]==a[j]) {
    		 cnt++;
    		 System.out.println(a[j]);
    	 }
     }
   	  
      }
	}
}


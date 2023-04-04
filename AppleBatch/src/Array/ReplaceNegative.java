package Array;

public class ReplaceNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]={2,-1,56,-2,67,-9,10,-5};
   
     for (int i=0;i<a.length;i++) {
    	 System.out.print(a[i]+",");
     }
     System.out.println("\nthe changed element");
    for(int j=0;j<a.length;j++) {
    	if(a[j]<0) {
    		a[j]=0;
    	}
    	String s=" ";

    
    System.out.print( a[j]+",");
    }
	

}
}
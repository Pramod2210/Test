package Array;



public class AritmeticOperations {
 void display() {
	 System.out.println("hello");
 }
	void set(int a[]){

     for(int i=0;i<a.length;i++) {
    	 System.out.print(a[i]+" "); 
     }

}
	
	void addition(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	
/*void prime(int a[]) {
		int count=0;
		
		for(int i=0;i<a.length;i++) {
	 int mid =a[i]/2 ;
	 int j;
		 for( j=2;j<=mid;j++) {
			 if(a[i]%j==0) {
				 break;
		
			 }
		 }
		 if(j>mid) {
			 System.out.println(a[i]);
		 }
		 
	 }
	}*/
	
	void pp(int a[]) {
		System.out.println("hi");
		for(int i=0;i<a.length;i++) {
		int mid=a[i]/2;
		int j=2;
		
		while(j<=mid) {
			
			if(a[i]%j==0) {
				break;
			}
			j++;
		}
		if(j>mid) {
			System.out.println("prime");
			System.out.println(a[i]);
		}
	}
	
	
	
	
	
	}	
}
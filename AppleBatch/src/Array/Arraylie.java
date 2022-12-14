package Array;

public class Arraylie {
	
	void arraylength(int a[]) {
		System.out.println("length of array is : "+a.length);
	}
	void arrayelements(int a[]) {
		System.out.println("array Elements are :");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
			//i=i+1;
		}
		System.out.println();
	}
	/*void searchElement(int a[],int element) {
		int cnt=0;
		for(int i=0;i<=a.length-1;i++) {
			if (a[i]==element) {
				System.out.println("element is present at index "+i);
			}
			else {
				cnt++;
			}
		}
		if(cnt==a.length) {
			System.out.println("element is not present");
		}
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Arraylie arr=new Arraylie();
        int a[]= {10,20,30,40,50,60,70,80,90,100,60,11,60};
        arr.arraylength(a);
       arr.arrayelements(a);
     //  arr.searchElement(a, 60);
    	 
     
	}

}

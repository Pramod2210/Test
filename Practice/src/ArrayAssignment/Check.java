package ArrayAssignment;

public class Check {
//14. WAP to check if an array of integers contains two specified elements 65 and 77. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {51,50,10,65,47,77};
    for(int i=0;i<a.length;i++) {
    	if(a[i]==65||a[i]==77) {
    		System.out.println(a[i]+" element is present");
    	}
    }
	}

}

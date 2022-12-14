package ConstructorAssignment;

public class Piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int i=9;i>0;i--) {
    	for(int j=1;j<=i;j++) {
    		System.out.print(" ");
    	}
    	for(int k=8;k>=i;k--) {
    		System.out.print(k);
    	}
    	for(int l=9;l>=i;l--) {
    		System.out.print(l);
    	}
    	System.out.println();
    }
	}

}

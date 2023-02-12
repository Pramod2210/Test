package Test4;

public class OuterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,5},{5,16,7,8},{8,2,3,4},{1,5,3,4}};
		for(int i=0;i<a.length;i++) {     
			for(int j=0;j<a.length;j++) {  
				if(i==0||j==0||i==3||j==3) {
					System.out.print(a[i][j]); 
				}
				else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
		}
	}



package Demo;

public class Demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 for(char i='a';i<='f';i++) { // f
		for(char j='f';j>i;j--) {//-----
			System.out.print(" ");
		}
		for(char k='a';k<=i;k++)
			System.out.print(k+" ");
		
		System.out.println();
	 }
	
	
	}	
}

// 1
// 22
//333
//4444
//55555
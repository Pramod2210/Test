import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferreader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader i=new InputStreamReader(System.in);
		
     
		BufferedReader br=new BufferedReader(i);
		System.out.println("enter a number");
		String s=br.readLine();
		
		int j=Integer.parseInt(s);
	   int product =j*2;
		System.out.println(product);	
		}
	}



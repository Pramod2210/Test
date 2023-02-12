package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileInputStream f=new FileInputStream("D\"C:\\Users\\PRAMOD\\Desktop\\git.txt\".txt");
        int i;
        while((i=f.read())!=-1) {
        	System.out.print((char)i);
        }
        System.out.println();
	}

}

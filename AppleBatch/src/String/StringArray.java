package String;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "raj", "rama", "Anajli", "ajay", "veer", "rahul" };
		/*for (int i = 0; i < str.length; i++) {
			if (str[i].startsWith("r")) {
				System.out.println(str[i]);
				
			}
		}*/
		//Arrays.sort(str);
		//System.out.println(Arrays.toString(str));
		   
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str.length-1;j++) {
				if(str[j].compareTo(str[j+1])>0) {
				 String temp=str[j];
				    str[j]=str[j+1];
				    str[j+1]=temp;
			
				}
			}
			
		}
		System.out.println(Arrays.toString(str));
	}
}

package mapJan;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedHashMap<String,Integer>hm=new LinkedHashMap<>();
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<2;i++) {
    	 System.out.println("enter key and value");
    	 String key=sc.next();
    	 int value=sc.nextInt();
    	
    	 hm.put(key, value);
     }
     System.out.println(hm);
	}

}

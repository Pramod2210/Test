package MapAssignment;
//5.	Create a hashmap <Integer,String> where key is integers 
//1 to 10 and string is number in Words. Remove entry for which number is divisible by 3.

import java.util.HashMap;
import java.util.Map;

public class Divisiableby3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		hm.put(6, "six");
		hm.put(7, "seven");
		hm.put(8, "eight");
		hm.put(9, "nine");
		hm.put(10, "ten");
		
		for(Map.Entry<Integer,String>hmt:hm.entrySet()) {
			if(hmt.getKey()%3!=0) {
				System.out.println(hmt);
			}
			
		}
		
	}

}

package MapWrittentest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
/*1.	Customer does online shopping to leverage Diwali offers. S
hopping list of Customers is maintained in following format: ArrayList<Item> 
Each Item has ID,name,price and qty. From ArrayList of Items create a map <String,Integer> w
here Item Name is key and total quantity ordered for that Item as Value. 
Eg. Items in shpping list are:
[(112,”ParleG”, 20.00, 10),(113,”GoodDay”,40.00,30),
(112,”ParleG”, 20.00, 5),(113,”GoodDay”,40.00,10)]
Then Map would be like this :{{ParleG, 15},{GoodDay,40}}*/

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Item>a=new ArrayList<>();
       a.add(new Item(112,"ParleG",20,10));
       a.add(new Item(113,"GoodDay",40,30));
       a.add(new Item(112,"ParleG",20,5));
       a.add(new Item(113,"GoodDay",40,10));
       
       LinkedHashMap<String,Integer>hm=new LinkedHashMap<>();
        for(Item i:a) {
        	String name=i.name;
        	if(hm.containsKey(name)) {
        	hm.put(name, hm.get(name)+i.quantity);
        	
        	}
        	else {
        		hm.put(name,i.quantity);
        	}
        }
      System.out.println(hm);
	}
   

}

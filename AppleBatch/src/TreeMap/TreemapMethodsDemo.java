package TreeMap;

import java.util.TreeMap;

public class TreemapMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TreeMap<Integer,String>tm=new TreeMap<>();
  
  tm.put(1, "pramod");
  tm.put(10, "raj");
  tm.put(51, "atif");
  tm.put(45, "puja");
  tm.put(11, "ram");
  tm.put(98, "dipak");
  tm.put(35, "prirti");
  tm.put(57, "raju");
   System.out.println(tm);
   System.out.println(tm.firstEntry());
   System.out.println(tm.lastEntry());
   System.out.println(tm.firstKey());
   System.out.println(tm.lastKey());
   System.out.println(tm.ceilingEntry(40));
   System.out.println(tm.ceilingKey(54));
   System.out.println(tm.floorEntry(12));
	}

}

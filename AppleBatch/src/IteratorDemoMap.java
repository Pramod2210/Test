import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorDemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String>hm=new HashMap<>();
		   
		   hm.put(1, "pramod");
		   hm.put(2, "pravin");
		   hm.put(105, "raj");
		   hm.put(98, "ravan");
		   hm.put(78, "aditya");
		   hm.put(56, "akasha");
		   
		   System.out.println("\n--------traversing the value-----*");
		   for(String s: hm.values()) {
			   System.out.print(s+" ");
		   }
		   System.out.println("\n--------traversing the key-----*");
		   for(Integer i:hm.keySet()) {
			   System.out.print(i+" ");
		   }
		   System.out.println("\n--------traversing map entry-----*");
		   for(Map.Entry<Integer, String>ent:hm.entrySet()) {
			   System.out.print(ent.getValue()+" "+ent.getKey()+" ");
		   }
		   System.out.println("\n--------traversing map entry by iterator-----*");
		   Iterator<Map.Entry<Integer,String>>itr=hm.entrySet().iterator();
		   while(itr.hasNext()) {
			   System.out.print(itr.next()+" ");
		   }
	}

}

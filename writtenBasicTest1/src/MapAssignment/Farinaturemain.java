package MapAssignment;

import java.util.HashMap;
import java.util.Map;

public class Farinaturemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,Fariture>hm=new HashMap<>();
       hm.put(1, new Fariture(68000,"sofa"));
       hm.put(10, new Fariture(35000,"bed"));
       hm.put(15, new Fariture(50000,"dining"));
       
       HashMap<Integer,Fariture>hm1=new HashMap<>();
       hm1.put(11, new Fariture(45000,"Dressing"));
       hm1.put(21, new Fariture(35000,"copboard"));
       hm1.put(31, new Fariture(50000,"shokash"));
       
       HashMap<Integer,Fariture>hm3=new HashMap<>();
       hm3.put(45, new Fariture(68000,"carput"));
       hm3.put(50, new Fariture(35000,"farinture"));
       hm3.put(52, new Fariture(50000,"grenite"));
       
       HashMap<String,HashMap<Integer,Fariture>>hmt=new HashMap<>();
       
       hmt.put("pune", hm);
       hmt.put("solapur", hm1);
       hmt.put("mumbai", hm3);
       
       for(Map.Entry<String, HashMap<Integer,Fariture>>emp:hmt.entrySet())
    	   
       {
    	   for(Map.Entry<Integer,Fariture> x:emp.getValue().entrySet()) {
    	   System.out.println(x.getValue().price);
    	   }
       }
       System.out.println();
	}

}

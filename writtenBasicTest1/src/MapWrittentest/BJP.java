package MapWrittentest;
/*3.	Create a Map<String,String> where key is adharno and value is voted casted to
Which party (eg. BJP,ShivSena,NCP,Congress,Other) .From this create new map such
That KEY is party name and value is count of votes casted. */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BJP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String,String>hm=new HashMap<>();
        hm.put("883538896880", "BJP");
        hm.put("883538154892", "NCP");
        hm.put("458978896880", "SHIVSENA");
        hm.put("035818896880", "BJP");
        hm.put("821568896880", "CONGRACE");
        hm.put("125648972356", "SHIVSENA");
        hm.put("886897158455", "NCP");
        hm.put("124659783265", "NCP");
        hm.put("124366598526", "OTHER");
        hm.put("124687928269", "NOTA");
        
      
        HashMap<String ,Integer>hmp=new HashMap<>();
        for(Map.Entry<String, String>a:hm.entrySet()) {
        	String party=a.getValue();
        	if(hmp.containsKey(party)) {
        		hmp.put(party, hmp.get(party)+1);
        	}
        	else{
        		hmp.put(party, 1);
        	}
        }
        System.out.println(hmp);
	}

}

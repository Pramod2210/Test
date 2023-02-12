package SET;

import java.util.HashSet;

public class Itemmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashSet<Item>hs=new HashSet<>();
        hs.add(new Item(1,150,25,"ball"));
        hs.add(new Item(10,180,100,"bat"));
        hs.add(new Item(12,250,15,"dol"));
        hs.add(new Item(15,178,35,"car"));
        hs.add(new Item(9,151,15,"pen"));
        hs.add(new Item(4,150,5,"book"));
        hs.add(new Item(4,150,50,"book"));
        System.out.println(hs);
	}

}

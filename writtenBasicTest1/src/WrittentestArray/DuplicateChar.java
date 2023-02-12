package WrittentestArray;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<Character>it=new CopyOnWriteArrayList<>();
		it.add('a');
		it.add('b');
		it.add('c');
		it.add('e');
		it.add('a');
		it.add('b');
		it.add('c');
		it.add('e');
		ArrayList<Character>a=new ArrayList<>();
		for(Character i:it) {
        	if(!it.contains(i)) {
        		it.remove(i);
        	}
        }
        System.out.println(it);
	}

}

package ComparaterComparable;

import java.util.Comparator;

public class Actornamesort implements Comparator<Actor> {

	@Override
	public int compare(Actor o1, Actor o2) {
		// TODO Auto-generated method stub
		return o1.name.compareToIgnoreCase(o2.name);
	} 
	
}


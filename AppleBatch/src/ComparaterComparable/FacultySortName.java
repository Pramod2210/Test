package ComparaterComparable;

import java.util.Comparator;

public class FacultySortName implements Comparator<Faculty> {

	@Override
	public int compare(Faculty o1, Faculty o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}

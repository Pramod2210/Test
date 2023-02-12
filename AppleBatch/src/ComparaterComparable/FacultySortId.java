package ComparaterComparable;

import java.util.Comparator;

public class FacultySortId implements Comparator<Faculty> {

	@Override
	public int compare(Faculty o1, Faculty o2) {
		// TODO Auto-generated method stub
		if(o1.id>o2.id)
			return 1;
			else if(o1.id<o2.id)
				return -1;
			else
				return 0;
	}

}

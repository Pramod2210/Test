package ComparaterComparable;

import java.util.Comparator;

public class FacultySortSalary implements Comparator<Faculty> {

	@Override
	public int compare(Faculty o1, Faculty o2) {
		// TODO Auto-generated method stub
		return o1.salary.compareTo(o2.salary);
	}

}

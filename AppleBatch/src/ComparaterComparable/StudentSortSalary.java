package ComparaterComparable;

import java.util.Comparator;

public class StudentSortSalary implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.salary.compareTo(s2.salary);
	}

}

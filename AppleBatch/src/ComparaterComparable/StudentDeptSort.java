package ComparaterComparable;

import java.util.Comparator;

public class StudentDeptSort implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.dept.compareTo(s2.dept);
	}

}

package ComparatorWriten;

import java.util.Comparator;

public class StudentAgeSort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.age>o2.age)
			return 1;
		else if(o1.age<o2.age)
		return -1;
		else
			return 0;
	}
}


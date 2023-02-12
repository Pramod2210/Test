package TreeMap;

import java.util.Comparator;

public class StudentSotname implements Comparator<Student> {

	

	
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}

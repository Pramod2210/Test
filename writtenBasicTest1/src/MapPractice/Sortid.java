package MapPractice;

import java.util.Comparator;

public class Sortid implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.id>o2.id)
		return 1;
		else if(o1.id<o2.id)
			return -1;
		else
			return 0;
	}

}

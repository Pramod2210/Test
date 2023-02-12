package ComparaterComparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	void setdata(ArrayList<Student>s) {
		s.add(new Student(1,"pramod","mech","75800"));
		s.add(new Student(12,"amar","it","65000"));
		s.add(new Student(33,"pratik","mech","98000"));
		s.add(new Student(14,"baba","comp","65400"));
		s.add(new Student(5,"prem","it","49800"));
		s.add(new Student(6,"amit","it","50000"));
		s.add(new Student(17,"krushna","mech","450000"));
		s.add(new Student(81,"sahil","civil","58000"));
		s.add(new Student(99,"karik","it","56000"));
		s.add(new Student(10,"ravan","entc","50000"));
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Student>s1=new ArrayList<>();
		StudentMain s=new StudentMain();
		s.setdata(s1);
		System.out.println(s1);
		 System.out.println("\n************---------------");
	//	Collections.sort(s1,new StudentNameSort());
		 Collections.sort(s1,new StudentDeptSort().thenComparing(new StudentSortSalary()));
		// Collections.sort(s1,new StudentSortSalary());
		// Collections.sort(s1,new StdentSortId().thenComparing(new StudentSortSalary()));
		System.out.println(s1);
	}

}

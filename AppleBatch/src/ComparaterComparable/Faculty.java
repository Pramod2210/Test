package ComparaterComparable;

public class Faculty {
   int id;
   String name,dept,salary,subject;
   
   Faculty(int id,String name,String dept,String salary,String subject) {
	   this.id=id;
	   this.name=name;
	   this.dept=dept;
	   this.salary=salary;
	   this.subject=subject;
}

@Override
public String toString() {
	return "Faculty [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", subject=" + subject
			+ "]";
}
   
   
}

package ComparatorWriten;

public class Student {
   String name;
   int roll_no,age;
public Student(int age, int roll_no, String name) {

	this.name = name;
	this.roll_no = roll_no;
	this.age = age;
}
@Override
public String toString() {
	return "Student [name=" + name + ", roll_no=" + roll_no + ", age=" + age + "]";
}
   
}

package Myexamo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListOfStudentCourse {

	private static final int Entry = 0;
	void arrayLists(ArrayList<StudentCourse> al)
	{
		ArrayList<Course> c1 = new ArrayList<>();
		ArrayList<Course> c2 = new ArrayList<>();
		ArrayList<Course> c3 = new ArrayList<>();
		
		Course co1 = new Course(1,"Core Java",150000);
		c1.add(co1);
		Course co2 = new Course(56,"Advance Java",120000);
		c1.add(co2);
		Course co3 = new Course(11,"JavaScript",140000);
		c1.add(co3);
		
		Course co4 = new Course(12,".Net",140000);
		c2.add(co4);
		Course co5 = new Course(34,"Asp.Net",130000);
		c2.add(co5);
		
		Course co6 = new Course(87,"Python",60000);
		c3.add(co6);
		
		StudentCourse s1 = new StudentCourse(111,"YashRaj",c1);
		al.add(s1);
		StudentCourse s2 = new StudentCourse(121,"Yash",c2);
		al.add(s2);
		StudentCourse s3 = new StudentCourse(101,"Raj",c3);
		al.add(s3);
		
		System.out.println(al);
	}
	
	void count(ArrayList<StudentCourse> al,HashMap<String ,Integer> hm)
	{
		for(StudentCourse sc : al)
		{
			hm.put(sc.name, sc.c.size());
		}
		System.out.println(hm);
		
	}
	
	void max(ArrayList<StudentCourse> al,HashMap<String ,Integer> hm) {
		
		Iterator(Entry<String,Integer>h:hm.entrySet().iterator()) {
			int i=h.getValue();
			if(h.getValue()>i);
		}
	}
	public static void main(String[] args) {

		
		ArrayList<StudentCourse> al = new ArrayList<>();
		HashMap<String ,Integer> hm = new HashMap<>();
		
		
		ArrayListOfStudentCourse asc = new ArrayListOfStudentCourse();
		asc.arrayLists(al);
		asc.count(al, hm);
		
	}

}

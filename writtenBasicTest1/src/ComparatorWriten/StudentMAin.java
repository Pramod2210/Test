package ComparatorWriten;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMAin {
	void setdata(ArrayList<Student>s) {
		s.add(new Student(18,8,"pramod"));
		s.add(new Student(25,18,"amit"));
		s.add(new Student(21,10,"vibvhav"));
		s.add(new Student(19,14,"rashi"));
		s.add(new Student(15,1,"geeta"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Student>s=new ArrayList<>();
       StudentMAin m=new StudentMAin();
       m.setdata(s);
       System.out.println(s);
       System.out.println("\n----** set by name------**********");
       
          Collections.sort(s, new StudentNameSort());
          System.out.println(s);
          
          System.out.println("\n----** set by roll no------**********");
          
          Collections.sort(s, new StudentIDSort());
          System.out.println(s);
          
          System.out.println("\n----** set by name------**********");
          
          Collections.sort(s, new StudentAgeSort());
          System.out.println(s);
	}
	
	
	

}

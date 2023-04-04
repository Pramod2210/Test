package Test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StudentMain {
	
	void Insertdata() {
		ArrayList<Student>s=new ArrayList<>();
		 ArrayList<Integer>marks= new ArrayList<>();
		marks.add(50);
		marks.add(45);
		marks.add(55);
		Student s1=new Student("pramod",marks);
		
		 ArrayList<Integer>marks1= new ArrayList<>();
			marks1.add(85);
			marks1.add(45);
			marks1.add(65);
			Student s2=new Student("raju",marks1);
			
			 ArrayList<Integer>marks2= new ArrayList<>();
				marks2.add(45);
				marks2.add(45);
				marks2.add(45);
				Student s3=new Student("vidya",marks2);
				
				 ArrayList<Integer>marks3= new ArrayList<>();
					marks3.add(50);
					marks3.add(58);
					marks3.add(85);
					Student s4=new Student("suvarna",marks3);
					
					s.add(s1);
					s.add(s2);
					s.add(s3);
					s.add(s4);
			HashMap<String,Integer>hm=new HashMap<>();	
		    
			//System.out.println(Arrays.toString(s));
			for(Student x:s) {
				int sum=0;
				for(Integer i:x.marks) {
					int m=i;
				System.out.println(m);
					sum=sum+i;
				}
			    int percentage=(sum/3);
				   System.out.println(percentage);
			    String name=x.name;
			    
			     hm.put(name, percentage);
			   System.out.println(sum);
			}
			System.out.println(hm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMain x=new StudentMain();
		x.Insertdata();
	}

}

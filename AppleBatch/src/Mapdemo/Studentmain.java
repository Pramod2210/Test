package Mapdemo;

import java.util.HashMap;
import java.util.Scanner;

public class Studentmain {
	
	void setdata(HashMap<Integer,Student>std) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter te student number");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println("enter the id name dept");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			Student s=new Student();
			s.setName(name);
			s.setDept(dept);
			s.setId(id);
			std.put(id, s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer,Student>st=new HashMap<>();
     Studentmain m=new Studentmain();
     m.setdata(st);
     
     System.out.println(st);
     
     System.out.println(st.get(1));
	}

}

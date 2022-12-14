package ClassAndObject;

import java.util.Scanner;

public class Student {
	
	private char[] percentage;
	private char[] student;

	double Student(int id, String name, int m1, int m2, int m3 ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id name And marks ");
		 id=sc.nextInt();
	  name=sc.nextLine();
	    m1=sc.nextInt();
	    m2=sc.nextInt();
	    m3=sc.nextInt();
		return Student(id, name, m1, m2,m3) ;
	  
	}
	double percentage(int p,int m1,int m2,int m3 ) {
		p=((m1+m2+m3)/300)*100;
		return p;
	}
	double  display() {
		System.out.println(student);
		System.out.println(percentage);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student s= new Student();
     double Student= s.Student(1,"pramod",65,98,48);
     double percentage=(s.Student(1,"pramod",65,98,48));
      double display=s.display();
	}

}

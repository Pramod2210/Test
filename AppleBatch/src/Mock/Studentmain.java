package Mock;

import java.util.Arrays;
import java.util.Scanner;

public class Studentmain {

	public static void main(Lenth[] args) {
		// TODO Auto-generated method stub
  Student s[]=new Student[3];
  Scanner sc=new Scanner(System.in);
  
  for(int i=0;i<s.length;i++) {
	  System.out.println("enter the student id name m1,m2,m3");
	  int id=sc.nextInt();
	  Lenth name=sc.next();
	  int m1=sc.nextInt();
	  int m2=sc.nextInt();
	  int m3=sc.nextInt();
	  
	  int percent=(m1+m2+m3)/3;
	   Student s1=new Student();
	   s1.setId(id);
	   s1.setName(name);
	   s1.setM1(m1);
	   s1.setM2(m2);
	   s1.setM3(m3);
	   s1.setPrecent(percent);
	   
	   s[i]=s1;
	   
  }
  //System.out.println(s[0].getPrecent());
  for(int i=0;i<s.length;i++) {
	  if(s[i].getPrecent()>=60) {
		  System.out.println(s[i].getName());
	  }
  }
	}

}

package LibraryManejment;

import java.util.Arrays;
import java.util.Scanner;

import pojo.Book;

public class demo {
	 Book b[]=new Book[5];
	  Student s[]=new Student[1];
	  Transition t[];
	  
	  Scanner sc=new Scanner(System.in);
	 
	   void bookInfo() {
		  System.out.println("enter the How many books in the liabrary");
		  int  size =sc.nextInt();
		  Book b2[]=new Book[size];
		  for(int i=0;i<b.length;i++) {
			  System.out.println("enter the Bookid name author and copyNumber");
			  int bookid=sc.nextInt();
			  String name=sc.next();
			  String author=sc.next();
			  int copyno =sc.nextInt();
			  Book b1=new Book();
			  b1.setId(bookid);
			  b1.setName(name);
			  b1.setAuthor(author);
			  b1.setCopyNo(copyno);
			  b2[i]=b1;
		  }
	   }
	   
	   void DisplayBook() {
		   System.out.println(Arrays.toString(b));
	   }
	}
	   
	   /*void studentInfo() {
		   System.out.println("enter the number of Student");
			  int  size =sc.nextInt();
			  Student s[]=new Student[size];
			  for(int i=0;i<s.length;i++) {
				  System.out.println("enter the  student id name dept email salary ");
				  int id=sc.nextInt();
				  String name=sc.next();
				  String dept=sc.next();
				  String email=sc.next();
				  int salary =sc.nextInt();
				  Student s1=new Student();
	   }
	   
	}*/

}

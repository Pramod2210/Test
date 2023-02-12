package Dao;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import pojo.Book;
import pojo.Student;
import pojo.Transition;
public class Library {
  Book b[]=new Book[4];
  Student s[]=new Student[4];
  Transition t[]=new Transition[6];
   Scanner sc=new Scanner(System.in);
   int count=0;
   public Library(){
	  
	   Book b1=new Book();
	   b1.setId(1001);
	  b1.setName("mrutynjay");
	  b1.setAuthor("sambaji");
	  b1.setCopyNo(10);
	  b[0]=b1;
	  
	  Book b2=new Book();
	   b2.setId(1002);
	  b2.setName("bagvatgeeta");
	  b2.setAuthor("krushna");
	  b2.setCopyNo(10);
	  b[1]=b2;
	  
	  Book b3=new Book();
	   b3.setId(1003);
	  b3.setName("mahabharat");
	  b3.setAuthor("vyas");
	  b3.setCopyNo(10);
	  b[2]=b3;
	  
	  Student s1=new Student();
	  s1.setId(101);
	  s1.setName("pramod");
	  s1.setDept("mech");
	  s1.setEmail("pp@gmail.com");
	  s[0]=s1;
	  
	  Student s2=new Student();
	  s2.setId(102);
	  s2.setName("raj");
	  s2.setDept("mech");
	  s2.setEmail("raj@gmail.com");
	  s[1]=s2;
	  
	  Student s3=new Student();
	  s3.setId(103);
	  s3.setName("Atif");
	  s3.setDept("mech");
	  s3.setEmail("Atif@gmail.com");
	  s[2]=s3;

	  Student s4=new Student();
	  s4.setId(104);
	  s4.setName("Poojashree");
	  s4.setDept("it");
	  s4.setEmail("patil@gmail.com");
	  s[3]=s4;

	  for(int i=0;i<b.length;i++) {
		   if(b[i]!=null) {
	   
	   System.out.println(b[i]);
	 
		   }
	  }
	  System.out.println("****----****");
   }
   public void bookinfoinfo() {
	   for(int i=0;i<b.length;i++) {
		   if(b[i]!=null) {
	   
	   System.out.println(b[i]);
	 
   }
	   }
   }
   public void displaystudentinfo() {
	   for(int i=0;i<s.length;i++) {
		  if(s[i].getStatus()!=null) {
			  System.out.println(s[i]);
		
		  }  
	   }
  }
   public void Transition() {
	   for(int i=0;i<t.length;i++) {
		   if(t[i]!=null) {
			   System.out.println(t[i]);
		   }
	   }
   }
   
  public void issuBook() {
	 System.out.println("---Issue book page---");
    System.out.println();
	 System.out.println("student id ");  
	 int sid=sc.nextInt();       
	 System.out.println("enter the book id");   
	 int bid=sc.nextInt();
	 
	 for(int i=0;i<b.length;i++) {   //1003
		 if(b[i]!=null) {
		 if(b[i].getId()==bid ) {            //   b[2]==1003;              
			 int copyno1=b[i].getCopyNo()-1;
			 b[i].setCopyNo(copyno1);
			 System.out.println(b[i]);
		 }
	 }
	 }
		 for(int j=0;j<s.length;j++) {
			 if(s[j]!=null) {
			 if(s[j].getId()==sid) {        
				 s[j].setStatus("Issued");
				 s[j].setBookid(bid); 
				 System.out.println(s[j]);
					 }	
			 }
		 }
	 LocalDate issuedate =LocalDate.now();
	 Calendar c=Calendar.getInstance();
	c.add(Calendar.DATE,7);
	SimpleDateFormat sdf= new  SimpleDateFormat("dd-MM-yyyy");
	String returndate=sdf.format(c.getTime());
     
	
	for(int i=0;i<b.length;i++) {
		if(b[i]!=null) {
		if(b[i].getId()==bid) {   
	
	 Transition t1=new Transition();
	  t1.setBookname(b[i].getName());
	   t1.setIssuedate(issuedate);
	  t1.setReturndate(returndate); 
	  t1.setS(s[i]);
	   t[0]=t1;
		}
		}
	}
	System.out.println("issuedate : "+issuedate+"\nreturndate :"+returndate );
	
	 }
     public void returnbook() {
    	 System.out.println("-----retun book page----");
    	 System.out.println();
    	 System.out.println("enter the book id");
    	 int bid=sc.nextInt();
    	 System.out.println("enter stuident id");
    	 int sid=sc.nextInt();
    	 
    	 for(int i=0;i<s.length;i++) {
    		 if(s[i].getStatus()!=null)
    	  if(s[i].getStatus().equals("Issued")&& s[i].getBookid()==bid) {
    		  s[i].setStatus("Returned");
    		  s[i].setBookid(0);
    		  System.out.println(s[i]);
    		  
    	  }
    	  else {
    		  System.out.println("enter correct book id");
    		  System.out.println("---thank you---");
    		  count++;
    		  break;
    	 }
    	 }
    	 for(int j=0;j<b.length;j++) {
    		 if (count==0) {
    		 if(b[j].getId()==bid) {
    		  b[j].setCopyNo(b[j].getCopyNo()+1);
    	  System.out.println(b[j]);
    	  break;
    	  }
    	   
     }
    		 else {
    			 break;
    		 }
   
    	 } 
   
     }
}
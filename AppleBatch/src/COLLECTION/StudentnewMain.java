package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentnewMain {

	
     void SetDetail(ArrayList<StudentNew>s) {
       
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the student no");
       int size=sc.nextInt();
       for(int i=0;i<size;i++) {
    	   System.out.println("enter id name dept");
    	   int id=sc.nextInt();
    	   String name=sc.next();
    	   String Dept=sc.next();
    	   System.out.println("enter the  5 sub marks");
    	  
    	   int m1=sc.nextInt();
    	   int m2=sc.nextInt();
    	   int m3=sc.nextInt();
    	   int m4=sc.nextInt();
    	   int m5=sc.nextInt();
    	   ArrayList<Integer>m=new ArrayList<>();
    	   m.add(m1);
    	   m.add(m2);
    	   m.add(m3);
    	   m.add(m4);
    	   m.add(m5);
    	  // double percent=((m1+m2+m3+m4+m5)/5);
    	   StudentNew x=new StudentNew();
    	   x.setId(id);
    	   x.setName(name);
    	   x.setDept(Dept);
    	   x.setMarks(m);
    	//   x.setPercent(percent);
    	   s.add(x);
       }
       System.out.println(s);
       
     // System.out.println(s.get(1).marks);
	}
     
     
     
     //////// ussing for each loop----------
     
     
     void percentagenew(ArrayList<StudentNew>s) {
   
    	 for(StudentNew x:s) {
    		 double sum=0;
    		 for(Integer j:x.marks) {
    			sum=sum+j; 
    		 }
    		 double percent=(sum/x.marks.size());
    		 char ch;
    		  if(percent >60) {
    			  ch='A';
    		  }
    		  else if(percent>50) {
    			  ch='B';
    		  }
    		  else if(percent>35) {
    			  ch='c';
    		  }
    		  else {
    			  ch='f';
    		  }
    		 
    		 System.out.println(x.getId()+" "+x.getName()+" "+percent+" "+ch);
    	 }
    	 
     }
     
     // using iterator--------
     
     void percent(ArrayList<StudentNew>s) {
    	Iterator<StudentNew>it=s.iterator();
    	while(it.hasNext()) {
    	StudentNew x=it.next();
    	double sum=0;
    	Iterator<Integer>itm=x.marks.iterator();
    	while(itm.hasNext()) {
    		Integer i=itm.next();
    		sum=sum+i;
    		
    	}
    	double percent=sum/x.marks.size();
    	System.out.println(x.getId()+" "+x.getName()+" "+percent);
    		
    	}
    		
    		
    	}
     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<StudentNew>s=new ArrayList<>();
       StudentnewMain d=new StudentnewMain();
       d.SetDetail(s);
       d.percentagenew(s);
       System.out.println("*******-------------//////////");
       System.out.println("*******-------------//////////");
       d.percent(s);
}
}
package ArraylistCurd;


	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Iterator;
	import java.util.Scanner;


	public class Operation {

			   Scanner sc = new Scanner(System.in);
		
			   public void ArrayMain(ArrayList<Student> as)
				{
				  
					as.add(new Student(101,"pramod","Computer",88));
					as.add(new Student(1,"raj","Mechanical",85));
					as.add(new Student(10,"Anuj","Computer",89));
					as.add(new Student(44,"Akshata","Civil",92));
					as.add(new Student(43,"Megha","Civil",89));
					as.add(new Student(41,"Tejashri","Civil",92));
					as.add(new Student(40,"Shruti","Entc",86));
					as.add(new Student(22,"Sharmila","Electrical",78));
					as.add(new Student(35,"Pratibha","Entc",84));
					as.add(new Student(73,"Shraddha","Mechanical",91));
					as.add(new Student(74,"kapur","Entc",91));

				}
			   public void add(ArrayList<Student> as)
				{
				    System.out.println("Enter the info of student you want to add in ArrayList");
					System.out.println("Enter id,name,dept,marks:");
					int id = sc.nextInt();
					String name = sc.next();
					String dept = sc.next();
					int marks = sc.nextInt();
						
					Student s1 = new Student(id,name,dept,marks);
					as.add(s1);
					
					}
			   
			    public void update(ArrayList<Student> as)
				{  
			    	System.out.println("Enter the id of student Which you want to update:");
				
			    	int id = sc.nextInt();
			    	System.out.println("if you want to update dept then Enter 1 or for upadate marks enter 2(1-update dept ,2-update marks");
					int num = sc.nextInt();
			    	
					switch(num)
					{
					case 1:
					 {
						System.out.println("Enter dept that you want to update:");
					   	sc.nextLine();
				       	String dept = sc.nextLine();
				    
					   for(Student s: as)
					  { 
						   if(id == s.id)
						 {
							s.dept = dept;
						 }
					  }
					  }
					 break;
					 
					case 2:
					 {
						System.out.println("Enter marks that you want to update:");
					
				       	int marks = sc.nextInt();
				       	for(Student s: as)
						  { 
							   if(id == s.id)
							 {
								s.marks = marks;
							 }
						  }
					 }
					 break;
					}
				}
			    
			    public void show(ArrayList<Student> as)
			    {
			    	//for(Student1 s: as)
					  { 
					     System.out.println(as);
					  }
			    }
			    public void search(ArrayList<Student> as)
			    {
	                 System.out.println("Enter the id of student Which you want to search:");
					 int id = sc.nextInt();
					 for(Student s: as)
					  { 
						 if(id == s.id)
						    { 
					           System.out.println(s);
						    }
					  }
			    }
			    
			    public void delete(ArrayList<Student> as)
			    {
			    	System.out.println("Enter the id of student Which you want to delete:");
					
			    	int id = sc.nextInt();
			    	
			    	Iterator<Student> itr = as.iterator();
			    	while(itr.hasNext())
			    	{
					    if(id == itr.next().id)
					    {
					    	itr.remove();
					    }
					  }
			    	System.out.println(as);
			    }	    
	}


package ArrayCurd;


	import java.util.Arrays;
	import java.util.Scanner;



	public class Operation {
	   Scanner sc = new Scanner(System.in);
		Student s[] = new Student[10];
		
		public void ArrayMain()
		{
			System.out.println("Enter size of Array to you want to insert student info:");
			int size = sc.nextInt();
			for(int i = 0;i< size;i++)
			{
				System.out.println("Enter id,name,marks,email,contact,dept:");
				int id = sc.nextInt();
				String name = sc.next();
				int marks = sc.nextInt();
				String email = sc.next();
				String contact = sc.next();
				String dept = sc.next();
				
				Student s1 = new Student();
				s1.setId(id);
				s1.setName(name);
				s1.setMarks(marks);
				s1.setContact(contact);
				s1.setEmail(email);
				s1.setDept(dept);
				
				s[i] = s1;
			}
			System.out.println(Arrays.toString(s));
		}
		
	  public void add()
		{
				System.out.println("Enter id,name,marks,email,contact,dept:");
				int id = sc.nextInt();
				String name = sc.next();
				int marks = sc.nextInt();
				String email = sc.next();
				String contact = sc.next();
				String dept = sc.next();
				
				Student s1 = new Student();
				s1.setId(id);
				s1.setName(name);
				s1.setMarks(marks);
				s1.setContact(contact);
				s1.setEmail(email);
				s1.setDept(dept);
				
				for(int i = 0;i< s.length;i++)
	    	    {
	    			if(s[i] == null)
	    			{
	    				s[i] = s1;
	    				break;
	    			}
	    	    }
			}
	    public void update()
		{   System.out.println("ENter th id:");
	    	int id = sc.nextInt();
			System.out.println("if you want to update contact then Enter 1 or for upadate email enter 2(1-update contact ,2-update email");
			int num = sc.nextInt();
			switch(num)
			{
			case 1:
			 {
				System.out.println("Enter contct that you want to update:");
			
		       	String contact = sc.next();
			   for(int i = 0;i< s.length;i++)
			  { 
				if(s[i] != null)
				{
				if(id == s[i].getId())
				 {
					s[i].setContact(contact);
				 }
				}
			   }
			 }
			 break;
			 
			case 2:
			 {
				System.out.println("Enter email that you want to update:");
			
		       	String email = sc.next();
			   for(int i = 0;i< s.length;i++)
			  { 
				if(s[i] != null)
				{
				if(id == s[i].getId())
				 {
					s[i].setContact(email);
				 }
				}
			   }
			 }
			 break;
			}
		}
	    public void show()
	    {
	    	System.out.println(Arrays.toString(s));
	    }
	    public void delete()
	    {
	    	 System.out.println("Enter th id:");
	     	 int id = sc.nextInt();
	     	 int index = 0;
	     	for(int i = 0;i< s.length;i++)
			{
				if(s[i] != null)
				{
				if(id == s[i].getId())
				{
					index = i;
				}
				}
				
			}
	     	int j =0;
	     	for(int i = 0;i< s.length;i++)
			{
				if(id == index)
				{
					continue;
				}
				else
				{
					s[j] =s[i];
					j++;
				}	
			}
	     	 System.out.println(Arrays.toString(s));
	     	
	    }
		public void search()
		{
			System.out.println("Enter id:");
			int id = sc.nextInt();
			for(int i = 0;i< s.length;i++)
			{
				if(s[i] != null)
				{
				if(id == s[i].getId())
				{
					System.out.println(s[i]);
				}
				}
			}
		}
		
	}


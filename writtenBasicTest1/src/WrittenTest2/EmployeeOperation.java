package WrittenTest2;

	import java.util.Arrays;
	import java.util.Scanner;

	public class EmployeeOperation {

		Scanner sc = new Scanner(System.in);
		
		Employee emp[] = new Employee[10];
		
		 void mainArray()
		 {
			 System.out.println("Number of Employees you want to add");
			 int size = sc.nextInt();
	    	for(int i = 0;i< size;i++)
		   {
			System.out.println("Enter id,name,salary,email,dept");
			
			int id = sc.nextInt();
			String name = sc.next();
			int salary = sc.nextInt();
			String dept = sc.next();
			String email = sc.next();
			
			 Employee e1 = new Employee();
			e1.setId(id);
			e1.setName(name);
			e1.setSalary(salary);
			e1.setDept(dept);
			e1.setEmail(email);
			
			emp[i] =e1;
		}
		}
	  
	    	
	    	void add()
	    	{
	    		System.out.println("Enter id,name,salary,email,dept");
	    		int id = sc.nextInt();
	    		String name = sc.next();
	    		int salary = sc.nextInt();
	    		String dept = sc.next();
	    		String email = sc.next();
	    		
	    		 Employee e1 = new Employee();
	    		e1.setId(id);
	    		e1.setName(name);
	    		e1.setSalary(salary);
	    		e1.setDept(dept);
	    		e1.setEmail(email);
	    		
	    		for(int i = 0;i< emp.length;i++)
	    	    {
	    			if(emp[i] == null)
	    			{
	    				emp[i] = e1;
	    				break;
	    			}
	    	    }	
	    	 }
	    	
	    	void display()
	    	{
	    		System.out.println(Arrays.toString(emp));
	    	}
	    	void updateSalary()
	    	{
	    		System.out.println("Enter id, new salary:");
	    		int id = sc.nextInt();
	    		int salary = sc.nextInt();
	    		
	    		for(int i = 0;i< emp.length;i++)
	    	    {
	    			if(emp[i] != null)
	    			{
	    				if(id == emp[i].getId())
	    				{
	    					emp[i].setSalary(salary);
	    				}
	    			}
	    	    }
	    	}
	    	
	    	void delete()
	    	{
	    		Employee e[] = new Employee[emp.length];
	    		System.out.println("Enter id : ");
	    		 int index = 0;
	    		int id = sc.nextInt();
	    		for(int i = 0;i< emp.length;i++)
	    	    {
	    			if(emp[i] != null)
	    			{
	    		     if(id == emp[i].getId())
	    			  {
	    				index = i;
	    			  }
	    			}
	    		}
	    		int j = 0;
	    		for(int i = 0;i< emp.length;i++)
	    	    {
	    		     if(index == i)
	    			  {
	    		    	 continue;
	    			  }
	    			  else
	    			  {
	    				 e[j] = emp[i];
	    				 j++;
	    			  }
	    		 }
	    		System.out.println(Arrays.toString(e));
	    	}
	    	
	    	void search()
	    	{
	    		System.out.println("Enter id : ");
	    		int id = sc.nextInt();
	    		for(int i = 0;i< emp.length;i++)
	    	    {
	    			if(emp[i] != null)
	    			{
	    				if(id == emp[i].getId())
	    				{
	    					System.out.println((emp[i]));
	    				}
	    			}
	    	    }
	    	}
	    	
	    	
	    }


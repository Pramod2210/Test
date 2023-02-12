package ComparatorWriten;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class EmployeeProfileMain  {

	void setElements(ArrayList<Employee> emp1)
	{
		emp1.add(new Employee(41,"pramod",new Profile("Maharashtra","India")));
	
		emp1.add(new Employee(10,"praic",new Profile("Washington","USA")));
		
		emp1.add(new Employee(1,"Yash",new Profile("shangay","chaina")));
		
		
		emp1.add(new Employee(101,"Raju",new Profile("Brasilia","Brazil")));
		
		
	}
	
	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList();
		EmployeeProfileMain em = new EmployeeProfileMain();
		em.setElements(emp);
		// System.out.println(em);
		for(Employee e : emp)
		{
          System.out.println(e);		
		}
		
		
		System.out.println(".......Sorting of  Employee Based on Country Name......");
		
		//Collections.sort(ArrayList<Employee> emp, new EmployeeSortOnCountry());
		
		
			Collections.sort(emp, new EmployeeSortName().thenComparing(new EmployeeSortId()));
			
			
			
			
			
		
         System.out.println(emp);
	}
}


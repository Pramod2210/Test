package ArraysWithObject;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e[] =new Employee[4];
         e[0]= new Employee(1,"pramod","hr",68000);
         e[1]= new Employee(2,"priti","hr",70000);
         e[2]= new Employee(3,"pravin","quali",55000);
         e[3]= new Employee(4,"prema","eng",70000);
         
        
		for(Employee e1:e) {
        	 
        	 System.out.println(e1);
        
         }
		System.out.println("***---***");
         for(Employee e1:e) {
        	 if(e1.salary>60000) {
        		System.out.println(e1);
        	 }
         }
         
         System.out.println("***-/***");
         for(Employee e1:e) {
        	 if(e1.dept.equalsIgnoreCase("hr")) {
        		 System.out.println(e1.salary=e1.salary*2);
        	 }
         }
         
         }
	}



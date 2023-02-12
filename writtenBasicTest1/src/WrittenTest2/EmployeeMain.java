package WrittenTest2;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 EmployeeOperation eo =new EmployeeOperation();
		 eo.mainArray();
		 eo.display();
		 System.out.println("Enter the Operation number which you want to perform (1-AddEmployeeData, 2-updateEmployeedata 3 - searchdata 4- deleteData:");
		 int num = sc.nextInt();
		 switch(num)
		 {
		 case 1:
			    eo.add();
               eo.display();
               break;
		 case 2: 
			  eo.updateSalary();
			  eo.display();
			  break;
               
		 case 3: 
			  eo.search();
			  break;
			 
	     case 4:
		      eo.delete();
		     // eo.display();
		      break;
		      
		 default:
			 System.out.println("Enter valid Number");
		      
	}
		
	}

	}



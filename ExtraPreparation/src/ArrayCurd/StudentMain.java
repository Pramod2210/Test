package ArrayCurd;

	import java.util.Scanner;

	public class StudentMain {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Operation so = new Operation();
			so.ArrayMain();
			so.show();
			System.out.println("Enter the Operation number which you want to perform (1-AddStudentData, 2-updateStudentdata 3 - searchdata 4- deleteData:");
			 int num = sc.nextInt();
		
			 switch(num)
			 {
			 case 1:
				    so.add();
				    so.show();
	               // break;
			 case 2: 
				 so.update();
				 so.show();
				 // break;
	                
			 case 3: 
				 so.search();
				 // break;
				 
		     case 4:
		    	 so.delete();
			     // break;
			      
			 default:
				 System.out.println("Enter valid Number");
			      
		}
			
		}

	}


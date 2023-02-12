package ArraylistCurd;


	import java.util.ArrayList;
	import java.util.Scanner;

	public class StudentMain {

		public static void main(String[] args) {
			ArrayList<Student> as = new ArrayList();
			Operation so = new Operation();
			   
	    	so.ArrayMain(as);
	    	System.out.println(as);
			Scanner sc = new Scanner(System.in);
			char ch ;
			
			do {
				
			    	System.out.println("\nEnter 1- To add ,2- TO update,3- To Delete 4-Show 5-Search ");
			    	int num = sc.nextInt();
			switch(num)
			{
			    case 1:
			    	System.out.println("Add entry in ArrayList");
			    	so.add(as);
			    	break;
			    	
			    case 2:
			    	System.out.println("Update entry of ArrayList");
			    	so.update(as);
			    	break;
			    	
			    case 3:
			    	System.out.println("Delete entry from ArrayList");
			    	so.delete(as);
			    	break;
			    	
			    case 4:
			    	System.out.println("Show all entries of ArrayList");
			    	so.show(as);
			    	break;
			    	
			    case 5:
			    	System.out.println("Search entriy from ArrayList");
			    	so.search(as);
			    	break;	
			}
				     System.out.println("You want to continue y/n");
			         ch = sc.next().charAt(0);
			         if(ch == 'n' || ch == 'N')
			         {
			        	 System.out.println("Thank You..........");
			         }
			    	
	      }
			while(ch == 'y' ||  ch == 'Y' );
			
		}

	}


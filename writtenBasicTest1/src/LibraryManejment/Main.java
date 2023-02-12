package LibraryManejment;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		// Transition t[]=new Transition[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("---***welcome in the library***---");
		System.out.println();
		System.out.println(" ---***book information***---");
        Library l=new Library();
        do {
        System.out.println("--***welcome to library mamagement system***-- \n press 1 for issue book \n press 2 for return book \n press 3 for BookInformation \n press 4 for Studentinformation \n press 5 for transition");
        int i=sc.nextInt();
        	switch(i) {
        	case 1:{
        		l.issuBook();
        		break;
        	}
        	case 2:{
        		l.returnbook();
        		break;
        	}
        	case 3:{
        		l.bookinfoinfo();
        		break;
        	}
        	case 4:{
        		l.displaystudentinfo();
        		break;
        	}
        	case 5:{
        		l.Transition();
        		break;
        	}
        	
        	default:{
        		System.out.println("enter the valid input!!!!");
        	}
        	}
        	System.out.println("do you continue any other opreation y/n");
        	 ch=sc.next().charAt(0);
        	
        }
        while(ch=='y'||ch=='Y');
        
        System.out.println("      Thank you  Visit Again!!!!");
       
	}

}

package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Employee e[]=new Employee[4];
   Scanner sc=new Scanner(System.in);
   for(int i=0;i<e.length;i++) {
	   System.out.println("enter employee id name salary");
	   int id=sc.nextInt();
	   String name= sc.next();
	   int salary=sc.nextInt();
	   Employee e1=new Employee();
	   e1.setId(id);
	   e1.setName(name);
	   e1.setSalary(salary);
	   e[i]=e1;
	   
   }
    for(int i=0;i<e.length;i++) {
    	for(int j=i+1;j<e.length;j++)
    	if(e[i].getSalary()==e[j].getSalary()) {
    		System.out.println(e[i].getName()+" "+e[j].getName());
    	}
    	
    }
	
   
	}

}

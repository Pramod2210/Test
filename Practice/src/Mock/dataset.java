package Mock;

import java.util.Arrays;
import java.util.Scanner;

public class dataset {
  //Employee e[]=new Employee[2];
  Scanner sc=new Scanner(System.in);

  int size=sc.nextInt();
  Employee e[]=new Employee[size];
  void insertdata() 
  {
	  for(int i=0;i<e.length;i++) {
	  System.out.println("enter the id name dept slary");
	  System.out.println("id shoud be start with 0");
	  int id=sc.nextInt();
	  String name=sc.next();
	  String dept=sc.next();
	  int Salary =sc.nextInt();
	  Employee e1=new Employee();
	  e1.setId(id);
	  e1.setName(name);
	  e1.setDept(dept);
	  e1.setSalary(Salary);
	  e[i]=e1; 
	  
  }
	 }

  void view() {
	  System.out.println("---***view your insetted detail****---");
	 //for(int i=0;i<e.length;i++) {
		 System.out.println(Arrays.toString(e));
	 }
  
  void viewSpecificData() {
	  System.out.println("enter the id which data u view ");
	int i =sc.nextInt();
	System.out.println("view your Specific data");
	  System.out.println(e[i]);
  }
  void update() {
	  System.out.println("enter the id ");
	  
	 int i=sc.nextInt();
	 System.out.println("***-----updated data ***----");
	 System.out.println("ente new salary");
	  int newSalary=sc.nextInt();
	  e[i].setSalary(newSalary);
	  System.out.println(e[i]);
  }
  void deleteData() {
	  System.out.println("enter the id which data u have delete ");
	  int k=0;
	  		int i =sc.nextInt();   
	  		// 2
		 Employee a[]=new Employee[e.length-1]; 
		 for(int j=0;j<e.length;j++) {
			 if(j==i) {               //0   1  2 33    
				 continue;
			 }
			 else {
				 a[k]=e[j];
				k++;
			 }
			 
		 }
		 System.out.println("**---after deleting data----***");
		for(int l=0;l<a.length-1;l++) {
			System.out.println(a[l].getId()+" "+a[l].getName()+a[l].getDept()+a[l].getSalary());
		}
		 
  }
  
  public static void main(String args[]) {
	  dataset d=new dataset();
    d.insertdata();
  d.view();
  d.viewSpecificData();
  d.update();
  d.deleteData();
	

}}

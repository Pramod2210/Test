package ArraylistAssignment;

import java.util.ArrayList;
//1.	WAP to add elements to arraylist without using generics (no <>) and print content of it where Integer is used. In second arraylist String is used.
//2.	WAP add elements to arraylist without using generics, 0th location keep Integer, 1st location String now print each element and display contents.
//3.	WAP to use add operation of ArrayList
public class nonGenericElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList a=new ArrayList();
      a.add(100);
      a.add("pramod");
      a.add(10);
      a.add(20);
      
      System.out.println(a);
      
      ArrayList<Integer>a1=new ArrayList<>();
      a1.add(10);
      a1.add(20);
      System.out.println(a1);
   
      ArrayList<String>b1=new ArrayList<>();
      b1.add("pramod");
      b1.add("preeti");
      System.out.println(b1);
	}

}

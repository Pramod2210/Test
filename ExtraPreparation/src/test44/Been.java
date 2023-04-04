package test44;

import java.util.Arrays;
import java.util.Scanner;

public class Been {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Micricketer m[]=new Micricketer[1];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter id name stricketrate,run is baller");
      int id=sc.nextInt();
      String name=sc.next();
      float stricketrate=sc.nextFloat();
      int run=sc.nextInt();
     // String fild=sc.next();
      boolean isballer=sc.hasNext();
      
      Micricketer k=new Micricketer();
      k.setId(id);
      k.setName(name);
      k.setStrikerate(stricketrate);
      k.setRuns(run);
      k.setIsballer(true);
      m[0]=k;
      
      System.out.println(Arrays.toString(m));
	}
	

}

package Test3;
import java.util.ArrayList;
import java.util.Scanner;

public class Cricketer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the no po player");
   int size=sc.nextInt();
   ArrayList<Player>p=new ArrayList<>();
     for(int i=0;i<size;i++) {
    	 Player pl=new Player();
    	 System.out.println("enter the id  name fild");
    	 int id=sc.nextInt();
    	 String name=sc.next();
    	 String fild=sc.next();
    	 
    	 pl.setId(id);
    	 pl.setName(name);
    	 pl.setFild(fild);
    	 
    	 p.add(pl);
     }
     System.out.println(p);
	}

}

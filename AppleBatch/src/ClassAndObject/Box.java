package ClassAndObject;

import java.util.Scanner;

public class Box { 
	
	void volume(int l,int w, int h) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter lenght,width, height ");
			 l=sc.nextInt();
		 w=sc.nextInt();
		 h=sc.nextInt();
		int volume=l*w*h;
		System.out.println(volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Box b=new Box();
     b.volume(0, 0, 0);
	}

}

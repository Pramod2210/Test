package QuestionPaper;

import java.util.Arrays;

public class BoyancyNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a=22433;
		int num=a;
		int a1[]=new int[5];
		int k=4;
		while(num>0) {
			int r=num%10;
			a1[k]=r;
			num=num/10;
			k--;
		}
		int x=0;
		int y=0;
		System.out.println(Arrays.toString(a1));
		for(int i=0;i<a1.length-1;i++) {
			if(a1[i]<=a1[i+1]) {
				x++;
				System.out.println("x"+x);
			}
		}
			for(int j=0;j<a1.length-1;j++) {
			if (a1[j]>=a1[j+1]) {
				y++;
				System.out.println("y"+y);
			}
		}
		
		if(x==4) {
			System.out.println("increasing number");
		}
		else if (y==4) {
			System.out.println("decreasing number");
			
		}
		else {
			System.out.println("boyancy number");
		}
		
	}

}

package MapPractice;

import java.util.Scanner;
import java.util.ArrayList;

public class Main2 {

	public int count(ArrayList<Integer> list,int n) {

		
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) >= 10 && list.get(i) <= 99) {
				n++;
			}
		}
		
		return n;

	}

	public static void main(String[] args) {

		// DON NOT EDIT GIVEN CODE

		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		Main2 m = new Main2();
		System.out.println("enter");
		int elementcounter = 0;
		for (int i = 0; i < 5; i++) {
			// TAKE INPUT FOR ARRAYLIST
			list.add(sc.nextInt());
		}
		System.out.println(list);

		m.count(list,elementcounter);
    

	}

}

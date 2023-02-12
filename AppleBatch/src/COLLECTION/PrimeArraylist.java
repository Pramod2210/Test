package COLLECTION;

import java.util.ArrayList;

public class PrimeArraylist {
	void setdata(ArrayList<Integer>list) {
		list.add(45);
		list.add(9);
		list.add(6);
		list.add(3);
		list.add(8);
		//list.add(15);
		//list.add(6);
	}
	void check(ArrayList<Integer>list) {
		int sum=0;
		for(Integer x:list) {
			int mid=x/2;
		int i=2;
		while(i<=mid) {
			if(x%i==0) {
			   break;
			}
			i++;
		}
			if(i>=mid) {
				sum=sum+x;
			}
		}
		System.out.println(sum);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al =new ArrayList<>();
		PrimeArraylist p=new PrimeArraylist();
		p.setdata(al);
		System.out.println(al);
		p.check(al);
		
	}

}

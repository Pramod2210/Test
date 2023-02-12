package Mapdemo;

import java.util.ArrayList;
import java.util.HashMap;

public class Ordermain { 
	
	void setdata(ArrayList<Order>a) {
		a.add(new Order(1,550,"pune",new OrderStatus("7/01/2023","pending")));
		a.add(new Order(15,650,"pune",new OrderStatus("17/01/2023","delivered")));
		a.add(new Order(13,450,"mumabi",new OrderStatus("27/01/2023","pending")));
		a.add(new Order(18,550,"pune",new OrderStatus("4/01/2023","delivered")));
		a.add(new Order(11,150,"pune",new OrderStatus("2/01/2023","pending")));
		a.add(new Order(6,550,"akkalkot",new OrderStatus("7/01/2023","delivered")));
		a.add(new Order(5,550,"pune",new OrderStatus("5/01/2023","pending")));
		a.add(new Order(2,550,"pune",new OrderStatus("7/01/2023","pending")));
		a.add(new Order(4,550,"pune",new OrderStatus("9/01/2023","pending")));
		a.add(new Order(19,550,"pune",new OrderStatus("18/01/2023","delivered")));
		
	}
	
	void crestmap(ArrayList<Order>a,HashMap<String,Integer>hm) {
		for(Order d:a) {
			String s=d.o.ststus;
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}
			else {
				hm.put(s, 1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Order>a=new ArrayList<>();
		HashMap<String,Integer>hm=new HashMap<>();
		Ordermain od=new Ordermain();
		od.setdata(a);
		od.crestmap(a, hm);
		System.out.println(hm);
	}

}

package Myexamo;

import java.util.ArrayList;

public class Plainmain {
	
	void setdata(ArrayList<Company>c){
		ArrayList<Plane>p=new ArrayList<>();
		ArrayList<Plane>p1=new ArrayList<>();
		ArrayList<Plane>p2=new ArrayList<>();
		
		p.add(new Plane(101,"airindia",82));
		p.add(new Plane(102,"india",42));
		p.add(new Plane(103,"hawai",52));
		
		p1.add(new Plane(201,"indi",35));
		p1.add(new Plane(202,"go",50));
		p1.add(new Plane(203,"fly",45));
		
		p2.add(new Plane(301,"jahaj",22));
		p2.add(new Plane(302,"flight",42));
		p2.add(new Plane(303,"humsafar",72));
		
		
		c.add(new Company(1,"Airindia",3, p));
		c.add(new Company(2,"Indigo",3, p1));
		c.add(new Company(3,"Kingfisher",3, p2));
	}
	
	void dispaly(ArrayList<Company>c) {
		int min=0;
		int max=0;
		for(Company x:c) {
		  /*for(Plane z:x.p) {
			  min=z.nos;
			  max=z.nos;*/
			
			for(int i=0;i<x.p.size();i++) {
				int min=x.lop.
			  if(z.nos>max) {
				  max=z.nos;
			  }
			  if(z.nos<min) {
				  min=z.nos;
			  }
		  }
		  System.out.println(x.cname+min+max);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Company>p=new ArrayList<>();
		Plainmain m=new Plainmain();
		m.setdata(p);
		System.out.println(p);
		m.dispaly(p);
	}

}

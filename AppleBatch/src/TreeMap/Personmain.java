package TreeMap;

import java.util.TreeMap;

public class Personmain {
	
	void setdata(TreeMap<Person,Integer>tm) {
		tm.put(new Person(1,"pramod","akkalkot"), 22);
		tm.put(new Person(15,"kartik","chinchwad"), 22);
		tm.put(new Person(11,"amar","mumbai"), 22);
		tm.put(new Person(18,"baba","solpur"), 24);
		tm.put(new Person(7,"rinku","up"), 21);
		tm.put(new Person(65,"amir","pune"), 22);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Person,Integer>tm=new TreeMap<>(new Sotname().thenComparing(new sortdept()));
		Personmain p=new Personmain();
		p.setdata(tm);
		System.out.println(tm);
	}

}

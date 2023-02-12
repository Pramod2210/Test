package ComparaterComparable;

import java.util.ArrayList;
import java.util.Collections;

public class FacultMain {

	void setdata(ArrayList<Faculty>F) {
		F.add(new Faculty(1,"pramod","mech","75800","A"));
		F.add(new Faculty(12,"amar","it","65000","sub"));
		F.add(new Faculty(33,"pratik","civil","98000","a"));
		F.add(new Faculty(14,"baba","comp","65400","b"));
		F.add(new Faculty(5,"prem","it","65000","c"));
		F.add(new Faculty(6,"amit","mech","50000","d"));
		F.add(new Faculty(17,"krushna","mech","450000","v"));
		F.add(new Faculty(81,"sahil","civil","58000","m1"));
		F.add(new Faculty(99,"karik","it","56000","m2"));
		F.add(new Faculty(10,"ravan","mech","50000","m3"));
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Faculty>F1=new ArrayList<>();
       FacultMain ff=new FacultMain();
       ff.setdata(F1);
       System.out.println(F1);
       System.out.println("\n***********----------*******");
       Collections.sort(F1, new FacultySortDept().thenComparing(new FacultySortSalary().thenComparing(new FacultySortId())) );
       
       System.out.println(F1);
	}
	

}

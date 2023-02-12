package Mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentCounstMain {
	
	void setdata(HashMap<Integer,StudentConst>stc) {
		stc.put(1, new StudentConst("pramod","mech","98"));
		stc.put(10, new StudentConst("Rahukl","it","88"));
		stc.put(18, new StudentConst("Prera","comp","96"));
		stc.put(12, new StudentConst("Duksh","mech","98"));
		stc.put(11, new StudentConst("Raj","mech","98"));
		stc.put(41, new StudentConst("ravi","entc","95"));
		stc.put(32, new StudentConst("raki","mech","98"));
		stc.put(33, new StudentConst("Atul","civil","78"));
		stc.put(5, new StudentConst("baba","it","48"));
		stc.put(15, new StudentConst("dilip","comp","58"));
		
	}
	void dissplay(HashMap<Integer,StudentConst>stc) {
		for(Map.Entry<Integer, StudentConst> s1:stc.entrySet()) {
			if(s1.c)
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

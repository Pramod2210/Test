package Myexamo;

import java.util.ArrayList;

public class Company {

	int cid;
	String cname;
	int lop;
	ArrayList<Plane>p;
	
	public Company(int cid, String cname, int lop, ArrayList<Plane> p) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.lop = lop;
		this.p = p;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", lop=" + lop + " "+p ;
	}
	
}

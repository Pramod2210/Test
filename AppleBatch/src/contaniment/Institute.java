package contaniment;

public class Institute {
	private int iid;
	 private String iname;
	 Branch b;
	 Subject s;
	 Topic t;
	 Subtopic sub;
	 Question q;
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public Branch getB() {
		return b;
	}
	public void setB(Branch b) {
		this.b = b;
	}
	public Subject getS() {
		return s;
	}
	public void setS(Subject s) {
		this.s = s;
	}
	public Topic getT() {
		return t;
	}
	public void setT(Topic t) {
		this.t = t;
	}
	public Subtopic getSub() {
		return sub;
	}
	public void setSub(Subtopic sub) {
		this.sub = sub;
	}
	public Question getQ() {
		return q;
	}
	public void setQ(Question q) {
		this.q = q;
	}
	@Override
	public String toString() {
		return "Institute iid=" + iid + ", \niname=" + iname + ", \nb=" + b + ", \ns=" + s + ", \nt=" + t + ", \nsub=" + sub
				+ ", \nq=" + q ;
	}
	 
}

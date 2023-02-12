package InheratanceAndPoly;

public class Question {
	private int qid;
	 private String qname;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname + "]";
	}
	 
}

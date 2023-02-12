package InheratanceAndPoly;

public class Subtopic {
	private int subid;
	 private String subname;
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	@Override
	public String toString() {
		return "Subtopic [subid=" + subid + ", subname=" + subname + "]";
	}

	 
}

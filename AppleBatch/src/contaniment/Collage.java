package contaniment;

public class Collage {
 private int cid;
 private String Cname,Address;
  
 Department dept;
 Liabrary lib;
 

public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
public Liabrary getLib() {
	return lib;
}
public void setLib(Liabrary lib) {
	this.lib = lib;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
 
public String toString() {
	return "cid is : "+cid+"\nCollage name : "+Cname+" \nAddress is : "+Address+"\n"+dept+lib;
	
}
 
 
}

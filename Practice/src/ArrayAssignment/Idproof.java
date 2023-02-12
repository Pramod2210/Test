package ArrayAssignment;

public class Idproof {
   int validity;
   String iname;
public int getValidity() {
	return validity;
}
public void setValidity(int validity) {
	this.validity = validity;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
@Override
public String toString() {
	return "Idproof validity=" + validity + ", iname=" + iname ;
}

   
}

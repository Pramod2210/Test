package Inhertance;

public class Mytime extends Mydate {
 int hr,mi,ss;

public int getHr() {
	return hr;
}

public void setHr(int hr) {
	this.hr = hr;
}

public int getMi() {
	return mi;
}

public void setMi(int mi) {
	this.mi = mi;
}

public int getSs() {
	return ss;
}

public void setSs(int ss) {
	this.ss = ss;
}

@Override
public String toString() {

return "Mytime =" + hr + ":" + mi + ":" + ss + "\n dd=" + dd + "/" + mm + "/" + yy ;
}
}

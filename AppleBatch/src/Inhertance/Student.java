package Inhertance;

public class Student extends Person {
 int percent;
 String collagename;
public int getPercent() {
	return percent;
}
public void setPercent(int percent) {
	this.percent = percent;
}
public String getCollagename() {
	return collagename;
}
public void setCollagename(String collagename) {
	this.collagename = collagename;
}
 
@Override
public String toString() {
	return "Student [percent=" + percent + ", collagename=" + collagename + "]";
}
void graead() {
	if (percent>=80)
		System.out.println("A gread");
	else if(percent>=70)
		System.out.println("b gread");
	else if(percent>=35)
		System.out.println("c gread");
	else
		System.out.println("fail");
	}
}


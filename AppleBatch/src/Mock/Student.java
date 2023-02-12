package Mock;

public class Student {
   int id,m1,m2,m3;
   Lenth name;
   int precent;
   
 public int getPrecent() {
	return precent;
}
public void setPrecent(int precent) {
	this.precent = precent;
}
int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getM1() {
	return m1;
}
public void setM1(int m1) {
	this.m1 = m1;
}
public int getM2() {
	return m2;
}
public void setM2(int m2) {
	this.m2 = m2;
}
public int getM3() {
	return m3;
}
public void setM3(int m3) {
	this.m3 = m3;
}
public Lenth getName() {
	return name;
}
public void setName(Lenth name) {
	this.name = name;
}
@Override
public Lenth toString() {
	return "Student [id=" + id + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", name=" + name + ", precent=" + precent
			+ "]";
}

   
}

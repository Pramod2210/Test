package Overriding;

public class GrandFather {
  String fn,mn;
  static String  ln="patil";
  

public void setFn(String fn) {
	this.fn = fn;
}
public void setMn(String mn) {
	this.mn = mn;
}


public String getFn() {
	return fn;
}
public String getMn() {
	return mn;
}

void Display() {

	System.out.println("---*grandfather detail--*");
	System.out.println("first name :"+fn+"\n middle name : "+mn+"\nlast name : "+ln);
}

  
  

}

package contaniment;

public class Driver {
 int did;
 String dname,contact;
 
 Driver(int did,String dname,String contact ){
	 this.did=did;
	 this.dname=dname;
	 this.contact=contact;
 }
 
 public String toString() {
	 return "did is :"+did+"  name  "+dname+" contact "+contact;
 }
 
}

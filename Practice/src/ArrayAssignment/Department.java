package ArrayAssignment;
//23. Create class Dept(did, dname), class MyDate(day, month, year) 
//Class Employee(emp_id, emp_name, salary, date(object), dept(object)). Create array 
//of Employee and display the array elements.


    public class Department {
   int did;
   String dname;
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
@Override
public String toString() {
	return "Department did=" + did + ", dname=" + dname;
}

   
}

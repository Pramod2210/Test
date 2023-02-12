package LibraryManejment;

public class Student {
 private int id;
 private String name,email,dept;
 private String status;
 private int bookid;
 
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "\nStudentid=" + id + " name=" + name + " email=" + email + " dept=" + dept + " status=" + status
			+ " bookid=" + bookid ;
}

 
}

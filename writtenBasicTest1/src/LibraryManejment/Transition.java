package LibraryManejment;

import java.time.LocalDate;

public class Transition {
  Student s;
 private String bookname;
 private LocalDate issuedate;
 private String returndate;
public Student getS() {
	return s;
}
public void setS(Student s) {
	this.s = s;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public LocalDate getIssuedate() {
	return issuedate;
}
public void setIssuedate(LocalDate issuedate2) {
	this.issuedate = issuedate2;
}
public String getReturndate() {
	return returndate;
}
public void setReturndate(String returndate) {
	this.returndate = returndate;
}
@Override
public String toString() {
	return "Transition s=" + s + "\nbookname=" + bookname + "\nissuedate=" + issuedate + "\nreturndate=" + returndate
			;
}

}
 
 
 
	
	
 


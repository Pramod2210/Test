package contaniment;

public class Liabrary {
 private int books;
 private String inchargeName;
 
 
 
public int getBooks() {
	return books;
}
public void setBooks(int books) {
	this.books = books;
}
public String getInchargeName() {
	return inchargeName;
}
public void setInchargeName(String inchargeName) {
	this.inchargeName = inchargeName;
}
@Override
public String toString() {
	return "\nLiabrary books=" + books + "\ninchargeName=" + inchargeName;
}
 

 
}

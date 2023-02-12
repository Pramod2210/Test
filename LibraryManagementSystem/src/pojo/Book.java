package pojo;

public class Book {
 private int id,copyNo;
 private String name,author;
 
 /*Book(int id,String name,String author,int copyno){
	 this.id=id;
	 this.name=name;
	 this.author=author;
	 this.copyNo=copyno;
	 
 }*/
 
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCopyNo() {
	return copyNo;
}
public void setCopyNo(int copyNo) {
	this.copyNo = copyNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return"\nBookid=" + id + " copyNo=" + copyNo + " name=" + name + " author=" + author;

}
 
}

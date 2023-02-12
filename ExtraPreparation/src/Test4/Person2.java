package Test4;

public class Person2 {
int id;
String name;
Country c;
public Person2(int id, String name, Country c) {
	super();
	this.id = id;
	this.name = name;
	this.c = c;
}
@Override
public String toString() {
	return "Person2 [id=" + id + ", name=" + name + ", c=" + c + "]";
}

}

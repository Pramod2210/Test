package TreeMap;

public class Person {//implements Comparable<Person> {
int id;
String name,city;
public Person(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}

public String toString() {
	return "id=" + id + ", name=" + name + ", city=" + city  ;
}

/*public int compareTo(Person p) {
	// TODO Auto-generated method stub
	//return this.name.compareTo(p.name);
	return this.id=p.id;
}*/

}




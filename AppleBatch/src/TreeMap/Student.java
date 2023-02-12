package TreeMap;

public class Student {
	int id;
	String name,city;
	public Student(int id, String name, String city) {
		
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public String toString() {
		return "id=" + id + ", name=" + name + ", city=" + city  ;
	}
}

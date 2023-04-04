package Myexamo;

public class Plane {
  
	int id;
	String name;
	int nos;

	public Plane(int id, String name, int nos) {
		super();
		this.id = id;
		this.name = name;
		this.nos = nos;
		
	}
	@Override
	public String toString() {
		return "Plane [id=" + id + ", name=" + name + ", nos=" + nos   ;
	}
	
	
}

package COLLECTION;

public class Actor {

	int id;
	String name;
	Actor(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + "]";
	}
	
}

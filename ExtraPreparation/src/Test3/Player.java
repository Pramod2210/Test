package Test3;
//Write a main method in which you accept values from user to create 3 objects of cricketer 
//and display them. To display method you should use tostring method. 
public class Player {
  
	int id;
	String name,fild;
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
	public String getFild() {
		return fild;
	}
	public void setFild(String fild) {
		this.fild = fild;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", fild=" + fild + "]";
	}
	
}

package COLLECTION;

public class Person2 {
	
	int id;
	String name,contact;
	Address1 add;
	
	Person2(int id,String name,String contact,Address1 add) {
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.add=add;
	}

	@Override
	public String toString() {
		return "Person2 id=" + id + ", name=" + name + ", contact=" + contact + ", add=" + add;
	}
		
		
	}
	

	


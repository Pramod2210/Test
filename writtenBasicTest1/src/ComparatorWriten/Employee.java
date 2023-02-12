package ComparatorWriten;

public class Employee {
	 
		    int id;
		    String name;
		    Profile p;
			public Employee(int id, String name, Profile p) {
				
				this.id = id;
				this.name = name;
				this.p = p;
			}
			@Override
			public String toString() {
				return "\nEmployee id=" + id + ", name=" + name + "Profile:"+ p;
			}
		    
			
		  }


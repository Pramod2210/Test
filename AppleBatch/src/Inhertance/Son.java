package Inhertance;

public class Son extends Father {
  
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Son [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

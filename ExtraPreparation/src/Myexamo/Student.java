package Myexamo;

import java.util.ArrayList;

public class Student {
  int id;
  String name;
  ArrayList<Integer>cid;
public Student(int id, String name, ArrayList<Integer> cid) {
	super();
	this.id = id;
	this.name = name;
	this.cid = cid;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", cid=" + cid + "]";
}

  
}

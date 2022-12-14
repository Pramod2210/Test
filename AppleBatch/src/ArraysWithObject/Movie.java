package ArraysWithObject;

import java.util.Arrays;

public class Movie {
    int id,Releasyear;
    String  name;
    Theater t[];
    Movie(int id,String name,int Releasyear,Theater t[]){
    
    	this.id=id;
    	this.name=name;
    	this.Releasyear=Releasyear;
    	this.t=t;
    }

	@Override
	public String toString() {
		return "Movie id=" + id + " Releasyear=" + Releasyear + " name=" + name+Arrays.toString(t) ;
	}
    
}

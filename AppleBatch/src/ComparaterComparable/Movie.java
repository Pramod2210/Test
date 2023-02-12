package ComparaterComparable;

import java.util.ArrayList;

public class Movie {
 int id;
 String Moviename,boxofficeCollection;
 ArrayList<Actor>Ac;
 
 Movie(int id,String Moviename,String Collection, ArrayList<Actor>Ac){
	 this.id=id;
	 this.Moviename=Moviename;
	 this.boxofficeCollection=Collection;
	 this.Ac=Ac;
 }

@Override
public String toString() {
	return "Movie id=" + id + ", Moviename=" + Moviename + ", boxofficeCollection=" + boxofficeCollection + ", Ac="
			+ Ac + "]";
}
 
}

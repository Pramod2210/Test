package ComparaterComparable;

import java.util.Comparator;

public class MovieNameSort implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.Moviename.compareToIgnoreCase(o2.Moviename);
	}

}

package ComparatorWriten;

import java.util.Comparator;

public class EmployeeSortOnCountry implements Comparator<Employee> {

		

		
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return (o1.p.country.compareTo(o1.p.country));
		}
}

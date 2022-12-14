package contaniment;

public class Mydate {
 private int day;
 private String  month;
 private int year;
 
 // using geterseter
/*public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
*/
 
 // using constractor 
 Mydate(int day,String month,int year){
	 this.day=day;
	 this.month=month;
	 this.year=year;
 }



@Override
public String toString() {
	return "Mydate day=" + day + ", month=" + month + ", year=" + year;
}
 
 
}

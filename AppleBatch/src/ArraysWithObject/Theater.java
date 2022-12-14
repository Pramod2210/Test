package ArraysWithObject;



public class Theater {
  int tid;
  String tname;
  
  
  Theater(int tid,String tname){
	  this.tid=tid;
	  this.tname=tname;
	
  }

@Override
public String toString() {
	return "Theater tid=" + tid + "tname=" + tname ;
}
  
}

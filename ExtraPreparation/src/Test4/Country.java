package Test4;

public class Country {
  int cid;
  String cname;
  Country(int cid,String cname){
	  this.cid=cid;
	  this.cname=cname;
  }
  public String toString() {
	  return cid +" "+cname;
  }
}

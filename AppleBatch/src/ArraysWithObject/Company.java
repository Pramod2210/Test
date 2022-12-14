package ArraysWithObject;

import java.util.Arrays;

public class Company {
   int cid;
   String cname;
   Department dep[];
   
   Company(int cid,String cname,Department dep[]){
	   this.cid=cid;
	   this.cname=cname;
	   this.dep=dep;
   }

@Override
public String toString() {
	return "Company [cid=" + cid + ", cname=" + cname + ", dep=" + Arrays.toString(dep);
}
   
   
}

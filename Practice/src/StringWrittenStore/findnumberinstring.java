package StringWrittenStore;

public class findnumberinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="ja2va$jah t6@h,j.8";
    char[] s1=s.toCharArray();
   for(int i=0;i<s1.length;i++) {
	   if(s1[i]<64) {
		   System.out.println(s1[i]);
	   }
   }
	}

}

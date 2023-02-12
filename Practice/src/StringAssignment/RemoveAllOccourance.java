package StringAssignment;

public class RemoveAllOccourance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="abbacabbac";//abab
  String s1="bac";
  char s2[]=s.toCharArray();
     //String s2[]=s.split(" ");
     for(int i=0;i<s2.length;i++) {
    	 if(s2[i]=='bac') {
    		 continue;
    	 }
    	 else {
    		 System.out.print(s2[i]+" ");
    	 }
     }
	}

}

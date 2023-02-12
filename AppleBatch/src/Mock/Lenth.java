package Mock;

public class Lenth {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		 String s[]={"Java","India","Core","Advance"};
		 int max=s[0].length();
		 int k=0;
		 for(int i=0;i<s.length;i++) {
			 if(s[i].length()>max) {
				 max=s[i].length();
				 k=i;
			 }
		 }
		 System.out.println(s[k]);

}
}
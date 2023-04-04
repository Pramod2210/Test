package Create;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="India is best contry and best";
 int count=0;
   String s1[]=s.split(" ");
   for(int i=0;i<s1.length;i++) {
	   for(int j=i+1;j<s1.length;j++) {
		   if(s1[i].equals(s1[j])) {
			   System.out.println(s1[i]);
			   for(int k=0;k<s1[i].length();k++) {
				   count++;
			   }
			   System.out.println(count);
		   }
	   }
   }
		
		
	}

}

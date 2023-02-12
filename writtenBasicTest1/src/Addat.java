import java.util.Arrays;

public class Addat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="Shivani";
     char ch[]=s.toCharArray();
     System.out.println(Arrays.toString(ch));
      for(int i=0;i<ch.length;i++) {
    	  if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
    		  ch[i]='@';
    	  }
      }
       String s1=new String(ch);
     System.out.println(s1);
	}

}

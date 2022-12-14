package Array;

import java.util.Arrays;

public class CaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  char ch[]= {'a','B','c','D'};
   for(int i=0;i<ch.length;i++) {
	   if(ch[i]>='a'&& ch[i]<='z') {
		   ch[i]=((char)(ch[i]-32));
	   }
	   else if(ch[i]>='A'&& ch[i]<='Z') {
			   ch[i]=((char)(ch[i]+32));
	   }
   }
  System.out.println(Arrays.toString(ch));
	}

}

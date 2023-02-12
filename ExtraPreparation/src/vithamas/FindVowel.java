package vithamas;
//find vowels from string
public class FindVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a="APPALE";
       String b=a.toLowerCase();
      char ch[]=b.toCharArray();
      
       for(int i=0;i<ch.length;i++) {
    	   if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='0'||ch[i]=='u') {
    		   System.out.println(ch[i]);
    	   }
    	   
       }
	}

}

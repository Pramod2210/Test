package Create;

public class Addtwostringalternatly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="abcdefg";
    String s1="1234";
   
     char ch[]=s.toCharArray();
     char ch1[]=s1.toCharArray();
    for(int i=0;i<s.length();i++) {
    	if(i<s.length()&& i<s1.length()) {
    		System.out.print(ch[i]) ;
    		System.out.print(ch1[i]);
    	}
    	else {
    		System.out.print(ch[i]);
    	}
    }
	}

}

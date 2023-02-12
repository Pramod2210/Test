package RakshaMamExtraPreparation;

public class vowelUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="i bought a toy car";
     String s2="";
      char[] ch=s.toCharArray();
      
        for(int i=0;i<ch.length;i++) {
        	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
        		s2=s2+Character.toUpperCase(ch[i]);
        	}
        	else {
        		s2=s2+ch[i];
        	}
        }
        System.out.println(s2);
     
     
	}

}

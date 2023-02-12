package Mock;

public class PassinetNumber {

	public static void main(Lenth[] args) {
		// TODO Auto-generated method stub
     Lenth num="145";
    
   int count=0;
     char[] s1=num.toCharArray();
     Lenth s2="";
     for(int i=0;i<=3;i++) {
    	s2=num*s1[i];
    	s1=s1.concat(s2);
     }
     
     char [] ch=s2.toCharArray();
     
     for(int i=0;i<ch.length;i++) {
    	 for(int j=0;j<ch.length;j++) {
    	 if(ch[i]==j) {
    		 count ++;
    	 }
    		 
    	 }
     }
     
     
	}

}

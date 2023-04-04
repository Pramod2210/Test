package Myexamo;

public class FreduencyGreater3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     String s="12342134123711";
     char ch[]=s.toCharArray();
     for(int i=0;i<ch.length;i++) {
		  int count=1;
		  for(int j=i+1;j<ch.length;j++) {
			  
			  if(ch[i]==ch[j]) {
				  ch[j]=0;
				  count++;
			  } 
		  }
		  if(count>3) {
			  System.out.println(ch[i]);
		  }
	}
	}
}

package Myexamo;

public class Occorance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String s="prramordp";
		  char ch[]=s.toCharArray();
		
		  for(int i=0;i<ch.length;i++) {
			  int count=1;
			  for(int j=i+1;j<ch.length;j++) {
				  if(ch[j]!=0) {
			  if(ch[i]==ch[j]) {
				  ch[j]=0;
				  
				  count++;
				  
			  }
			  }
				  }
			  if(count==1) {
				  System.out.print(ch[i]+"");
			  }
		  }
	}
	}


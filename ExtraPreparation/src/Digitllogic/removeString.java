package Digitllogic;

public class removeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="java is object oriented language";
   String s2="oriented";
   String s3="";
   String s1[]=s.split(" ");
   for(int i=0;i<s1.length;i++) {
	   if(s1[i].equals(s2)) {
		   continue;
	   }
	   else {
		   s3=s3+s1[i]+" ";
	   }
   }
   System.out.println(s3);
	
//               
//	 length 
  /* String a="";
   int maxlength=s1[0].length();
	for(int i=0;i<s1.length;i++) {
		for(int j=0;i<s1.length;j++) {
			if(s1[i].length()>maxlength) {
				maxlength=s1[i].length();
				a=s1[i];
			}
		}
	}
	for(int i=0;i<s1.length;i++) {
		   if(s1[i].equals(s2)) {
			   continue;
		   }
		   else {
			   s3=s3+s1[i]+" ";
		   }
	   }
	   System.out.println(s3);*/
	
	
	}
}

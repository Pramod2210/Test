package String;

import java.util.Arrays;

public class AnagramBymanualShorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="hello";
   String s1="olleh";
   int flag=0;
   if(s.length()==s1.length()) {
	 char a[] = s.toCharArray();
	   char b[]=s1.toCharArray();
	   
	   for(int i=0;i<a.length;i++ ) {
		   for(int j=0;j<a.length-1;j++) {
			   if(a[j]>a[j+1]) {
				  char temp=a[j];
				  a[j]=a[j+1];
				  a[j+1]= temp;
			   }
			 
		   }
	   }
	   for(int i=0;i<b.length;i++ ) {
		   for(int j=0;j<b.length-1;j++) {
			   if(b[j]>b[j+1]) {
				  char temp=b[j];
				  b[j]=b[j+1];
				  b[j+1]= temp;
			   }
			 
		   }
	   }
	   for(int i=0;i<a.length;i++) {
		   if(a[i]!=b[i]) {
			   flag++;
			   break;
		   }
	   }
	   if(flag==0) {
		   System.out.println("anagram");
	   }
	   else {
		   System.out.println("not anagram");
	   }
	   
	  
   }
   else {
	   System.out.println("not anagram");
   }
   
	}

}

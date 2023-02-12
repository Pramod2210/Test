package LibraryManejment;


		import java.util.Arrays;
		import java.util.Scanner;

		public class ChangeEachCharacterFromUpperTolower
		{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter name");
			String str=sc.next();
			String outputstr="";
			char ch[]=str.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>='A' && ch[i]<='Z') {
					ch[i]=(char)(ch[i]+32);
				}
				else if(ch[i]>='a' && ch[i]<='z') {
					ch[i]=(char)(ch[i]-32);
			}
			}
			outputstr=new String(ch);
			System.out.println(outputstr);
		}
		

	}



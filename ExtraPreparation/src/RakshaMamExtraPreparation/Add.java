package RakshaMamExtraPreparation;

import java.util.Arrays;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =  "abcdefg";
		char ch1[]= s1.toCharArray();
		
	    String s2 = "1234";
	    char ch2[] = s2.toCharArray();

		char ch3[] = new char[ch1.length+ch2.length];
		
		int j = 0;
	    for(int i = 0;i< s1.length();i++) 
		{
	    	if(i < ch1.length && i < ch2.length) 
			{
	    		ch3[j] =ch1[i] ;  
	    		ch3[j+1]=ch2[i];   
	         
	    		j=j+2;    
			}
	    	else if(i< ch1.length )
	    	{
	    		ch3[j] = ch1[i];
	    		j++;
	    	}
		}
	    String s5=new String(ch3);
	    System.out.println(s5);
	}

}

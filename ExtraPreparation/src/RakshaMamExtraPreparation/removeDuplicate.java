package RakshaMamExtraPreparation;

import java.util.Arrays;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char ch[]= {'a','b','b','n','u','y','x','s','y'};
	char ch1[]= new char[ch.length];
	for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
			 ch[j]=0;
			 ch[i]=0;
			}
		}
	}
	for(int i=0;i<ch.length;i++) {
		if(ch[i]!=0) {
			System.out.print(ch[i]+",");
		}
	}
	
	
	}

}

package MockPreparation;

import java.util.Arrays;

public class Demoooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String a[]= {"aabaaba","bbaabb","abbab","aaabbb","abbbbabbb"};
		for(int i=0;i<a.length;i++) {
			if(a[i].length()%2!=0) {
				count ++;
			}
		}
		System.out.println(count);
	}
}

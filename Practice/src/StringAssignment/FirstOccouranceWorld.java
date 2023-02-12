package StringAssignment;

import java.util.Arrays;

public class FirstOccouranceWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="we on learn it java as soon as possiable on it platform";
		String s1[]=s.split(" ");
  int count=0;
		System.out.println(Arrays.toString(s1));
		
		for(int i=0;i<s1.length;i++) {
			//if(count==0) {
			for(int j=i+1;j<s1.length;j++) {
			if(s1[i].equalsIgnoreCase(s1[j])) {
				System.out.print(s1[j]+" ");
				 //count++;  
				
			}
	
			
			
		}
			
			
			
	}
	}

}


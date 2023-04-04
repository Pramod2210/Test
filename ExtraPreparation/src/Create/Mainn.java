package Create;

import java.util.Arrays;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="ram,sita,lakshiman&age=24,21,18&subject=maths|physics|secince,math|science,english";
  String s1[]=s.split("&age=");
  String s2[]=s.split("&subject=");
  String s3=(String) s.replaceAll("[^a-zA-Z0-9]", " ");
  String s5[]=s3.split(" ");
  
  //System.out.println(Arrays.toString(s1));
  //System.out.println(Arrays.toString(s2));
  System.out.println(s3);
  System.out.println(Arrays.toString(s5));
	}

}

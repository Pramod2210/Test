package RakshaMamExtraPreparation;

public class DuplicateElementStringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="pramod is good boy and atif is good boy";
      String a[]=s.split(" ");
      int count=0;
      for(int i=0;i<a.length;i++) {
    	  for(int j=i+1;j<a.length;j++) {
    		  if(a[i].equals(a[j])) {
    			  count++;
    			  System.out.println(a[i]);
    		  }
    	  }
      }
      System.out.println(count);
	}

}

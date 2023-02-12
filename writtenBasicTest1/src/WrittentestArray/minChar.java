package WrittentestArray;

public class minChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   char a[] = {'A','D','E','x','z','R'};
   int min=a[0];
   for(int i=0;i<a.length;i++) {
	   if(a[i]<min) {
		   min=a[i];
	   }
   }
   System.out.println(min);
	}

}

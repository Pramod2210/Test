package WrapperClass;

public class ParsInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z=500;
		
		Integer a=Integer.valueOf(z);
		System.out.println(a);
		
		
        Integer i=Integer.valueOf("1234");
        System.out.println(i);
        
        String s="12345";
        int x=Integer.parseInt(s);
        int y=x*2;
        System.out.println("*-------");
        System.out.println(x);
        System.out.println(y);
        System.out.println("//*");
        float f=Float.parseFloat("45.60");
        System.out.println(f);
	}

}

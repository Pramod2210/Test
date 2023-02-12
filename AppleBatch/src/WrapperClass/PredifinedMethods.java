package WrapperClass;

public class PredifinedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char ch='8';
      System.out.println("digit "+Character.isDigit(ch));
      System.out.println("letter"+Character.isLetter(ch));
      System.out.println("upper"+Character.isUpperCase(ch));
     System.out.println("lower"+Character.isLowerCase(ch));
     System.out.println("whitespace"+Character.isWhitespace(ch));
     System.out.println("Identi"+Character.isJavaIdentifierPart(ch));
     System.out.println("max"+Character.MAX_VALUE);
     System.out.println("min"+Character.MIN_VALUE);
      System.out.println(Integer.MAX_VALUE);
      System.out.println(Integer.MIN_VALUE);
     
      System.out.println(Integer.compare(50, 40));  // if smalla then print -1 if greater +1
	System.out.println(Integer.max(10, 50));
	System.out.println(Integer.sum(50, 5));
	
	System.out.println(Integer.toBinaryString(500));
	System.out.println(Integer.toHexString(1));
	System.out.println(Integer.toHexString(500));
	}

}

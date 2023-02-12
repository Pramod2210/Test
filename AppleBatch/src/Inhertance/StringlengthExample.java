package Inhertance;

public class StringlengthExample {
   
	int getStringlength(String s) throws NullPointerException {
		{
			if(s==null) {
				throw new NullPointerException("string is null");
			}
		
		}
		return s.length();
		
	}
	void stringoperations(String s) {
		try {
		System.out.println(s.length());
	}catch(NullPointerException e) {
		System.out.println(e);
	}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringlengthExample s1=new StringlengthExample();
		System.out.println(s1.getStringlength("pramod"));
		s1.stringoperations(null);
		System.out.println(s1.getStringlength("pravin"));
		try {
		System.out.println(s1.getStringlength(null));
		}catch(NullPointerException e) {
			System.out.println(e);
			
		}
		System.out.println(s1.getStringlength(null));
	}

}

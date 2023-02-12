package CustomException;

public class FileName  {
	void name(String s) throws FileNameException{
		char ch=s.charAt(0);
		if(Character.isDigit(ch)) {
			throw new FileNameException("file name start with digit");
		}
		else {
			System.out.println("file readed");
		}
	}
	
	void add(int a,int b) {
		System.out.println("addition "+(a+b));
	}
	

	public static void main(String[] args) throws FileNameException {
		// TODO Auto-generated method stub
       FileName f=new FileName();
       try {
       f.name("java");
       }
       catch(FileNameException e) {
    	   System.out.println(e);
       }
       f.add(10, 10);
       System.out.println("done");
	}

}

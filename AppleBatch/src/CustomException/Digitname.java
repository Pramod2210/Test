package CustomException;

public class Digitname {
	
	void filename(char ch) throws filenameContainsDigit{
		if(Character.isDigit(ch)) {
			throw new filenameContainsDigit("file name contains digit");
		}
			else
			{
				System.out.println("file is saved");
			}
	}

	public static void main(String[] args) throws filenameContainsDigit {
		// TODO Auto-generated method stub
		Digitname d=new Digitname();
		String filename="java8";
		d.filename(filename.charAt(0));
	}

}

package CustomException;

public class MobileNumber {
	
	void Number(String num)throws NumberLengthException{
		if(num.length()>10 || num.length()<10) {
			throw new NumberLengthException("number is not in format");
		}
		else {
			System.out.println("number is correct");
		}
	}
	
	

	public static void main(String[] args) throws NumberLengthException {
		// TODO Auto-generated method stub
		MobileNumber m=new MobileNumber();
		m.Number("9154544310");
		/*try {
		m.Number("9545443151");
		}
		catch(NumberLengthException e) {
			System.out.println(e);
		}*/
		System.out.println("done");
	}

}

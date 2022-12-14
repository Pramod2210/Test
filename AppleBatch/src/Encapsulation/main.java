package Encapsulation;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		Account a2= new Account();
		a1.setId(1);
		a1.setAcnumber(5546);
		a1.setBalance(35000);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the payamount");
		int amt=sc.nextInt();
		Googlepay gp= new Googlepay();
		gp.withdraw(amt,a1);
		System.out.println("amount :"+a1.getBalance());
	}

}

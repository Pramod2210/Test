package Encapsulation;

import java.util.Scanner;

class Googlepay {

	void withdraw(int amt, Account a1) {
		int accbal = a1.getBalance();
		if (accbal > amt) {
			accbal = accbal - amt;
			a1.setBalance(accbal);
		} else {
			System.out.println("low balance");
		}
	}

	void diposite(int ammount, Account a1) {
		int accountbal = a1.getBalance();
		accountbal = accountbal + ammount;
		a1.setBalance(accountbal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		//Account a2 = new Account();
		a1.setId(1);
		a1.setAcnumber(5546);
		a1.setBalance(35000);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the payamount");
		int amt = sc.nextInt();
		Googlepay gp = new Googlepay();
		System.out.println("the payment is processing");
		gp.withdraw(amt, a1);
		System.out.println("--** payment Sucessfully **--");
		System.out.println(" the avalable amount is  :" + a1.getBalance());
		/*
		 * a2.setId(5); a2.setAcnumber(5596); a2.setBalance(10000);
		 */
		System.out.println();
		System.out.println(" -------******wating next transition------***** ");
		System.out.println("enter diposit amo ");
		int ammount = sc.nextInt();
		System.out.println("the  diposite is processing");
		gp.diposite(ammount, a1);
		System.out.println("--** diposite is successfully **--");
		System.out.println("the avalable total bal : " + a1.getBalance());
	}

}

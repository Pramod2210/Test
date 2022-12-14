package ClassAndObject;

public class SalaryCalculation {
	 
	void salary(int salary) {
		double pf= salary * 0.15;
		double amount=salary-pf;
		System.out.println("salary : "+amount);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryCalculation c1= new SalaryCalculation();
		c1.salary(15000);
	}

}

package Pojo;

public class Employee {
	String first_name;
	String last_name;
	String email;
	String mobile_no;
	String birth_date;
	String gender;
	Address a;

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + ", mobile_no="
				+ mobile_no + ", birth_date=" + birth_date + ", gender=" + gender + ", a=" + a + "]";
	}

}

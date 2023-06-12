
package java8Practice;

public class Student extends Person {
	private String collegeName;
	private int year;

	public Student(String name, String email, String phoneNumber, String collegeName, int year) {
		super(name, email, phoneNumber);
		this.collegeName = collegeName;
		this.year = year;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Student [collegeName=" + collegeName + ", year=" + year + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", getPhoneNumber()=" + getPhoneNumber() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}

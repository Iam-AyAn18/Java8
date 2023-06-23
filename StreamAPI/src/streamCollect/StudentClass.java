package streamCollect;

public class StudentClass {
	
	int roll;
	String Name;
	int marks;
	String gender;
	public StudentClass(int roll, String name, int marks, String gender) {
		super();
		this.roll = roll;
		Name = name;
		this.marks = marks;
		this.gender = gender;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}

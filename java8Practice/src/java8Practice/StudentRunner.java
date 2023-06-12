package java8Practice;

public class StudentRunner {
	public static void main(String[] args) {
		Student student = new Student("Ayan", "abc@abc.com", "801778954", "ABC inst", 7998);
		System.out.println(student);
		System.out.println(student instanceof Person);
		System.out.println(student instanceof Student);
		
		Person student2 = new Student("Ayan", "abc@abc.com", "801778954", "ABC inst", 7998);
		System.out.println(student2);
		System.out.println(student2 instanceof Person);
		System.out.println(student2 instanceof Student);
		
		Person person = new Person("Ayan", "abc@abc.com", "801778954");
		System.out.println(person);
		System.out.println(person instanceof Person);
		System.out.println(person instanceof Student);
	}
}

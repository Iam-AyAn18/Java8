package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7);

		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		System.out.println(list);

		list.stream().map(n -> n / 2).forEach(System.out::println);
		System.out.println(list);

		List<Integer> list2 = list.stream().map(n -> n / 2).peek(System.out::println).collect(Collectors.toList());
		System.out.println(list2);

		System.out.println(list.stream().map(n -> n / 2).allMatch(n -> n > 0));
		System.out.println(list.stream().map(n -> n / 2).anyMatch(Objects::nonNull));

		//****************************************
		
		List<Student> listOfStudents = new ArrayList<Student>();

		listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));

		listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));

		listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));

		listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));

		listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));

		listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));

		listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));

		listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));

		listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));

		listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
		Predicate<Student> mathematicsPredicate = (Student student) -> student.getSpecialization()
				.equals("Mathematics");

		List<Student> mathematicsStudents = new ArrayList<Student>();

		for (Student student : listOfStudents) {
			if (mathematicsPredicate.test(student)) {
				mathematicsStudents.add(student);
			}
		}
		List<Student> mathematicsStudents2 = new ArrayList<Student>();
		FunctionalInterfaceEx<Student> history = (Student student) -> student.getPercentage()>80;
		
		for (Student student : listOfStudents) {
			if (history.test(student)) {
				mathematicsStudents2.add(student);
			}
		}

		System.out.println(mathematicsStudents2);
	}

}

package streamCollect;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentRunner {

	public static void main(String[] args) {

		List<StudentClass> studentList = new ArrayList<StudentClass>();
		
		studentList.add(new StudentClass(1, "ABC", 90, "Male"));
		studentList.add(new StudentClass(2, "ABF", 91, "Male"));
		studentList.add(new StudentClass(3, "ABE", 92, "Female"));
		studentList.add(new StudentClass(4, "ABD", 93, "Female"));
		studentList.add(new StudentClass(5, "ABG", 94, "Male"));
		studentList.add(new StudentClass(6, "ABS", 95, "Female"));
		studentList.add(new StudentClass(7, "ABA", 60, "Female"));
		studentList.add(new StudentClass(8, "ABQ", 50, "Female"));
		
		Map<Boolean, Long> gender = studentList.stream().collect(Collectors.partitioningBy(student -> student.getGender()=="Male",Collectors.counting()));
		System.out.println(gender);
		

		Map<String, Long> studentsGroupedBySubject = studentList.stream().collect(Collectors.groupingBy(StudentClass::getGender,Collectors.counting()));
		System.out.println(studentsGroupedBySubject);
		
		IntSummaryStatistics studentStats = studentList.stream().collect(Collectors.summarizingInt(student -> student.getMarks()));    
		System.out.println("Highest Percentage : "+studentStats.getMax());        
		System.out.println("Lowest Percentage : "+studentStats.getMin());      
		System.out.println("Average Percentage : "+studentStats.getAverage());
	}

}

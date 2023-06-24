package spliterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Example {

	public static void main(String[] args) {

		List<String> languageList = Arrays.asList("Java", "C", "C++", "Python", "Scala", "Kotlin");
		Spliterator<String> languageSpliterator = languageList.spliterator();
		languageSpliterator.tryAdvance(System.out::println);
		languageSpliterator.tryAdvance(System.out::println);
		System.out.println("----");
		languageSpliterator.forEachRemaining(System.out::println);
		
		Spliterator<String> languageSpliterator2 = languageList.spliterator();
		Spliterator<String> languageSpliterator3 = languageSpliterator2.trySplit();
		System.out.println("----");
		System.out.println(languageSpliterator2.estimateSize());
		languageSpliterator2.forEachRemaining(System.out::println);
		System.out.println(languageSpliterator2.estimateSize());
		System.out.println("----");
		languageSpliterator3.forEachRemaining(System.out::println);
		
		List<Integer> naturalOrder = Arrays.asList(1,2,3,4,5,6);
		Spliterator<Integer> naturalOrderSpliterator = naturalOrder.spliterator();
		//System.out.println(naturalOrderSpliterator.getComparator());
		
	}

}

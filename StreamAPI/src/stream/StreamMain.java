package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {

		List<Integer> list= Arrays.asList(1,2,4,5,6,7);
		
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		System.out.println(list);
		
		list.stream().map(n->n/2).forEach(System.out::println);
		System.out.println(list);
		
		List<Integer> list2 =list.stream().map(n->n/2).peek(System.out::println).collect(Collectors.toList());
		System.out.println(list2);
		
		System.out.println(list.stream().map(n->n/2).allMatch(n->n>0));
	}

}

package optional;

import java.util.Optional;

public class Examples {

	public static void main(String[] args) {
		Optional<String> nullValue = Optional.empty();
		Optional<String> actualValue = Optional.of("Hello");

		Optional<String> nullValue2 = Optional.ofNullable(null);
		Optional<String> actualValue2 = Optional.ofNullable("W");

		System.out.println(actualValue.get() + "\n" + actualValue2.get());
		try {
			nullValue.get();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception occured");
		}
		try {
			nullValue2.get();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception occured");
		}
		System.out.println(nullValue.orElse("Bye") + "\n" + nullValue2.orElse("Bye"));

		actualValue.ifPresent(value -> System.out.println(value));
		System.out.println(actualValue2.isPresent());

		System.out.println(nullValue.orElseGet(() -> {
			System.out.println("asd");
			return "default";
		}));

		try {
			nullValue2.orElseThrow(() -> new NullPointerException());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Null Pointer Exception");
		}

		System.out.println(actualValue.map(String::length).get() + "\n"
				+ actualValue2.filter(value -> value.length() > 5).isPresent() + "\n"
				+ actualValue.flatMap(value -> Optional.of(value + " world")).get());

	}

}

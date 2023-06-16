package abstracts;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		AnimalVoice[] animalVoices = {new Cat(),new Dog()};
		for (AnimalVoice animalVoice : animalVoices)
		{
			animalVoice.call();
		}
		List<String> list = List.of("Dog","Cat"); //immutable list
		System.out.println(list);
		
		List<String> listArray = new ArrayList<String>(); //mutable list = array list, linked list, vector
		System.out.println(list.size());
	}

}

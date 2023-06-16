package interfaces;

public class FlightRunner {

	public static void main(String[] args) {
		Flyable[] flyables = {new Birds(), new Aeroplane()};
		
		for (Flyable flyable : flyables)
		{
			flyable.fly();
		}

	}

}

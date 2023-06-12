package java8PracticeInterface;

public class RealGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Go Up");
	}

	@Override
	public void down() {
		System.out.println("Go Down");
	}

	@Override
	public void left() {
		System.out.println("Go Backward");
	}

	@Override
	public void right() {
		System.out.println("Go Forward");
	}

}

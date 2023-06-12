package java8PracticeInterface;

public class DummyGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Down");
	}

	@Override
	public void left() {
		System.out.println("Backward");
	}

	@Override
	public void right() {
		System.out.println("Forward");
	}

}

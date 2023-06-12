package java8PracticeInterface;

public class GameRunner {

	public static void main(String[] args) {
		GamingConsole game = new DummyGame();
		game.up();
		game.down();
		game.right();
		game.left();
		
		GamingConsole game2 = new RealGame();
		game2.up();
		game2.down();
		game2.right();
		game2.left();
	}

}

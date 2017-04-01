package start;

import dev.pietermantel.main.Game;

public class Activator {

	public static void main(String[] args) {
		//System.out.println("activator");
		Game game = new Game(1400,900,"Game!");
		game.start();
	}

}

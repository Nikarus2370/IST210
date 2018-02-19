import java.security.SecureRandom;


public class GameTester {

	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		Game game = new Game();
		boolean i;
		System.out.print("Do you want to play the Guessing Game? [Y|N]");
		do{
			i = game.Play(1 + random.nextInt(1000));
		}while(i);
		System.out.print("Goodbye...");
	}

}

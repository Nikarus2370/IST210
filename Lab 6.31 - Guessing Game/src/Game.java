import java.util.Scanner;

public class Game {
	public boolean Play(int r)
	{
		int random = r;
		int numGuesses = 0;
		Scanner input = new Scanner (System.in);
		int guess;
		
		do{
			char i = input.next().charAt(0);
			if(i == 'y' || i == 'Y')
			{
				break;
			}
			else if (i == 'n' || i == 'N')
			{
				return false;
			}
			else
			{
				System.out.print("Please enter a valid letter [Y|N]:");
			}
		}while(true);
		
		do
		{
			System.out.print("Please enter a guess :");
			guess = input.nextInt();
			numGuesses++;
			if(guess == -1)
			{
				return false;
			}
			if(guess == random && numGuesses <= 10)
			{
				System.out.printf("Congratulations!!! You won the game in %d tries. You did very well.%n", numGuesses);
				break;
			}
			if(guess == random && numGuesses > 10)
			{
				System.out.printf("Congratulations! You won the game in %d tries. You could do better.%n", numGuesses);
				break;
			}
			if(guess > random)
			{
				System.out.printf("%d is too high%n", guess);
			}
			if(guess < random)
			{
				System.out.printf("%d is too low%n", guess);
			}
			
		}while(true);
		
		System.out.print("Would you like to play again? [Y|N]");
		return true;
	}
	
}

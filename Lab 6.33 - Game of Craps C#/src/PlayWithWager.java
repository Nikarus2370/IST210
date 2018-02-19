import java.util.Scanner;

public class PlayWithWager {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Status status;
		double balance = 20000.0;
		Print("Game has started\n");
		Print("Would you like to play a game of Craps? [Y|N]: ");
		do{
			
			do{
				char i = input.next().charAt(0);
				if(i == 'y' || i == 'Y')
				{
					status = Status.PLAY;
					break;
				}
				else if (i == 'n' || i == 'N')
				{
					status = Status.QUIT;
					break;
				}
				else
				{
					Print("Please enter a valid letter [Y|N]:");
				}
			}while(true);
			
			
			
			if(status == Status.PLAY)
			{
				Print("Enter a wager less than your balance, or -1 to quit. Your\n"
						+ "balance is ");
				System.out.printf("$%,.2f", balance);
				Print(" : ");
				do{
					double wager = input.nextDouble();
					if(wager == -1)
					{
						status = Status.QUIT;
						break;
					}
					else if (wager < -1)
					{
						Print("Enter a positive value for your wager, or -1 to quit. Your\n"
								+ "balance is ");
						System.out.printf("$%,.2f", balance);
						Print(" : ");
					}
					else if (wager > balance)
					{
						Print("Enter a wager less than your balance, or -1 to quit. Your\n"
								+ "balance is ");
						System.out.printf("$%,.2f", balance);
						Print(" : ");
					}
					else
					{
						status = Craps.play(args);
						if(status == Status.WON)
						{
							balance += wager;
							Print("Player Wins, balance is ");
							System.out.printf("$%,.2f ...\n\n", balance);
						}
						if(status == Status.LOST)
						{
							balance -= wager;
							Print("Player Loses, balance is ");
							System.out.printf("$%,.2f ...\n\n", balance);
						}
						Print("Would you like to play another game of Craps? [Y|N] : ");
						break;
					}
				}while(true);
			}
			
		}while(status != Status.QUIT);
		System.out.printf("A check of the amount $%,.2f will be mailed to you after taking taxes and misc fees.", balance);
	}
	
	public static void Print(String str)
	{
		System.out.print(str);
	}
	
	public static void PrintLn(String str)
	{
		System.out.println(str);
	}
}




/*
 * Game has started
Would you like to play a game of Craps? [Y|N]: y
Enter a wager less than your balance, or -1 to quit. Your
balance is $20,000.00 : -1000
Enter a positive value for your wager, or -1 to quit. Your
balance is $20,000.00 : 1000
Player rolled 6 + 5 = 11
Player wins
Player Wins, balance is $21,000.00 ...

Would you like to play another game of Craps? [Y|N] : y
Enter a wager less than your balance, or -1 to quit. Your
balance is $21,000.00 : 1000
Player rolled 5 + 1 = 6
Point is 6
Player rolled 1 + 6 = 7
Player loses
Player Loses, balance is $20,000.00 ...

Would you like to play another game of Craps? [Y|N] : n
A check of the amount $20,000.00 will be mailed to you after taking taxes and misc fees.
*/

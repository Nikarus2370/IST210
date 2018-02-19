using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Guessing_Game_C
{
    class GuessingGame
    {
        public Boolean Play(int r)
        {
            int random = r;
            int numGuesses = 0;
            String input;
            int guess;

            do
            {
                input = Console.ReadLine();
                char i = input[0];
                if (i == 'y' || i == 'Y')
                {
                    break;
                }
                else if (i == 'n' || i == 'N')
                {
                    return false;
                }
                else
                {
                    Console.Write("Please enter a valid letter [Y|N]:");
                }
            } while (true);

            do
            {
                Console.Write("Please enter a guess :");
                guess = int.Parse(Console.ReadLine());
                numGuesses++;
                if (guess == -1)
                {
                    return false;
                }
                if (guess == random && numGuesses <= 10)
                {
                    Console.Write($"Congratulations!!! You won the game in {numGuesses} tries. You did very well.\n");
                    break;
                }
                if (guess == random && numGuesses > 10)
                {
                    Console.Write($"Congratulations! You won the game in {numGuesses} tries. You could do better.\n");
                    break;
                }
                if (guess > random)
                {
                    Console.Write($"{guess} is too high\n");
                }
                if (guess < random)
                {
                    Console.Write($"{guess} is too low\n");
                }

            } while (true);

            Console.Write("Would you like to play again? [Y|N]: ");
            return true;
        }
    }
}

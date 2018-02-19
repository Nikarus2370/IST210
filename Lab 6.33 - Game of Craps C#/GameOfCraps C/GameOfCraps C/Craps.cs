using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GameOfCraps_C
{
    public class Craps
    {
        // create secure random number generator for use in method rollDice
        private static Random randomNumbers = new Random();

        // enum type with constants that represent the game status

        // constants that represent common rolls of the dice
        private const int SNAKE_EYES = 2;
        private const int TREY = 3;
        private const int SEVEN = 7;
        private const int YO_LEVEN = 11;
        private const int BOX_CARS = 12;

        // plays one game of craps
        public static Status play(String[] args)
        {
            int myPoint = 0; // point if no win or loss on first roll
            Status gameStatus; // can contain CONTINUE, WON or LOST

            int sumOfDice = rollDice(); // first roll of the dice

            // determine game status and point based on first roll 
            switch (sumOfDice)
            {
                case SEVEN: // win with 7 on first roll
                case YO_LEVEN: // win with 11 on first roll           
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES: // lose with 2 on first roll
                case TREY: // lose with 3 on first roll
                case BOX_CARS: // lose with 12 on first roll
                    gameStatus = Status.LOST;
                    break;
                default: // did not win or lose, so remember point         
                    gameStatus = Status.CONTINUE; // game is not over
                    myPoint = sumOfDice; // remember the point
                    Console.Write($"Point is {myPoint}\n");
                    break;
            }

            // while game is not complete
            while (gameStatus == Status.CONTINUE) // not WON or LOST
            {
                sumOfDice = rollDice(); // roll dice again

                // determine game status
                if (sumOfDice == myPoint) // win by making point
                    gameStatus = Status.WON;
                else
                   if (sumOfDice == SEVEN) // lose by rolling 7 before point
                    gameStatus = Status.LOST;
            }

            // display won or lost message
            if (gameStatus == Status.WON)
            {
                Console.ForegroundColor = ConsoleColor.Green;
                Console.WriteLine("Player wins");
                Console.ForegroundColor = ConsoleColor.Gray;
            }

            else
            {
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine("Player loses");
                Console.ForegroundColor = ConsoleColor.Gray;
            }
            return gameStatus;
        }
        // roll dice, calculate sum and display results
        public static int rollDice()
        {
            // pick random die values
            int die1 = 1 + randomNumbers.Next(6); // first die roll
            int die2 = 1 + randomNumbers.Next(6); // second die roll

            int sum = die1 + die2; // sum of die values

            // display results of this roll
            Console.Write($"Player rolled {die1} + {die2} = {sum}\n");

            return sum;
        } // end class Craps
    }
}

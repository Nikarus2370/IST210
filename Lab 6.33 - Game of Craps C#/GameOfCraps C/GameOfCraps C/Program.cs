using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GameOfCraps_C
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.ForegroundColor = ConsoleColor.Gray;
            String input;
            Status status;
            double balance = 20000.0;
            Print("Game has started\n");
            Print("Would you like to play a game of Craps? [Y|N]: ");
            do
            {
                Console.ForegroundColor = ConsoleColor.Gray;
                do
                {
                    input = Console.ReadLine();
                    char i = input[0];
                    if (i == 'y' || i == 'Y')
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
                } while (true);



                if (status == Status.PLAY)
                {
                    Print("Enter a wager less than your balance, or -1 to quit. Your\n"
                            + "balance is ");
                    Console.Write($"{balance:C}");
                    Print(" : ");
                    do
                    {
                        double wager = Double.Parse(Console.ReadLine());
                        if (wager == -1)
                        {
                            status = Status.QUIT;
                            break;
                        }
                        else if (wager < -1)
                        {
                            Print("Enter a positive value for your wager, or -1 to quit. Your\n"
                                    + "balance is ");
                            Console.Write($"{balance:C}");
                            Print(" : ");
                        }
                        else if (wager > balance)
                        {
                            Print("Enter a wager less than your balance, or -1 to quit. Your\n"
                                    + "balance is ");
                            Console.Write($"{balance:C}");
                            Print(" : ");
                        }
                        else
                        {
                            status = Craps.play(args);
                            if (status == Status.WON)
                            {
                                balance += wager;
                                Console.ForegroundColor = ConsoleColor.Green;
                                Print("Player Wins, balance is ");
                                Console.Write($"{balance:C} ...\n\n");
                                Console.ForegroundColor = ConsoleColor.Gray;
                            }
                            if (status == Status.LOST)
                            {
                                balance -= wager;
                                Console.ForegroundColor = ConsoleColor.Red;
                                Print("Player Loses, balance is ");
                                Console.Write($"{balance:C} ...\n\n");
                                Console.ForegroundColor = ConsoleColor.Gray;
                            }
                            Print("Would you like to play another game of Craps? [Y|N] : ");
                            break;
                        }
                    } while (true);
                }

            } while (status != Status.QUIT);
            Console.WriteLine($"A check of the amount {balance:C} will be mailed to you after taking taxes and misc fees.");
        }

        public static void Print(String str)
        {
            Console.Write(str);
        }

        public static void PrintLn(String str)
        {
            Console.WriteLine(str);
        }
    }
}

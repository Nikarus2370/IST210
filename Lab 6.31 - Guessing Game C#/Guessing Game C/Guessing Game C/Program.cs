using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Guessing_Game_C
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.ForegroundColor = ConsoleColor.Green;
            Random rand = new Random();
            GuessingGame game = new GuessingGame();
            Boolean i;
            Console.Write("Do you want to play the Guessing Game? [Y|N]: ");
            do
            {
                i = game.Play(1 + rand.Next(1000));
            } while (i);
            Console.WriteLine("Goodbye...");
        }

    }
}


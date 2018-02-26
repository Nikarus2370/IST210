using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Simple_Array_Class
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.ForegroundColor = ConsoleColor.Green;
            int[] arr = new int[100];
            arr[0] = 77;            // insert 10 items
            arr[1] = 99;
            arr[2] = 44;
            arr[3] = 55;
            arr[4] = 22;
            arr[5] = 88;
            arr[6] = 11;
            arr[7] = 3;
            arr[8] = 66;
            arr[9] = 33;
            int nElems = 10;            // now 10 items in array

            MyArrayClass arrayObj = new MyArrayClass(arr, nElems);
            Console.Write("\nDisplaying all members of the array\n");
            arrayObj.DisplayAll();

            Console.Write("\nDisplaying element at index 6 of the array\n");
            arrayObj.DisplayAt(6);

            Console.Write("\nFind 55 in the array\n");
            if (arrayObj.Find(55) != -1)
            {
                Console.Write("Number 55 was found at index %d of the array\n", arrayObj.Find(55));
            }
            else
            {
                Console.Write("Number 55 was NOT found.\n");
            }


            Console.Write("\nDelete 55 from the array\n");
            arrayObj.Delete(55);

            Console.Write("\nFind 55 in the array\n");
            if (arrayObj.Find(55) != -1)
            {
                Console.Write("Number 55 was found at index %d of the array\n", arrayObj.Find(55));
            }
            else
            {
                Console.Write("Number 55 was NOT found.\n");
            }

            Console.Write("\nDisplaying all members of the array\n");
            arrayObj.DisplayAll();

            Console.Write("\nSorting the array\n");
            arrayObj.BubbleSort();

            Console.Write("\nDisplaying all members of the array\n");
            arrayObj.DisplayAll();

            Console.Write("\nInsert 49 into the array and then display array\n");
            arrayObj.Insert(49);

            arrayObj.DisplayAll();
        }
    }
}

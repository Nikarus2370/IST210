using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Simple_Array_Class
{
    class MyArrayClass
    {
        //Two fields or instance variables. 
        private int[] arr;
        private int iNumElements;   //# of elements in the array, not the size of the array.

        //Constructor. Initializes both instance variables. Does not
        // create a new array.
        public MyArrayClass(int[] array, int iNumElementsLoc)
        {
            arr = array;
            iNumElements = iNumElementsLoc;
        }

        // Displays the ith element
        public void DisplayAt(int i)
        {
            Console.Write($"Value at index {i} is: {arr[i]}\n");
        }

        // Display all elements in the array that have a value
        public void DisplayAll()
        {
            for (int i = 0; i < iNumElements; i++)
            {
                Console.Write($"{arr[i]} ");
            }
            Console.WriteLine();
        }

        // Key - value to search in the array
        // return value - index where key was found
        public int Find(int key)
        {
            for (int i = 0; i < arr.Length; i++)
            {
                if (key == arr[i])
                {
                    return i;
                }
            }
            return -1;
        }
        // insert an element in the array.
        public void Insert(int n)
        {
            arr[iNumElements] = n;
            iNumElements++;
        }


        // delete 'key' from the array. 
        // which means that you must move up rest of the elements.
        public void Delete(int key)
        {
            int loc = Find(key);
            if (loc > -1)
            {
                for (int i = loc; i < iNumElements; i++)
                {
                    arr[i] = arr[i + 1];
                }
                iNumElements--;
            }
        }


        // sort the array using bubble sort
        public void BubbleSort()
        {
            int outInt, inInt;
            int temp;

            for (outInt = iNumElements - 1; outInt > 0; outInt--) // outer loop (backward)
		{
                for (inInt = 0; inInt < outInt; inInt++) // inner loop (forward)
			{

                    // combined the old "swap" into the "if" loop
                    if (arr[inInt] > arr[inInt + 1])
                    {
                        temp = arr[inInt];
                        arr[inInt] = arr[inInt + 1];
                        arr[inInt + 1] = temp;
                    } // end if
                } // inner for loop
            } // outer for loop
        } // end bubbleSort()
    }
}

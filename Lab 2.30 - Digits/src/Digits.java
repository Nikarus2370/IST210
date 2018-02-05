import java.util.Scanner;


public class Digits {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a five digit integer: ");
		int number = input.nextInt();
		while(number > 100000 || number < 9999)
		{
			System.out.print("Entered number, incorrect number of digits.\n");
			System.out.print("Please enter a five digit integer: ");
			number = input.nextInt();
		}
		
		int first = number / 10000;
		int second = number % 10000 / 1000;
		int third = number % 1000 / 100;
		int fourth = number % 100 / 10;
		int fifth = number % 10;
		
		System.out.print(first + "   " + second + "   " + third + "   " + fourth + "   " + fifth );
	}

}


/*
Enter a five digit integer: 123456
Entered number, incorrect number of digits.
Please enter a five digit integer: 1234
Entered number, incorrect number of digits.
Please enter a five digit integer: 12345
1   2   3   4   5
*/
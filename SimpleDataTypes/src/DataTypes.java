import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		byte myByte = 'P';
		short myShort = 16;
		int myInt = 10;
		long myLong = 64;
		float myFloat = (float) 88133.125;
		double myDouble = 3377.1234567890124;
		char myChar = 'X';
		String myString = "myString";
		boolean myBool = true;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("**** Part1: ****");		
		System.out.printf("Byte = %c\n", myByte);
		System.out.printf("Short = %d\n", myShort);
		System.out.printf("Int = %d\n", myInt);
		System.out.printf("Long = %d\n", myLong);
		System.out.printf("Float = %.6f\n", myFloat);
		System.out.printf("Double = %.15f\n", myDouble);
		System.out.printf("Char = %c\n", myChar);
		System.out.printf("String = %s\n", myString);
		System.out.printf("Boolean = %b\n", myBool);
		if (myBool)
		{
			System.out.printf("Boolean = TRUE");
		}
		else
		{
			System.out.printf("Boolean = FALSE");
		}
		System.out.println("\n");
		System.out.println("**** Part2: ****");
		
		System.out.print("Enter a byte: ");
		myByte = input.nextByte();
		System.out.printf("Byte = %c\n", myByte);
		
		System.out.print("Enter a Short: ");
		myShort = input.nextShort();
		System.out.printf("Short = %d\n", myShort);
		
		System.out.print("Enter an Int: ");
		myInt = input.nextInt();
		System.out.printf("Int = %d\n", myInt);
		
		System.out.print("Enter a Long: ");
		myLong = input.nextLong();
		System.out.printf("Long = %d\n", myLong);
		
		System.out.print("Enter a Float: ");
		myFloat = input.nextFloat();
		System.out.printf("Float = %.6f\n", myFloat);
		
		System.out.print("Enter a Double: ");
		myDouble = input.nextDouble();
		System.out.printf("Double = %.15f\n", myDouble);
		
		System.out.print("Enter a Char: ");
		myChar = input.next().charAt(0);
		System.out.printf("Char = %c\n", myChar);
	
		input.nextLine();
		
		System.out.print("Enter a String: ");
		myString = input.nextLine();
		System.out.printf("String = %s\n", myString);
		
		System.out.print("Enter a Boolean: ");
		myBool = input.nextBoolean();
		System.out.printf("Boolean = %b\n", myBool);
		
		input.close();
	}
}



/*
 * 
 * **** Part1: ****
Byte = P
Short = 16
Int = 10
Long = 64
Float = 88133.125000
Double = 3377.123456789012400
Char = X
String = myString
Boolean = true
Boolean = TRUE

**** Part2: ****
Enter a byte: 86
Byte = V
Enter a Short: 4455
Short = 4455
Enter an Int: 32
Int = 32
Enter a Long: 999999
Long = 999999
Enter a Float: 1234567.123456789
Float = 1234567.125000
Enter a Double: 1234567.123456789
Double = 1234567.123456789000000
Enter a Char: Saleem
Char = S
Enter a String: Yusuf
String = Yusuf
Enter a Boolean: TRUE
Boolean = true

*
*/

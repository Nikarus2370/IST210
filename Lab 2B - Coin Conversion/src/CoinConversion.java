import java.util.Scanner;


public class CoinConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int number = 1;
		int dollars;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		
		while(true){
			number = 0;
			dollars = 0;
			quarters = 0;
			dimes = 0;
			nickels = 0;
			pennies = 0;
			
			
			System.out.print("Please enter pennies: ");
			number = input.nextInt();
			if(number == 0)
			{
				System.out.print("Closing");
				break;
			}
			System.out.println("Original amount: " + number);
			dollars = number / 100;
			if (dollars > 0)
			{
				number = number - dollars * 100;
			}
			quarters = number / 25;
			if(quarters > 0)
			{
				number = number - quarters * 25;
			}
			dimes = number / 10;
			if(dimes > 0)
			{
				number = number - dimes * 10;
			}
			nickels = number / 5;
			if(nickels > 0)
			{
				number = number - nickels * 5;
			}
			pennies = number;
			if(pennies > 0)
			{
				number = number - pennies;
			}
			
			System.out.println("Number of Dollars: " + dollars);
			System.out.println("Number of Quarters: " + quarters);
			System.out.println("Number of Dimes: " + dimes);
			System.out.println("Number of Nickels: " + nickels);
			System.out.println("Number of Pennies: " + pennies);
			System.out.println();
		}
	}

}


/*
Please enter pennies: 141
Original amount: 141
Number of Dollars: 1
Number of Quarters: 1
Number of Dimes: 1
Number of Nickels: 1
Number of Pennies: 1

Please enter pennies: 667
Original amount: 667
Number of Dollars: 6
Number of Quarters: 2
Number of Dimes: 1
Number of Nickels: 1
Number of Pennies: 2

Please enter pennies: 0
Closing
*/
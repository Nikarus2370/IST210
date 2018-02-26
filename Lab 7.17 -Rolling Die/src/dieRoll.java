import java.security.SecureRandom;


public class dieRoll {

	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		int num;
		int[] totals = new int[13];
		for(int i = 0; i < totals.length; i++)
		{
			totals[i] = 0;
		}
		
		for(int i = 0; i < 36000000; i++)
		{
			num = 1 + randomNumbers.nextInt(6) + 1 + randomNumbers.nextInt(6);
			totals[0]++;
			switch(num)
			{
			case 2:
				totals[2]++;
				break;
			case 3:
				totals[3]++;
				break;
			case 4:
				totals[4]++;
				break;
			case 5:
				totals[5]++;
				break;
			case 6:
				totals[6]++;
				break;
			case 7:
				totals[7]++;
				break;
			case 8:
				totals[8]++;
				break;
			case 9:
				totals[9]++;
				break;
			case 10:
				totals[10]++;
				break;
			case 11:
				totals[11]++;
				break;
			case 12:
				totals[12]++;
				break;
			}
		}
		System.out.println("Sum   Frequency  Percentage");
		for(int i = 2; i <= 12; i++)
		{
			System.out.printf(" %2d", i);
			System.out.printf("  %10d", totals[i]);
			System.out.printf("  %10.2f", (double)totals[i] / (double)36000000 * (double)100);
			System.out.println();
		}
	}

}



/*
Sum   Frequency  Percentage
2      999658        2.78
3     1999856        5.56
4     3000539        8.33
5     4000113       11.11
6     5000523       13.89
7     6001509       16.67
8     4998117       13.88
9     3999672       11.11
10     2999108        8.33
11     2001175        5.56
12      999730        2.78

*/
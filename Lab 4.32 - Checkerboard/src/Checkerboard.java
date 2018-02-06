
public class Checkerboard {

	public static void main(String[] args) {
		for(int i = 0 ; i < 8 ; i++)
		{
			if (i % 2 == 0){
				for(int j = 0; j < 8; j++)
				{
					System.out.print('*');
					System.out.print(' ');
				}
			}
			else
			{
				for(int l = 0; l < 8; l++)
				{
					System.out.print(' ');
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
}


/*
* * * * * * * * 
 * * * * * * * *
* * * * * * * * 
 * * * * * * * *
* * * * * * * * 
 * * * * * * * *
* * * * * * * * 
 * * * * * * * *
*/
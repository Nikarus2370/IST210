import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {		
		final int maxSize = 100;
		DataArray arr;
		arr = new DataArray(maxSize);
		arr.populateArray();
		
		Scanner input = new Scanner (System.in);
		int cycle = 1;
		int kbInt;
		String kbString;
		boolean quit = false;
		System.out.printf("%d)", cycle);
		displayMenu();
		do
		{
			try
			{
				kbInt = input.nextInt();
			}
			catch (InputMismatchException e)
			{
				kbInt = 0;
			}
			input.nextLine();
			switch(kbInt)
			{
				case 1:
					Person personFound;
					Print("Please enter a last name: ");
					kbString = input.nextLine();
					personFound = arr.find(kbString);
					if(personFound != null)
					{
						Print("Found ");
						personFound.displayPerson();
					}
					else
					{
						Println("Can't find " + kbString);
					}
					kbContinue();	
					cycle++;
					System.out.printf("%d)", cycle);
					displayMenu();
					break;
				case 2:
					arr.displayAll();
					kbContinue();	
					cycle++;
					System.out.printf("%d)", cycle);
					displayMenu();
					break;
				case 3:
					System.out.printf("There are %d persons in the directory.",arr.getNElems());
					kbContinue();	
					cycle++;
					System.out.printf("%d)", cycle);
					displayMenu();
					break;
				case 4:
					String lastName, firstName;
					int age;
					Print("Insert: Please enter the first name: ");
					firstName = input.nextLine();
					Print("Insert: Please enter the last name: ");
					lastName = input.nextLine();
					Print("Insert: Please enter the age: ");
					age = input.nextInt();
					arr.insert(lastName, firstName, age);
					System.out.printf("Person %s %s %d entered successfully.%n", firstName, lastName, age);
					System.out.printf("Person count is %d", arr.getNElems());
					kbContinue();	
					cycle++;
					System.out.printf("%d)", cycle);
					displayMenu();
					break;
					
				case 5:
					String delName;
					Print("Delete: Please enter the last name: ");
					delName = input.nextLine();
					if(arr.delete(delName))
					{
						System.out.printf("Successfully deleted \"%s\"", delName);
					}
					else
					{
						System.out.printf("Not Found. Could not delete \"%s\"", delName);
					}
					kbContinue();	
					cycle++;
					System.out.printf("%d)", cycle);
					displayMenu();
					break;
				case 6:
					arr.BubbleSort();
					arr.displayAll();
					kbContinue();	
					cycle++;
					System.out.printf("%d)", cycle);
					displayMenu();
					break;
				case 7:
					if(arr.deleteAllPersons())
					{
						Println("All records deleted from the directory");
						System.out.printf("Person count is %d", arr.getNElems());
					}
					else
					{
						Println("No records stored within the directory");
					}
					kbContinue();	
					cycle++;
					System.out.printf("%d)", cycle);
					displayMenu();
					break;
				case 8:
					arr.populateArray();
					arr.displayAll();
					System.out.printf("Person count is %d", arr.getNElems());
					kbContinue();	
					cycle++;
					System.out.printf("%d)", cycle);
					displayMenu();
					break;
				case 9:
					quit = true;
					break;
				default:
					Println("Selection out of range.");
					Println("Enter your selection [1-9]: ");
					break;
			}
		}while(!quit);
		
		Println("\nGoodbye...");
		
		input.close();

	}

	public static void kbContinue()
	{
		Println("\nPress any key to continue");
		try
		{        
			System.in.read();
		}
		catch(Exception e)
		{	
			e.printStackTrace();
		}
	}
	
	public static void displayMenu()
	{
		Println("");
		Println("Person Directory");
		Println("1.\tFind a person by last name");
		Println("2.\tDisplay all persons");
		Println("3.\tDisplay count of persons in the directory");
		Println("4.\tInsert a person");
		Println("5.\tDelete a person");
		Println("6.\tSort persons and update the person directory");
		Println("7.\tDelete all person from the directory");
		Println("8.\tRe-populate the directory");
		Println("9.\tQuit");
		Println("-----------------------");
		Print("Enter your selection [1-9]: ");

	}
	
	public static void Print(String str)
	{
		System.out.print(str);
	}
	public static void Println(String str)
	{
		System.out.println(str);
	}

}

/*1)
Person Directory
1.	Find a person by last name
2.	Display all persons
3.	Display count of persons in the directory
4.	Insert a person
5.	Delete a person
6.	Sort persons and update the person directory
7.	Delete all person from the directory
8.	Re-populate the directory
9.	Quit
-----------------------
Enter your selection [1-9]: 1
Please enter a last name: adams
Found        Henry Adams        Age: 63

Press any key to continue

2)
Person Directory
1.	Find a person by last name
2.	Display all persons
3.	Display count of persons in the directory
4.	Insert a person
5.	Delete a person
6.	Sort persons and update the person directory
7.	Delete all person from the directory
8.	Re-populate the directory
9.	Quit
-----------------------
Enter your selection [1-9]: 1
Please enter a last name: jacob
Can't find jacob

Press any key to continue

3)
Person Directory
1.	Find a person by last name
2.	Display all persons
3.	Display count of persons in the directory
4.	Insert a person
5.	Delete a person
6.	Sort persons and update the person directory
7.	Delete all person from the directory
8.	Re-populate the directory
9.	Quit
-----------------------
Enter your selection [1-9]: 2
  1)        Patty Evans        Age: 24
  2)     Lorraine Smith        Age: 37
  3)          Tom Yee          Age: 43
  4)        Henry Adams        Age: 63
  5)         Sato Hashimoto    Age: 21
  6)        Henry Stimson      Age: 29
  7)         Jose Velasquez    Age: 72
  8)        Henry Lamarque     Age: 54
  9)         Minh Vang         Age: 54
 10)      Lucinda Creswell     Age: 18

Press any key to continue

4)
Person Directory
1.	Find a person by last name
2.	Display all persons
3.	Display count of persons in the directory
4.	Insert a person
5.	Delete a person
6.	Sort persons and update the person directory
7.	Delete all person from the directory
8.	Re-populate the directory
9.	Quit
-----------------------
Enter your selection [1-9]: 3
There are 10 persons in the directory.
Press any key to continue

5)
Person Directory
1.	Find a person by last name
2.	Display all persons
3.	Display count of persons in the directory
4.	Insert a person
5.	Delete a person
6.	Sort persons and update the person directory
7.	Delete all person from the directory
8.	Re-populate the directory
9.	Quit
-----------------------
Enter your selection [1-9]: 4
Insert: Please enter the first name: John
Insert: Please enter the last name: Jacob
Insert: Please enter the age: 32
Person John Jacob 32 entered successfully.
Person count is 11
Press any key to continue

6)
Person Directory
1.	Find a person by last name
2.	Display all persons
3.	Display count of persons in the directory
4.	Insert a person
5.	Delete a person
6.	Sort persons and update the person directory
7.	Delete all person from the directory
8.	Re-populate the directory
9.	Quit
-----------------------
Enter your selection [1-9]: 5
Delete: Please enter the last name: Yee
Successfully deleted "Yee"
Press any key to continue

7)
Person Directory
1.	Find a person by last name
2.	Display all persons
3.	Display count of persons in the directory
4.	Insert a person
5.	Delete a person
6.	Sort persons and update the person directory
7.	Delete all person from the directory
8.	Re-populate the directory
9.	Quit
-----------------------
Enter your selection [1-9]: 5
Delete: Please enter the last name: Richardson
Not Found. Could not delete "Richardson"
Press any key to continue

8)
Person Directory
1.	Find a person by last name
2.	Display all persons
3.	Display count of persons in the directory
4.	Insert a person
5.	Delete a person
6.	Sort persons and update the person directory
7.	Delete all person from the directory
8.	Re-populate the directory
9.	Quit
-----------------------
Enter your selection [1-9]: 6
  1)        Henry Adams        Age: 63
  2)      Lucinda Creswell     Age: 18
  3)        Patty Evans        Age: 24
  4)         Sato Hashimoto    Age: 21
  5)         John Jacob        Age: 32
  6)        Henry Lamarque     Age: 54
  7)     Lorraine Smith        Age: 37
  8)        Henry Stimson      Age: 29
  9)         Minh Vang         Age: 54
 10)         Jose Velasquez    Age: 72

Press any key to continue

9)
Person Directory
1.	Find a person by last name
2.	Display all persons
3.	Display count of persons in the directory
4.	Insert a person
5.	Delete a person
6.	Sort persons and update the person directory
7.	Delete all person from the directory
8.	Re-populate the directory
9.	Quit
-----------------------
Enter your selection [1-9]: 7
All records deleted from the directory
Person count is 0
Press any key to continue

10)
Person Directory
1.	Find a person by last name
2.	Display all persons
3.	Display count of persons in the directory
4.	Insert a person
5.	Delete a person
6.	Sort persons and update the person directory
7.	Delete all person from the directory
8.	Re-populate the directory
9.	Quit
-----------------------
Enter your selection [1-9]: 2
Person directory is empty

Press any key to continue

11)
Person Directory
1.	Find a person by last name
2.	Display all persons
3.	Display count of persons in the directory
4.	Insert a person
5.	Delete a person
6.	Sort persons and update the person directory
7.	Delete all person from the directory
8.	Re-populate the directory
9.	Quit
-----------------------
Enter your selection [1-9]: 8
  1)        Patty Evans        Age: 24
  2)     Lorraine Smith        Age: 37
  3)          Tom Yee          Age: 43
  4)        Henry Adams        Age: 63
  5)         Sato Hashimoto    Age: 21
  6)        Henry Stimson      Age: 29
  7)         Jose Velasquez    Age: 72
  8)        Henry Lamarque     Age: 54
  9)         Minh Vang         Age: 54
 10)      Lucinda Creswell     Age: 18
Person count is 10
Press any key to continue

12)
Person Directory
1.	Find a person by last name
2.	Display all persons
3.	Display count of persons in the directory
4.	Insert a person
5.	Delete a person
6.	Sort persons and update the person directory
7.	Delete all person from the directory
8.	Re-populate the directory
9.	Quit
-----------------------
Enter your selection [1-9]: 9

Goodbye...
*/

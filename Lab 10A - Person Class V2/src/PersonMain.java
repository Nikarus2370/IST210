import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		final int maxSize = 100;
		DataArray arr;
		arr = new DataArray(maxSize);
		
		arr.insert("Evans", "Patty", 24);
		arr.insert("Smith", "Lorraine", 37);
		arr.insert("Yee", "Tom", 43);
		arr.insert("Adams", "Henry", 63);
		arr.insert("Hashimoto", "Sato", 21);
		arr.insert("Stimson", "Henry", 29);
		arr.insert("Velasquez", "Jose", 72);
		arr.insert("Lamarque", "Henry", 54);
		arr.insert("Vang", "Minh", 54);
		arr.insert("Creswell", "Lucinda", 18);
		
		/*Part 1*/
		Println("\n1. Display All");
		arr.displayAll();
		
		
		/*Part 2*/
		Println("\n2a. Find a person 'Stimson'");
		String searchKey = "Stimson";
		Person personFound;
		personFound = arr.find(searchKey);
		if(personFound != null)
		{
			Print("Found ");
			personFound.displayPerson();
		}
		else
		{
			Println("Can't find " + searchKey);
		}
		
		Println("\n2b. Find a person 'Jacobson'");
		searchKey = "Jacobson";
		personFound = null;
		personFound = arr.find(searchKey);
		if(personFound != null)
		{
			Print("Found ");
			personFound.displayPerson();
		}
		else
		{
			Println("Can't find " + searchKey);
		}
		
		
		/*Part 3*/
		Println("\n3. Delete Smith, Yee, and Thompson");
		if(arr.delete("Smith"))
		{
			Println("Successfully deleted \"Smith\"");
		}
		else
		{
			Println("Not Found. Could not delete \"Smith\"");
		}
		
		if(arr.delete("Yee"))
		{
			Println("Successfully deleted \"Yee\"");
		}
		else
		{
			Println("Not Found. Could not delete \"Yee\"");
		}
		
		if(arr.delete("Thompson"))
		{
			Println("Successfully deleted \"Thompson\"");
		}
		else
		{
			Println("Not Found. Could not delete \"Thompson\"");
		}
		

		/*Part 4*/
		Println("\nDisplay all after deleting, Smith, Yee, and Thompson");
		arr.displayAll();
		
		
		/*Part 5*/
		Println("\n4. Insert person John Jacobson, age 32");
		String lastName, firstName;
		int age;
		Print("Insert: Please enter the first name: ");
		firstName = input.nextLine();
		Print("Insert: Please enter the last name: ");
		lastName = input.nextLine();
		Print("Insert: Please enter the age: ");
		age = input.nextInt();
		
		arr.insert(lastName, firstName, age);
		System.out.printf("Person %s %s %d entered successfully.", firstName, lastName, age);
		
		/*Part 5*/
		Println("\n\n5. Sort all persons in the array and then display them");
		arr.BubbleSort();
		arr.displayAll();
		input.close();
		
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

/*
1. Display All
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

2a. Find a person 'Stimson'
Found        Henry Stimson      Age: 29

2b. Find a person 'Jacobson'
Can't find Jacobson

3. Delete Smith, Yee, and Thompson
Successfully deleted "Smith"
Successfully deleted "Yee"
Not Found. Could not delete "Thompson"

Display all after deleting, Smith, Yee, and Thompson
  1)        Patty Evans        Age: 24
  2)        Henry Adams        Age: 63
  3)         Sato Hashimoto    Age: 21
  4)        Henry Stimson      Age: 29
  5)         Jose Velasquez    Age: 72
  6)        Henry Lamarque     Age: 54
  7)         Minh Vang         Age: 54
  8)      Lucinda Creswell     Age: 18

4. Insert person John Jacobson, age 32
Insert: Please enter the first name: John
Insert: Please enter the last name: Jacobson
Insert: Please enter the age: 32
Person John Jacobson 32 entered successfully.

5. Sort all persons in the array and then display them
  1)        Henry Adams        Age: 63
  2)      Lucinda Creswell     Age: 18
  3)        Patty Evans        Age: 24
  4)         Sato Hashimoto    Age: 21
  5)         John Jacobson     Age: 32
  6)        Henry Lamarque     Age: 54
  7)        Henry Stimson      Age: 29
  8)         Minh Vang         Age: 54
  9)         Jose Velasquez    Age: 72
  */

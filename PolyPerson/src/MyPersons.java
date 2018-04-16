
public class MyPersons {

	
	
	public static void greetPeople(Person[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.printf("%s%n", arr[i].getGreeting());
		}
	}
		
		
	public static void main(String[] args) {
		Person[] arr = {
				new Person(),
				new Hawaiian(),
				new Afghan()
				};
		greetPeople(arr);
	}

}

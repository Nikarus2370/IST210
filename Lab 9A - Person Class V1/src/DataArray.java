
public class DataArray {
	private Person[] arr;
	private int nElems;
	
	public DataArray(int size)
	{
		this.nElems = 0;
		this.arr = new Person[size];
	}
	
	public Person find(String searchName) 
	{
		int i;		
		for(i = 0; i < nElems; i++)
		{
			if(arr[i].lastName.equals(searchName))
			{
				break;
			}
		}
		
		if (i == nElems)
		{
			return null;
		}
		else
		{
			return arr[i];
		}
	}
	
	public void insert(String last, String first, int age) 
	{
		arr[nElems] = new Person(last, first, age);
		nElems++;
		return;
	}
	
	public boolean delete(String searchName) 
	{
		int i;		
		for(i = 0; i < nElems; i++)
		{
			if(arr[i].lastName.equals(searchName))
			{
				break;
			}
		}
		
		if (i == nElems)
		{
			return false;
		}
		else
		{
			for(int j = i; j < nElems; j++) 
			{
				arr[j] = arr[j + 1];
			}
			this.nElems--;
			return true;
		}
	}
	
	public void displayAll() 
	{
		for(int i = 0; i < nElems; i++)
		{
			System.out.printf("% 3d) ", i + 1);
			arr[i].displayPerson();
		}
	}
	
}

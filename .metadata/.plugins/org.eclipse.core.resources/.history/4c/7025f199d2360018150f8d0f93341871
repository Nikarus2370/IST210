
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
	
	public Person find(Person otherPerson)
	{
		int i;		
		for(i = 0; i < nElems; i++)
		{
			if(arr[i].equals(otherPerson))
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
	
	public void BubbleSort()
	{
		int outer, inner;
		Person temp;
		
		for(outer = nElems - 1; outer > 0; outer--)
		{
			for(inner = 0; inner < outer; inner++)
			{
				if(arr[inner].compareTo(arr[inner + 1]) > 0)
				{
					temp = arr[inner];
					arr[inner] = arr[inner + 1];
					arr[inner + 1] = temp;
				}
			}
		}
	}
}

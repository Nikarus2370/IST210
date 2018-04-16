
public class DataArray {
	private Person[] arr;
	private int nElems;
	
	public DataArray(int size)
	{
		this.nElems = 0;
		this.arr = new Person[size];
	}
	
	public int getNElems()
	{
		return this.nElems;
	}
	
	public Person find(String searchName) 
	{
		int i;		
		for(i = 0; i < nElems; i++)
		{
			if(arr[i].lastName.toUpperCase().equals(searchName.toUpperCase()))
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
	
	public Person findByIndex(int i)
	{
		if (nElems == 0)
		{
			return null;
		}
		else
		{
			return arr[i];
		}
	}
	
	public Person getPersonByIndex(int index)
	{
		if(index >= 0 && index < nElems)
		{
			return arr[index];
		}
		else
		{
			return null;
		}
	}
	
	public String[] getAllPersons()
	{
		if(nElems > 0)
		{
			String[] str = new String[nElems];
			for(int i = 0; i < nElems; i++)
			{
				str[i] = arr[i].toString();
			}
			return str;
		}
		else
		{
			String[] str = new String[1];
			str[0] = "Person directory is empty";
			return str;
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
			if(arr[i].lastName.toUpperCase().equals(searchName.toUpperCase()))
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
	
	public boolean deleteByIndex(int i)
	{
		if	(nElems == 0)
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
	
	public boolean deleteAllPersons()
	{
		if(nElems > 0)
		{
			for(int i = 0; i < arr.length; i++)
			{
				arr[i] = null;
			}
			nElems = 0;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void displayAll() 
	{
		if(nElems > 0)
		{
			for(int i = 0; i < nElems; i++)
			{
				System.out.printf("% 3d) ", i + 1);
				arr[i].displayPerson();
			}
		}
		else
		{
			System.out.println("Person directory is empty");
		}
	}
	
	public void displayPerson(String searchKey)
	{
		Person temp = find(searchKey);
		if(temp != null)
		{
			temp.displayPerson();
		}
		else
		{
			System.out.printf("Could not find a person in directory with last name %s.%n" , searchKey);
		}
	}
	
	public void populateArray()
	{
		if(nElems == 0)
		{
			this.insert("Evans", "Patty", 24);
			this.insert("Smith", "Lorraine", 37);
			this.insert("Yee", "Tom", 43);
			this.insert("Adams", "Henry", 63);
			this.insert("Hashimoto", "Sato", 21);
			this.insert("Stimson", "Henry", 29);
			this.insert("Velasquez", "Jose", 72);
			this.insert("Lamarque", "Henry", 54);
			this.insert("Vang", "Minh", 54);
			this.insert("Creswell", "Lucinda", 18);
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

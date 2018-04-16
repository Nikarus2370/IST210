
public class Person implements Comparable<Person> {
	public String lastName;
	public String firstName;
	public int age;
	
	public Person(String lastName, String firstName, int age)
	{
		setLastName(lastName);
		setFirstName(firstName);
		setAge(age);
	}
	public Person()
	{
		this( "", "", 0);
	}
	public void displayPerson()
	{
		System.out.printf("%12s %-12s Age: %2d%n", this.firstName, this.lastName, this.age);
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public int getAge()
	{
		return this.age;
	}	
	@Override
	public int compareTo(Person other) {
		if (this.lastName.equals(other.lastName))
		{
			if(this.firstName.equals(other.firstName))
			{
				if(this.age > other.age)
				{
					return 1;
				}
				else if (this.age < other.age)
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
			else
			{
				return this.firstName.compareTo(other.firstName);
			}
		}
		return this.lastName.compareTo(other.lastName);
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		
		if(obj == null || this.getClass() != obj.getClass())
		{
			return false;
		}
		
		Person other = (Person)obj;
		
		if(this.getClass() == other.getClass())
		{
			return true;
		}
		
		if(this.age != other.age)
		{
			return false;
		}
		
		if(this.firstName == null && other.firstName != null)
		{
			return false;
		}
		else if(!firstName.equals(other.firstName))
		{
			return false;
		}
		
		if(this.lastName == null && other.lastName != null)
		{
			return false;
		}
		else if (!lastName.equals(other.lastName))
		{
			return false;
		}
		
		return true;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = result * prime + age;
		result = result * prime + ((firstName == null) ? 0 : firstName.hashCode());
		result = result * prime + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public String toString()
	{
		return String.format("%12s %-12s Age: %3d", firstName, lastName, age);
	}
}


public class HourlyEmployee extends Employee
{
	private double hours;
	private double wage;
	
	HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage)
	{
		super(firstName, lastName, socialSecurityNumber);
		setHours(hours);
		setWage(wage);
	}
	
	public void setHours(double hours)
	{
		if(hours < 0)
		{
			throw new IllegalArgumentException("Hours must be positive");
		}
		else if (hours > 168)
		{
			throw new IllegalArgumentException("Hours must be less than 168");
		}
		else
		{
			this.hours = hours;
		}
	}
	
	public double getHours()
	{
		return hours;
	}
	
	public void setWage(double wage)
	{
		if(wage < 0)
		{
			throw new IllegalArgumentException("Wage must be non-negative");
		}
		else
		{
			this.wage = wage;
		}
	}
	
	public double getWage()
	{
		return this.wage;
	}
	
	public double earnings()
	{
		if(hours > 40)
		{
			double ot = hours - 40;
			return ot * 1.5 * wage + 40 * wage;
		}
		else
		{
			return hours * wage;
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.0f%n%s: %.2f", 
		         "hourly employee", super.getFirstName(), super.getLastName(), 
		         "social security number", super.getSocialSecurityNumber(), 
		         "wage", getWage(), 
		         "hours worked", getHours(),
		         "total earnings", earnings());
	}
}

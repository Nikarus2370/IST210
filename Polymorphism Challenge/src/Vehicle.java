
public class Vehicle {
	
	private String hornSound;
	
	Vehicle()
	{
		this.hornSound = "beep beep";
	}
	
	Vehicle(String hornSound)
	{
		this.hornSound = hornSound;
	}
	
	public String horn()
	{
		return this.hornSound;
	}
}

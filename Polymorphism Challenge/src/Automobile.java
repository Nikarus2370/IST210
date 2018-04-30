
public class Automobile extends Vehicle implements VehicleDoor{
	Automobile()
	{
		super("honk honk");
	}
	
	Automobile(String hornSound)
	{
		super(hornSound);
	}
	
	public String getDoorType()
	{
		return VehicleDoor.DoorType.NORMAL.toString();
	}
	
	public int getDoorCount()
	{
		return 4;
	}
}

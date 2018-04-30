
public class Airplane extends Vehicle implements VehicleDoor{
	Airplane()
	{
		super();
	}
	
	
	public String getDoorType()
	{
		return VehicleDoor.DoorType.GULLWING.toString();
	}
	
	public int getDoorCount()
	{
		return 2;
	}
}


public class Racecar extends Automobile{
	Racecar()
	{
		super("meep meep");
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


public class Driver {

	public static void main(String[] args) {
		Vehicle[] vehicles = 
				{
					new Vehicle(),
					new Automobile(),
					new Motorcycle(),
					new Airplane(),
					new Racecar()
				};
		
		int doorCount = 0;
		
		for(int i = 0; i < vehicles.length; i++)
		{
			System.out.printf("%s goes %s%n", vehicles[i].getClass().toString(), vehicles[i].horn());
						
			if(vehicles[i] instanceof VehicleDoor)
			{
				VehicleDoor obj = (VehicleDoor)vehicles[i];
				System.out.printf("%s has %d %s doors.%n", vehicles[i].getClass(), obj.getDoorCount(), obj.getDoorType());
				doorCount += obj.getDoorCount();
			}
		}
		System.out.printf("These vehicles have %d total doors.",doorCount);
	}
}
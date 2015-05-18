import java.util.HashMap;
import java.util.UUID;

/**
 * Class: TestVehicle

Create a new person (person "a"), then create a new car, assign the owner, give it four doors.
Create a new truck, assign it to person "a", give it two axels.
Create a new person (person "b").
Transfer ownership of the truck from person "a" to person "b"
Create a new motorcycle with no sidecar
Create a HashMap for each of the subclasses you're instantiating, add the instance to the HashMap (K = UUID generated, V = instance generated).
 * @author Thomas Brady
 *
 */

public class TestVehicle {
	

	public static HashMap vehicles = new HashMap<UUID, Vehicle>();
	public static HashMap truck = new HashMap();
	public static HashMap person = new HashMap();
	public static HashMap motorCycle = new HashMap();
	
	
	Person a = new Person("Matt", "Hojonowski");
	// a.Owner; // Not sure why it isn't popping up.

	 Truck trucker = new Truck("Ford-Raptor", "Black", 1000.5, a, 2);
	 
	 
	 Person b = new Person("Thomas", "Brady");
	 //trucker.transferOwnership(b); Not sure why none of my things pop up.
	 
	 MotorCycle triumph = new MotorCycle("road- Master", "Black", 13.5, a, false);
	 
}

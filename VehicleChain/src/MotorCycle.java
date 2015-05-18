
public class MotorCycle extends Vehicle implements VI {
	/**
	Class: MotorCycle, a class that inherits Vehicle
	Attributes: hasSideCar (using boolean datatype)
	Methods: No new methods
	**/
	
	public boolean hasSideCar;
	
	public MotorCycle(String name, String color, double weight, Person Owner, boolean hasSideCar) {
		super(name, color, weight, Owner);
		this.hasSideCar = hasSideCar;
		// TODO Auto-generated constructor stub
	}

	
}

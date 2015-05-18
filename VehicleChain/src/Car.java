
public class Car extends Vehicle implements VI {
/**
 *  Class Car, a class that inherits Vehicle
	Attributes: NumberOfDoors
	Methods: No new methods
 */ 
	public int NumberOfDoors;
	public Car(String name, String color, double weight, Person Owner, int NumberOfDoors) {
		super(name, color, weight, Owner);
		this.NumberOfDoors = NumberOfDoors;
		// TODO Auto-generated constructor stub
	}
	
	
}

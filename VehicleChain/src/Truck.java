
public class Truck extends Vehicle implements VI {

	/**Class: Truck, a class that inherits Vehicle
	Attributes: NumberOfAxels
	Methods: No new methods
	**/
	
	public int NumberOfAxels;
	public Truck(String name, String color, double weight, Person Owner, int NumberOfAxels ) {
		super(name, color, weight, Owner);
		this.NumberOfAxels = NumberOfAxels;
		// TODO Auto-generated constructor stub
	}
	
	
	
}

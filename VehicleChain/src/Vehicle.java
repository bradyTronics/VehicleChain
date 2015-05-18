
public abstract class Vehicle {
	/**
	 * Class Vehicle, an abstract class
	Attributes: Name, Color, Weight, Owner (which is of type Person)
	Methods: transferOwnership(Person newOwner)
	 **/
	public String name;
	public String color;
	public double weight;
	public Person Owner;
	
	public Vehicle(){
		
	}
	
	public Vehicle(String name, String color, double weight, Person Owner){
		this.color = color;
		this.name = name;
		this.weight = weight;
		this.Owner = Owner;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Person getOwner() {
		return Owner;
	}
	public void setOwner(Person owner) {
		Owner = owner;
	}
	
	public Person transferOwnership(Person newOwner){
		this.setOwner(getOwner()); 
		this.Owner = newOwner;
		return Owner;
	}
	
}

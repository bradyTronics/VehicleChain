import java.util.UUID;


public class Person {
 private String firstName;
 private String lastName;
 
 private static UUID PersonID;
 
 /**
  * Class Person
    Attributes: FirstName, LastName, PersonID (should be UUID datatype)
    Methods: normal getter/setters, setter for PersonID should generate new UUID
  */
  public Person(String firstName, String lastName){
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.setPersonID(PersonID);
  }

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public void setPersonID(UUID personID) {
	PersonID = UUID.randomUUID();
}
}

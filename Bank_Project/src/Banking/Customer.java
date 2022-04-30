package Banking;
/**
 * Represents a customer of a bank.
 * @author Arpit
 *
 */
public class Customer {
	
	String name;
	String address;
	//constructor
	public  Customer(String name) {
		//sets instance var name to give name
		this.name =name;
	}
	//methods
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	
}

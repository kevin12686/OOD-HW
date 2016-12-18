
public class Vehicle {

	private String name;
	private int number;
	private Person owner;
	
	public Vehicle(){
		this.name = "N/A";
		this.number = 0;
		this.owner = null;
	}
	
	public Vehicle(String name, int number, Person p){
		this.name = name;
		this.number = number;
		this.owner = p;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getNumber(){
		return this.number;
	}
	
	public void setNumber(int i){
		this.number = i;
	}
	
	public Person getOwner(){
		return this.owner;
	}
	public void setOwner(Person p){
		this.owner = p;
	}
	
	public boolean equals(Object vehicle){
		if(vehicle == null || this.getClass() != vehicle.getClass())	return false;
		Vehicle v = (Vehicle)vehicle;
		return (this.name.equals(v.getName()) && this.number == v.getNumber() && this.owner.equals(v.getOwner()) ? true : false);
	}
	
	public String toString(){
		return ("Manufacturer's Name: " + this.name + ", Number of Cylinders: " + this.number + ", Owner: " + owner.toString());
	}
}

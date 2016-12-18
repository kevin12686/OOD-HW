
public class Truck extends Vehicle{

	private double LoadCapacityTons;
	private int TowingCapacityPounds;
	
	public Truck(){
		super();
		this.LoadCapacityTons = 0;
		this.TowingCapacityPounds = 0;
	}
	
	public Truck(String name, int number, Person owner, double LCT, int TCP){
		super(name, number, owner);
		this.LoadCapacityTons = LCT;
		this.TowingCapacityPounds = TCP;
	}
	
	public double getLoadCapacityTons(){
		return this.LoadCapacityTons;
	}
	
	public void setLoadCapacityTons(double i){
		this.LoadCapacityTons = i;
	}
	
	public int getTowingCapacityPounds(){
		return this.TowingCapacityPounds;
	}
	
	public void setTowingCapacityPounds(int i){
		this.TowingCapacityPounds = i;
	}
	
	@Override
	public String toString(){
		return super.toString() + ", LoadCapacityTons: " + this.LoadCapacityTons + ", TowingCapacityPounds: " + this.TowingCapacityPounds;
	}
	
	@Override
	public boolean equals(Object truck){
		if(truck == null || this.getClass() != truck.getClass())	return false;
		Truck t = (Truck)truck;
		return (super.equals(t) && this.LoadCapacityTons == t.getLoadCapacityTons() && this.TowingCapacityPounds == t.getTowingCapacityPounds() ? true : false);
	}
}

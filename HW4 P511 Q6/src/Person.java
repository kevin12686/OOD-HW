
public class Person {

	private String name;
	
	public Person(){
		this.name = "N/A";
	}
	
	public Person(String theName){
		this.name = theName;
	}
	
	public Person(Person theObject){
		this.name = theObject.getName();
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String theName){
		this.name = theName;
	}
	
	public String toString(){
		return this.name;
	}
	
	public boolean equals(Object other){
		if(other == null || this.getClass() != other.getClass()){
			return false;
		}
		Person p = (Person)other;
		return (this.name == p.getName() ? true : false);
	}
}


public class Temperature {
	
	private float temp;
	private char scale;
	
	public Temperature(){
		this.temp = 0;
		this.scale = 'C';
	}
	
	public Temperature(float temp){
		this.temp = temp;
		this.scale = 'C';
	}
	
	public Temperature(char scale){
		this.temp = 0;
		this.scale = scale;
	}
	
	public Temperature(float temp, char scale){
		this.temp = temp;
		this.scale = scale;
	}
	
	public float getCelsius(){
		return this.scale == 'C' || this.scale == 'c'? this.temp : Temperature.toCelsius(this.temp);
	}
	
	public float getFahrenheit(){
		return this.scale == 'F' || this.scale == 'f' ? this.temp : Temperature.toFahrenheit(this.temp);
	}
	
	public char getScale(){
		return this.scale;
	}
	
	public void setTemp(float temp){
		this.temp = temp;
	}
	
	public void setScale(char scale){
		this.scale = scale;
	}
	
	public boolean equals(Temperature other){
		return this.scale == 'C' || this.scale == 'c' ? this.temp == other.getCelsius() : this.temp == other.getFahrenheit();
	}
	
	public boolean greater(Temperature other){
		return this.scale == 'C' || this.scale == 'c' ? this.temp > other.getCelsius() : this.temp > other.getFahrenheit();
	}
	
	public boolean less(Temperature other){
		return this.scale == 'C' || this.scale == 'c' ? this.temp < other.getCelsius() : this.temp < other.getFahrenheit();
	}
	
	public String toString(){
		return this.scale == 'C' || this.scale == 'c' ? String.format("%7.2f", this.getCelsius()) + " degrees C" : String.format("%7.2f", this.getFahrenheit()) + " degrees F";
	}
	
	public static float toCelsius(float Fahrenheit){
		return (Fahrenheit - 32) * 5 / 9;
	}
	
	public static float toFahrenheit(float Celsius){
		return Celsius * 9 / 5 + 32;
	}
}

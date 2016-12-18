
public class Temperature {
	
	private float temp;
	private char scale;
	
	//倒ぉ﹍箇砞
	public Temperature(){
		this.temp = 0;
		this.scale = 'C';
	}
	
	//砞﹚放倒放癘腹箇砞
	public Temperature(float temp){
		this.temp = temp;
		this.scale = 'C';
	}
	
	//砞﹚放璸腹倒ぉ放箇砞
	public Temperature(char scale){
		this.temp = 0;
		this.scale = scale;
	}
	
	
	//砞﹚放籔放璸腹
	public Temperature(float temp, char scale){
		this.temp = temp;
		this.scale = scale;
	}
	
	//眔尼ん放
	public float getCelsius(){
		return this.scale == 'C' || this.scale == 'c'? this.temp : Temperature.toCelsius(this.temp);
	}
	
	
	//眔地ん放
	public float getFahrenheit(){
		return this.scale == 'F' || this.scale == 'f' ? this.temp : Temperature.toFahrenheit(this.temp);
	}
	
	//眔放璸腹
	public char getScale(){
		return this.scale;
	}
	
	//砞﹚放
	public void setTemp(float temp){
		this.temp = temp;
	}
	
	//砞﹚放璸腹
	public void setScale(char scale){
		this.scale = scale;
	}
	
	//砞﹚放籔放璸腹
	public void set(float temp, char scale){
		this.temp = temp;
		this.scale = scale;
	}
	
	//ゑ耕ㄢン放琌单
	public boolean equals(Temperature other){
		return this.scale == 'C' || this.scale == 'c' ? this.temp == other.getCelsius() : this.temp == other.getFahrenheit();
	}
	
	//ゑ耕ン琌ゑ块ン
	public boolean greater(Temperature other){
		return this.scale == 'C' || this.scale == 'c' ? this.temp > other.getCelsius() : this.temp > other.getFahrenheit();
	}
	
	
	//ゑ耕ン琌掸块ン
	public boolean less(Temperature other){
		return this.scale == 'C' || this.scale == 'c' ? this.temp < other.getCelsius() : this.temp < other.getFahrenheit();
	}
	
	//肚String篈ン戈
	public String toString(){
		return this.scale == 'C' || this.scale == 'c' ? String.format("%7.2f", this.getCelsius()) + " degrees C" : String.format("%7.2f", this.getFahrenheit()) + " degrees F";
	}
	
	//盢地ん放锣Θ尼ん放繰篈よ猭
	public static float toCelsius(float Fahrenheit){
		return (Fahrenheit - 32) * 5 / 9;
	}
	
	//盢尼ん放锣Θ地ん放繰篈よ猭
	public static float toFahrenheit(float Celsius){
		return Celsius * 9 / 5 + 32;
	}
}

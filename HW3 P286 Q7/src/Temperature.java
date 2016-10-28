
public class Temperature {
	
	private float temp;
	private char scale;
	
	//������l�w�]
	public Temperature(){
		this.temp = 0;
		this.scale = 'C';
	}
	
	//�]�w�ūסA������ūװO���w�]��
	public Temperature(float temp){
		this.temp = temp;
		this.scale = 'C';
	}
	
	//�]�w�ū׭p���A�������ū׹w�]��
	public Temperature(char scale){
		this.temp = 0;
		this.scale = scale;
	}
	
	
	//�]�w�ū׻P�ū׭p��
	public Temperature(float temp, char scale){
		this.temp = temp;
		this.scale = scale;
	}
	
	//���o���ū�
	public float getCelsius(){
		return this.scale == 'C' || this.scale == 'c'? this.temp : Temperature.toCelsius(this.temp);
	}
	
	
	//���o�ؤ�ū�
	public float getFahrenheit(){
		return this.scale == 'F' || this.scale == 'f' ? this.temp : Temperature.toFahrenheit(this.temp);
	}
	
	//���o�ū׭p����
	public char getScale(){
		return this.scale;
	}
	
	//�]�w�ū�
	public void setTemp(float temp){
		this.temp = temp;
	}
	
	//�]�w�ū׭p��
	public void setScale(char scale){
		this.scale = scale;
	}
	
	//�]�w�ū׻P�ū׭p��
	public void set(float temp, char scale){
		this.temp = temp;
		this.scale = scale;
	}
	
	//����⪫�󪺷ū׬O�_�۵�
	public boolean equals(Temperature other){
		return this.scale == 'C' || this.scale == 'c' ? this.temp == other.getCelsius() : this.temp == other.getFahrenheit();
	}
	
	//���������O�_���J����j
	public boolean greater(Temperature other){
		return this.scale == 'C' || this.scale == 'c' ? this.temp > other.getCelsius() : this.temp > other.getFahrenheit();
	}
	
	
	//���������O�_����J����p
	public boolean less(Temperature other){
		return this.scale == 'C' || this.scale == 'c' ? this.temp < other.getCelsius() : this.temp < other.getFahrenheit();
	}
	
	//�Ǧ^String���A��������
	public String toString(){
		return this.scale == 'C' || this.scale == 'c' ? String.format("%7.2f", this.getCelsius()) + " degrees C" : String.format("%7.2f", this.getFahrenheit()) + " degrees F";
	}
	
	//�N�ؤ�ū��ন���ūת��R�A��k
	public static float toCelsius(float Fahrenheit){
		return (Fahrenheit - 32) * 5 / 9;
	}
	
	//�N���ū��ন�ؤ�ūת��R�A��k
	public static float toFahrenheit(float Celsius){
		return Celsius * 9 / 5 + 32;
	}
}

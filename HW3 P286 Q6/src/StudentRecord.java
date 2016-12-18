import java.util.Arrays;

public class StudentRecord {
	
	public int[] quizzes = new int[3];
	public int midexam, finexam;
	private float overscore;
	private char finletter;
	public static final int base_quizzes = 10, base_exam = 100;
	public static final float count_quizzes = (float) 25, count_mid = (float) 35, count_final = (float) 40;
	
	//若建立物件時沒有給予數值，則給予預設值
	public StudentRecord(){
		Arrays.fill(this.quizzes, 0);
		this.midexam = 0;
		this.finexam = 0;
		this.overscore = 0;
		this.finletter = 'F';
	}
	
	//建立物件時就將所有資料進行設定
	public StudentRecord(int[] quizzes, int midexam, int finexam){
		this.quizzes = quizzes.clone();
		this.midexam = midexam;
		this.finexam = finexam;
		this.overscore = 0;
		this.finletter = 'F';
	}
	
	//跑完此方法時才會有總成績與級分
	public void excute(){
		for(int i : this.quizzes){
			this.overscore += i * StudentRecord.count_quizzes / StudentRecord.base_quizzes / this.quizzes.length;
		}
		this.overscore += (float)this.midexam * StudentRecord.count_mid / StudentRecord.base_exam;
		this.overscore += (float)this.finexam * StudentRecord.count_final / StudentRecord.base_exam;
		this.finletter = this.overscore >= 90 ? 'A' : this.overscore >= 80 ? 'B' : this.overscore >= 70 ? 'C' : this.overscore >= 60 ? 'D' : 'F';
	}
	
	//獲取總成績
	public float getOverallScore(){
		return this.overscore;
	}
	
	//獲取級分
	public char getFinalLetter(){
		return this.finletter;
	}
	
	//比較兩物件是否相等
	public boolean equals(StudentRecord other){
		return this.overscore == other.getOverallScore() && this.finletter == other.getFinalLetter();
	}
	
	//以String型別輸出成績資訊
	public String toString(){
		return "Overall Numeric Score : " + String.format("%5.2f", this.overscore) + ", Final Letter Grade : " + this.finletter;
	}
}

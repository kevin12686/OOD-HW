import java.util.Arrays;

public class StudentRecord {
	
	public int[] quizzes = new int[3];
	public int midexam, finexam;
	private float overscore;
	private char finletter;
	private static final int base_quizzes = 10, base_exam = 100;
	private static final float count_quizzes = (float) 25, count_mid = (float) 35, count_final = (float) 40;
	
	public StudentRecord(){
		Arrays.fill(this.quizzes, 0);
		this.midexam = 0;
		this.finexam = 0;
		this.overscore = 0;
		this.finletter = 'F';
	}
	
	public StudentRecord(int[] quizzes, int midexam, int finexam){
		this.quizzes = quizzes.clone();
		this.midexam = midexam;
		this.finexam = finexam;
		this.overscore = 0;
		this.finletter = 'F';
	}
	
	public void excute(){
		for(int i : this.quizzes){
			this.overscore += i * StudentRecord.count_quizzes / StudentRecord.base_quizzes / this.quizzes.length;
		}
		this.overscore += (float)this.midexam * StudentRecord.count_mid / StudentRecord.base_exam;
		this.overscore += (float)this.finexam * StudentRecord.count_final / StudentRecord.base_exam;
		this.finletter = this.overscore >= 90 ? 'A' : this.overscore >= 80 ? 'B' : this.overscore >= 70 ? 'C' : this.overscore >= 60 ? 'D' : 'F';
	}
	
	public float getOverallScore(){
		return this.overscore;
	}
	
	public char getFinalLetter(){
		return this.finletter;
	}
	
	public boolean equals(StudentRecord other){
		return this.overscore == other.getOverallScore() && this.finletter == other.getFinalLetter();
	}
	
	public String toString(){
		return "Overall Numeric Score : " + String.format("%5.2f", this.overscore) + ", Final Letter Grade : " + this.finletter;
	}
}

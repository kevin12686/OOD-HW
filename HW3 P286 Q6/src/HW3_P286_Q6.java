import java.util.Scanner;

public class HW3_P286_Q6 {
	public static void main(String Arge[]){
		//建立物件時就給初始值
		StudentRecord S1 = new StudentRecord(new int[]{4, 6, 7}, 72, 85);
		
		//執行完此方法才會有總成績與級分
		S1.excute();
		
		//輸出成績資訊
		System.out.println(S1);		
		System.out.println();
		
		//建立物件時不給予初始值便使用預設值
		StudentRecord S2 = new StudentRecord();
		
		//給予使用者自行輸入成績，並對物件進行設定
		Scanner scan = new Scanner(System.in);
		int[] q = new int[3];
		for(int i = 0; i < 3; i++){
			System.out.print("Please key in " + (i + 1) + "th quizze : ");
			q[i] = scan.nextInt();
		}
		S2.quizzes = q.clone();
		System.out.print("Please key in midterm exam : ");
		S2.midexam = scan.nextInt();
		System.out.print("Please key in fianl exam : ");
		S2.finexam = scan.nextInt();
		
		//執行完此方法才會有總成績與級分
		S2.excute();
		
		//輸出成績資訊
		System.out.println(S2);
		System.out.println();
		
		//比較兩物件總成績與級分是否相等並輸出結果
		System.out.println("S1 is equal to S2 ? " + S1.equals(S2));
		
		scan.close();
	}
}

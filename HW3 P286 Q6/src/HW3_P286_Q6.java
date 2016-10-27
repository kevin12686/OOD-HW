import java.util.Scanner;

public class HW3_P286_Q6 {
	public static void main(String Arge[]){
		StudentRecord S1 = new StudentRecord(new int[]{4, 6, 7}, 72, 85);
		S1.excute();
		System.out.println(S1);
		System.out.println();
		
		StudentRecord S2 = new StudentRecord();
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
		S2.excute();
		System.out.println(S2);
		scan.close();
	}
}

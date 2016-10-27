import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	public static final int TIMES = 3;
	
	public static void main(String Arge[]){
		
		Scanner scan;
		DecimalFormat format = new DecimalFormat("##.00%");
		String[] name = new String[TIMES];
		int[] score = new int[TIMES];
		int[] total = new int[TIMES];
		int Tscore = 0, Ttotal = 0;
		
		for(int i = 1; i <= TIMES; i++){
			System.out.println("Name of exercise " + i + " : ");
			scan = new Scanner(System.in);
			name[i - 1] = scan.nextLine();
			System.out.println("Score received of exercise " + i + " : ");
			scan = new Scanner(System.in);
			score[i - 1] = scan.nextInt();
			Tscore += score[i - 1];
			System.out.println("Total points possible for exercise " + i + " : ");
			scan = new Scanner(System.in);
			total[i - 1] = scan.nextInt();
			Ttotal += total[i - 1];
			System.out.println();
		}
		
		System.out.println(String.format("%-30s%-10s%s", "Exercise", "Score", "Total Possible"));
		
		for(int i = 0; i < TIMES; i++){
			System.out.println(String.format("%-30s%-10d%d", name[i], score[i], total[i]));
		}
		System.out.println(String.format("%-30s%-10d%d", "Total", Tscore, Ttotal));
		System.out.println("Your total is " + Tscore + " out of " + Ttotal + ", or " + format.format((float)Tscore / Ttotal) + ".");
		
	}
}

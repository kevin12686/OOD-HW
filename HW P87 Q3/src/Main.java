import java.util.Scanner;

public class Main {
	public static void main(String Arge[]){
		String first, last, NString;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please key in your first name : ");
		first = scanner.nextLine();
		System.out.print("Please key in your last name : ");
		last = scanner.nextLine();
		
		NString = Q3(first, last);
		System.out.println(NString);
		
		scanner.close();
	}
	
	public static String Q3(String input_A, String input_B){
		input_A = input_A.substring(1, 2).toUpperCase() + input_A.substring(2) + input_A.charAt(0) + "ay";
		input_B = input_B.substring(1, 2).toUpperCase() + input_B.substring(2) + input_B.charAt(0) + "ay";
		return input_A + " " + input_B;
	}
}

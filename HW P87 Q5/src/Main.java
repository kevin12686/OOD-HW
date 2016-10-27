import java.util.Scanner;

public class Main {
	
	public static final String HATE = "hate";
	public static final String LOVE = "love";
	
	public static void main(String Arge[]){
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.print("Enter a line of text : ");
		input = scanner.nextLine();
		
		System.out.println("I have rephrased that line to read :");
		System.out.println(input.replaceFirst(HATE, LOVE));
		
		scanner.close();
	}
}

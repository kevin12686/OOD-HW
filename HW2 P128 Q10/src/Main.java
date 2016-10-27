import java.util.Scanner;

public class Main {
	
	public static final int TIMES = 3;
	
	public static void main(String Arge[]){
		float sum = 0, tax = 0;
		float[] price = new float[TIMES];
		String[] name = new String[TIMES];
		int[] quantity = new int[TIMES];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1; i <= TIMES; i++){
			System.out.println("Input name of item " + i + " :");
			name[i - 1] = scan.nextLine();
			scan = new Scanner(System.in);
			
			System.out.println("Input quanlity of item " + i + " :");
			quantity[i - 1] = scan.nextInt();
			scan = new Scanner(System.in);
			
			System.out.println("Input price of item " + i + " :");
			price[i - 1] = scan.nextFloat();
			scan = new Scanner(System.in);
			
			sum += price[i - 1] * quantity[i - 1];
			System.out.println();
		}
		System.out.println("Your bill :\r\n");
		System.out.println(String.format("%-30s%-10s%-10s%-10s", "Item", "Quantity", "Price", "Total"));
		for(int i = 0; i < TIMES; i++){
			System.out.println(String.format("%-30s%-10d%-10.2f%-10.2f", name[i], quantity[i], price[i], quantity[i] * price[i]));
		}
		System.out.println(String.format("%-50s%-10.2f", "Subtotal", sum));
		System.out.println(String.format("%-51s%-10.2f", "6.25% sales tax", tax = (float)(sum * 0.0625)));
		System.out.println(String.format("%-50s%-10.2f", "Total", sum + tax));
		scan.close();
	}
}

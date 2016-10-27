
public class HW3_P286_Q7 {
	public static void main(String Arge[]){
		Temperature t1 = new Temperature();
		Temperature t2 = new Temperature(32);
		Temperature t3 = new Temperature('F');
		Temperature t4 = new Temperature(0, 'C');
		Temperature t5 = new Temperature(212, 'F');
		Temperature t6 = new Temperature(-40, 'C');
		t1.setTemp(100);
		t1.setScale('C');
		t2.setScale('F');
		t3.setTemp(-40);
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
		System.out.println("t4 : " + t4);
		System.out.println("t5 : " + t5);
		System.out.println("t6 : " + t6);
		System.out.println();
		System.out.println("t1 == t5 : " + t1.equals(t5));
		System.out.println("t3 == t6 : " + t3.equals(t6));
		System.out.println("t4 == t2 : " + t4.equals(t2));
		System.out.println();
		System.out.println("t1 > t2 : " + t1.greater(t2));
		System.out.println("t4 > t2 : " + t4.greater(t2));
		System.out.println("t3 < t2 : " + t3.less(t2));
		System.out.println("t2 < t4 : " + t2.less(t4));
	}
}


public class HW4_P511_Q6 {

	public static void main(String[] Args) {
		Truck t1 = new Truck("T1", 1, new Person("1"), 1, 1);
		Truck t2 = new Truck("T2", 2, new Person("2"), 2, 2);
		Truck t3 = new Truck("T1", 1, new Person("1"), 1, 1);
		t3.setOwner(t1.getOwner());
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println("t1 == t2 ?" + t1.equals(t2));
		System.out.println("t1 == t3 ?" + t1.equals(t3));
	}

}

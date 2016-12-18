import alien.*;

public class HW4_P509_Q3 {
	
	public static void main(String Arge[]){
		Alien a1 = new MARSHMALLOW_MAN_ALIEN(100, "a1");
		Alien a2 = new OGRE_ALIEN(80, "a2");
		Alien a3 = new OGRE_ALIEN(150, "a3");
		AlienPack ap = new AlienPack(3);
		ap.addAlien(a1, 0);
		ap.addAlien(a2, 1);
		ap.addAlien(a3, 2);
		System.out.println("Total Damage: " + ap.calculateDamage());
	}
}

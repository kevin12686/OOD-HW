package alien;

public class MARSHMALLOW_MAN_ALIEN extends Alien{

	private int damage = 10;
	
	public MARSHMALLOW_MAN_ALIEN(int health, String name){
		super(2, health, name);
	}
	
	public int getDamage(){
		return this.damage;
	}
}

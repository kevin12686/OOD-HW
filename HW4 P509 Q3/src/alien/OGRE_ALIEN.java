package alien;

public class OGRE_ALIEN extends Alien{

	private int damage = 10;
	
	public OGRE_ALIEN(int health, String name){
		super(1, health, name);
	}
	
	public int getDamage(){
		return this.damage;
	}
}

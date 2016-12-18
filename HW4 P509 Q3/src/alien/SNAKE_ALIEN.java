package alien;

public class SNAKE_ALIEN extends Alien{

	private int damage = 10;
	
	public SNAKE_ALIEN(int health, String name){
		super(0, health, name);
	}
	
	public int getDamage(){
		return this.damage;
	}
}

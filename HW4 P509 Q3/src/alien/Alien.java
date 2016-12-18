package alien;

public class Alien {

	protected static final int SNAKE_ALIEN = 0;
	protected static final int OGRE_ALIEN = 1;
	protected static final int MARSHMALLOW_MAN_ALIEN = 2;
	
	protected int type, health;
	protected String name;
	
	public Alien(int type, int health, String name){
		this.type = type;
		this.health = health;
		this.name = name;
	}
	
}

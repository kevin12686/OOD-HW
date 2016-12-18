package alien;

public class AlienPack {

private Alien[] aliens;
	
	public AlienPack(int numAliens){
		this.aliens = new Alien[numAliens];
	}
	
	public void addAlien(Alien newAlien, int index){
		aliens[index] = newAlien;
	}
	
	public Alien[] getAliens(){
		return this.aliens;
	}
	
	public int calculateDamage(){
		int damage = 0;
		for(int i = 0; i < aliens.length; i++){
			if(aliens[i].type == Alien.SNAKE_ALIEN){
				SNAKE_ALIEN a = (SNAKE_ALIEN)aliens[i];
				damage += a.getDamage();
			}
			else if(aliens[i].type == Alien.OGRE_ALIEN){
				OGRE_ALIEN a = (OGRE_ALIEN)aliens[i];
				damage += a.getDamage();
			}
			else if(aliens[i].type == Alien.MARSHMALLOW_MAN_ALIEN){
				MARSHMALLOW_MAN_ALIEN a = (MARSHMALLOW_MAN_ALIEN)aliens[i];
				damage += a.getDamage();
			}
		}
		return damage;
	}
}

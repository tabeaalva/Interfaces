
public class Character {
	private String name;
	private int hp; // health
	private int ap; // attack
	private int maxHp;
	
	public Character(String name, int hp, int ap) {
		this.name = name;
		this.hp = hp;
		this.maxHp = hp;
		this.ap = ap;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	private void setHp(int hp) {
		if(hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}
	
	public void heal() {
		this.hp = this.maxHp;
	}
	public void attack(Character enemy) {
		int hit = (int) (this.ap * Math.random());
		enemy.setHp(enemy.getHp() - hit);
		
		System.out.println(this.name + " hit " + enemy.name + " with " + hit);
		this.log(this);
		this.log(enemy);
	}
	
	private void log(Character character) {
		System.out.println(character.getName() +": " + "hp=" + character.getHp());
	}
}

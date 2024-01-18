package package07_OrientacaoObjeto2.challenge.entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.attack = damage;
		this.armor = armor;
	}

	public void takeDamange(int attack) {
		if (attack > 0 && attack < armor) {
			attack -= 1;
			life -= 1;
		} else {
			attack -= armor;
			life -= attack;
			if (life < 0) {
				life = 0;
			}
		}
	}

	public String status() {
		String status = "";
		if (life == 0) {
			status = " (morreu!)";
		}
		return getName() + ": " + getLife() + " de vida" + status;
	}

	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}
	
}

package Pokemon;

public class Pokemon {
int level;
int hp;
String name;
boolean poisoned;

	public Pokemon(String name, int level) {
	this.name = name;
	this.level = level;
	hp = 100;
	poisoned=false;
	}
	public void iChooseYou() {
		System.out.println("name");
		System.out.println("name");
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}

	public void setPoisoned(boolean poisoned) {
		this.poisoned = poisoned;
	}
	public void lapse() {
		if(this.poisoned==true) {
			this.hp -= 15;
		}
	}
	public void attack(Pokemon target, Attack attack){
		 if(Math.random() < .9){
		 attack.attack(target);
		 System.out.println("The attack hit");
		 }else{
		 System.out.println("The attack missed");
		 }
		 }
	public void levelUp(Effect e) {
		
	}
}

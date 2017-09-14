package main;

public class CharacterB implements Dueler {
	private int hp;
	
	public CharacterB() {
		
	}
	
	public String getName() {
		return "Character B";
	}
	
	public void taunt() {
		System.out.println("bad");
	}
	
	public void setHp() {
		this.hp = 100;
	}
	
	public int getHp() {
		return hp;
	}
}

//Carson Custodio

package main;

public class CharacterB implements Dueler {
	private int hp;
	private String "Character B";
	
	public void CharacterB() {
	
		public String getName() {
			return "Character B";
		}
		
		public void taunt() {
			System.out.println("You are bad");
		}
		
		public void setHp() {
			this.hp = 100;
		}
		
		public int getHp() {
			return hp;
		}
		
		public boolean determineIfOpponentIsFair(Dueler d, int hp);{
			if (this.hp == hp) {
				return true;
			}
			return false;
		}
		
		public int getAction(Object caller) {
			
		}
		
		public void hit (Object caller) {
			
		}
	}
}

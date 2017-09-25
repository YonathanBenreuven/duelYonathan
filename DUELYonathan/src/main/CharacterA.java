package duel;

public class CharacterA implements Dueler {
	private int hp;
	
	


	@Override
	public void taunt() {
		if (Math.random() < .5) {
		System.out.println("you suck");	
		} 
		else {
		System.out.println("you bad");
		}
		
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return("sample");
	}


	@Override
	public void setStartingHP(int hp) {
		this.hp = hp;
	}


	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return this.hp;
	}


	@Override
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if (d.getHP() == 100) {
			return true;
		}
		else {
			return false;
		}
	}


	@Override
	public int getAction(Object caller) {
		// TODO Auto-generated method stub
		if (caller instanceof TheDuel){
			return (int) (Math.round(Math.random()*3));
		}
		else {
			return 3;
		}
	}

	@Override
	public void hit(Object caller) {
		// TODO Auto-generated method stub
		if (caller.getClass() == TheDuel.class) {
			this.hp -= 10;
		}
	}



}
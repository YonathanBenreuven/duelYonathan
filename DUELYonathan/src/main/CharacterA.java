package main;

public class CharacterA implements Dueler {

	private String name;
	public int hp1;
	private boolean ifLoaded = false;

	public CharacterA(){

	}

	public void taunt() {
		String taunt = ("prepare to lose");
		System.out.println(taunt);
	}

	public String getName() {
		name = "Yonathan";
		return name;
	}

	public void setStartingHP(int hp) {
		System.out.println(hp);
		hp = 100;
		hp1 = hp;
	}

	public int getHP(){
		return hp1;
	}

	public boolean determineIfOpponentIsFair(Dueler d, int hp){		
		if(d.getHP()!=hp){
			return false;
		}
		else{
			return true;
		}		
	}

	public int getAction(Object caller) {			
		if(ifLoaded == false) {
			ifLoaded = true;
			return 0;
		}else {
			int randNumber = (int)Math.floor(Math.random()*2+1);			
			if (randNumber == 1) {
				ifLoaded = false;
				return 1;
			}else {		
				return 2;
			}
		}
	}

	public void hit(Object caller){
		hp1=hp1-10;
	}	
}
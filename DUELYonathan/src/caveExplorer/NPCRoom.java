package caveExplorer;

public class NPCRoom extends CaveRoom {
	private NPC presentNPC;
	public NPCRoom(String description) {
		super(description);
		presentNPC = null;
	}
	public boolean canEnter() {
		return presentNPC == null;

	}
	public void enterNPC(NPC m) {
		presentNPC = m;
	}
	public void leaveNPC() {
		presentNPC = null;
	}
	// for convince only
	public boolean containsNPC() {
		return presentNPC != null;
	}
	
	// the above methods are new  features to a caveRoom,
	// the methods b elow replace CaveRoom methods (override)
	
	public String validKeys() {
		return "wdsae";
	}
	// override to print a custom string describing what keys do
		public void printAllowedEntry() {
			System.out.println("you can only enter w a s or d or you can type e to interact");
		}
		public void preformAction(int direction) {
			if(direction == 4) {
			if(containsNPC() && presentNPC.isActive()) {
				presentNPC.interact();
			}else {
				CaveExplorer.print("there is nothing to interact with");
			}
			}else {
			System.out.println("That key does nothing");
			}
		}
		public String getContents() {
			if(containsNPC() && presentNPC.isActive()) {
				return "M";
			}else {
				//return what would be returned otherwise
				return super.getContents();
			}
		}
		public String getDescription() {
			if(containsNPC() && !presentNPC.isActive()) {
				return super.getDescription() + "\n"+ presentNPC.getInactiveDescription();
			}else {
				return super.getDescription() + "\n"+presentNPC.getActiveDescription();
			}
		}
}

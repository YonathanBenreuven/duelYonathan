package caveExplorer;

public class NPC {
	//fields relating to navigation
	private CaveRoom[][] floor; //where the npc can go
	private int currentRow;
	private int currentCol;
	private NPCRoom currentRoom;
	//fields relating to character
	private boolean active;
	private String activeDescription;
	private String inactiveDescription;
	
	//default constructor
	public NPC(){
		this.floor = CaveExplorer.caves;
		this.activeDescription = "There is a person watiingin to talk to you";
		this.inactiveDescription = "ther person you spoke to earlier is standing here";
		// to indicate the npc doesnt have a position yet user coordinates -1, -1
		this.currentCol = -1;
		this.currentRow = -1;
		this.currentRoom = null;
		this.active = true;
	}
	/*
	 * you can make custom constructors later that use diffecnt parameters
	 * for example
	 * public NPC(String description, String inactiveDescription)
	 */

	public boolean isActive() {
		return active;
	}
	
	public void setposition(int row, int col) {
		if(row>=0&& row< floor.length && col>= 0 && col < floor[row].length
				&& floor[row][col] instanceof NPCRoom) {
			//remove the npc from current room
			if(currentRoom != null) {
				currentRoom.leaveNPC();
			}
			currentRow = row;
			currentCol = col;
			currentRoom = (NPCRoom)floor[row][col];
			currentRoom.enterNPC(this);
		}
	}

	public void interact() {
		CaveExplorer.print("Hi! im an npc i say nothing at all until you 'bye'");
		String s = CaveExplorer.in.nextLine();
		while(!s.equalsIgnoreCase("bye")) {
			CaveExplorer.print("...");
			s= CaveExplorer.in.nextLine();
		}
		CaveExplorer.print("well that was fun later");
		active = false;
		
	}

	public String getInactiveDescription() {
		
		return inactiveDescription;
	}
 
	public String getActiveDescription() {
		return activeDescription;
	}

	public void act() {
		if(active) {
			int[] move = calculateMovement();
			int newRow = currentRow + move[0];
			int newCol = currentCol + move[1];
			setposition(newRow,newCol);
		}
		
	}

	public int[] calculateMovement() {
		int[] moves = new int[2];
		int[][] possibleMoves = {{-1,0},{0,1},{1,0},{0,-1}};
		int rand = (int)(Math.random()*4);
		moves[0] = possibleMoves[rand][0]+currentRow;
		moves[1] = possibleMoves[rand][1]+currentCol;
		//while() {}
		return null;
	}
}

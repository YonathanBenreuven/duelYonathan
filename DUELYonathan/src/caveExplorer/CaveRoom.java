package caveExplorer;

public class CaveRoom {

	private String description; // tells wh at the room looks like
	private String directions; //tells what you can do
	private String contents; // a symbol representing whats in the room
	private String defaultContents;
	private CaveRoom[] borderingRooms;
	// the rooms are organized by directions null signifies no room or door in the direction
	private Door[] doors;
	// all rooms will have four adjecnt room unless they are in a wall or corner
	//constants
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH =2;
	public static final int WEST = 3;
	public String getDescription() {
		return description + "\n"+directions;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setDefaultContents(String defaultContents) {
		this.defaultContents = defaultContents;
	}
	public CaveRoom(String description) {
		this.description = description;
		setDefaultContents(" ");
		contents = defaultContents;
		//differnce between defaultcontents and contents is "contents becomes an 'x' when your inside the room
		// insde this room when you leave it goes back to default
		
		// note by default arrays will populate with null meaning there are no connections
		borderingRooms = new  CaveRoom[4];
		doors = new Door[4];
		setDirections();
	}
	/*
	 * for every door  in doors[] appends a String to "directions" describing the access
	 * for example:
	 * "there is a door to the north south"
	 * 
	 * if there are no doors at all directions should say:
	 * "there are no door you are trapped in here"
	 */
	private void setDirections() {
		directions="";
		boolean doorFound = false;
		
		for(int i = 0;i<doors.length;i++) {
			if(doors[i]!= null) {
				doorFound = true;
				directions += "\n   Theres is a "+doors[i].getDescription() + " to " +
				toDirection(i)+". "+doors[i].getDetails();
			}
		}
		if(!doorFound) {
			directions += "there is no way out";
		}
		
	}
	/*
	 * converts an int to a direction
	 * toDirection(0) -> "the north"
	 * etc 
	 */
	public static String toDirection(int dir) {
		String[] arr = {"the north","the east","the south"	,"the west"};
		return arr[dir];
	}
	public void enter() {
		contents = "X";
	}
	public void leave() {
		contents = defaultContents;
	}
	/*
	 * gives this room acces to anotherRoom and vice versa
	 * and sets a door between them updating the directions
	 */
	public void setConnection(int direction, CaveRoom anotherRoom, Door door) {
		addRoom(direction,anotherRoom,door);
		anotherRoom.addRoom(oppositeDirection(direction), this, door);
	}
	public static int oppositeDirection(int direction) {
		
		return (direction+2)%4;
	}
	public void addRoom(int direction, CaveRoom cave, Door door) {
		
		borderingRooms[direction] = cave;
		doors[direction] = door;
		setDirections();
	}
	public void interpretInput(String input) {
		while(!isValid(input)) {
			printAllowedEntry();
			input = CaveExplorer.in.nextLine();
		}
		/*
		 * task convert user input into a direction
		 * do not use an if statement
		 * (or if you must dont use more than 1)
		 */
		String dirs = validKeys();
		
		respondToKey(dirs.indexOf(input));
	}
	// override to ad more keys, but always include 'wdsa'
	public String validKeys() {
		return "wdsa";
	}
	// override to print a custom string describing what keys do
	public void printAllowedEntry() {
		System.out.println("you can only enter w a s or d");
	}
	private boolean isValid(String input) {
		String validEntries = validKeys();
		//System.out.println("checking for input "+input+", got index"+validEntries.indexOf(input));
		return validEntries.indexOf(input)> -1 && input.length() ==1;
	}
	private void respondToKey(int direction) {
	// first protect  against nulll pointer exception
		//user cannot go through non existent door
		if(direction < 4) {
		if(borderingRooms[direction] != null && doors[direction] != null) {
			CaveExplorer.currentRoom.leave();
			CaveExplorer.currentRoom = borderingRooms[direction];
			CaveExplorer.currentRoom.enter();
			CaveExplorer.inventory.updateMap();
		}
	}else {
		preformAction(direction);
		}
	}
	//override to give response to keys other then wdsa
	public void preformAction(int direction) {
		
		System.out.println("That key does nothing");
		
	}
	/*
	 * this will be where your group sets up all the caves and all the connections
	 */
	public static void setUpCaves() {
		// all of this code can be changed
		// decide how big your caves should be
		CaveExplorer.caves = new NPCRoom[5][5];
		//populate with caves and a default description when starting use coordinates for debugging
		for(int row =0;row<CaveExplorer.caves.length;row++) {
			// note the differnce in length
			for(int col =0; col< CaveExplorer.caves[row].length;col++) {
				//create a default cave
				CaveExplorer.caves[row][col] = new NPCRoom("This cave has coords ("+row+","+col+")");
			}
		}
		//3 replace default rooms with custom rooms
		CaveExplorer.npcs = new  NPC[1];
		CaveExplorer.npcs[0] = new  NPC();
		CaveExplorer.npcs[0].setposition(1, 1);
		// 4 set your starting room
		CaveExplorer.currentRoom = CaveExplorer.caves[0][1];
		CaveExplorer.currentRoom.enter();
		//5. set up doors
		CaveRoom[][]c = CaveExplorer.caves;
		c[0][1].setConnection(SOUTH, c[1][1], new Door());
	}
	public Door getDoor(int direction) {
		// TODO Auto-generated method stub
		return doors[direction];
	}
}

package caveExplorer;

public class CaveRoom {

	private String description; // tells what the room looks like
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
		return description;
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
}

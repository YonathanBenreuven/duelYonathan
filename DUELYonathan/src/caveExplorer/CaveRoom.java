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
	public CaveRoom() {
		// TODO Auto-generated constructor stub
	}

}

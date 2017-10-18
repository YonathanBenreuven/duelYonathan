package arrays;

public class borough {
	public static final borough[] NY_BOUROUGHS = {new borough("Brooklyn"), new borough("bronx")};
	private String name;
	public borough(String name) {
	this.name = name;	
	}
	public String toString() {
		return name;
	}
}

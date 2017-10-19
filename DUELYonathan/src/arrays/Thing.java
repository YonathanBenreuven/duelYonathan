package arrays;

public class Thing {
	private String description;
	public Thing(String description) {
		this.description = description;
	}
	public String thing() {
		return "I am just a " +description + " an inanimate object what do you expect me to say";
	}
	public String toString() {
		return description;
	}
}

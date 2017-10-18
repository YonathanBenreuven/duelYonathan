package arrays;

public class persons {
	
	public static final String[] FIRST_START = {"chr","M","c"};
	public static final String[] FIRST_MIDDLE = {"isti","icha","era"};
	public static final String[] FIRST_END = {"","s","tian"};
	
	public static final String[] LAST_START = {"ben","ov","wa"};
	public static final String[] LAST_MIDDLE = {"reu","ed","ng"};
	public static final String[] LAST_END = {"ven","en",""};
	private String firstName;
	private String lastName;
	private borough home;
	public persons(String first, String last,borough home ) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
	}
	public String toString() {
		return "My name is " + firstName + " " + lastName + " and i live in " + home;
	}

}

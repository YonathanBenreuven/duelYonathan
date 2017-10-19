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
	private Hobby hobby;
	private persons[] friends;
	private borough home;
	public persons(String first, String last,borough home ) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		this.hobby = Hobby.randomHobby();
		friends = new persons[3];
	}
	//chooses friends from people baser on who is of same classas this insance and who has
	//same hobbies
	public void mingle(persons[] people) {
		System.out.println("i am in this class " + this.getClass());
		for(persons p: people) {
			if(p!= this) {
				//reassign p to the better of 2 friends 
				p = betterFriend(p, friends[0]);
				addFriendToFirstPlace(p);
			}
		}
	}
	private persons betterFriend(persons p, persons q) {
		//having a friends is better than no friend
		if(p==null) {
			return q;
		}
		if(q== null) {
			return p;
		}
		if(p.getClass()== this.getClass()) {
			return p;
		}
		if(q.getClass() == this.getClass()) {
			return q;
		}
		if(p.getClass()== q.getClass()&& p.getClass()== this.getClass()) {
			if(p.hobby==this.hobby) {
				return p;
			}
			if(q.hobby==this.hobby) {
				return q;
			}
		}
		return p;
	}
	public void printFriends() {
		System.out.println("my name is " + firstName + lastName +" these are my friends :");
	for(persons f: friends) {
		if(f != null)
	}
	}
	// moves all persons in friends back one index and puts p at index 0
	public void addFriendToFirstPlace(persons p) {
		for(int i =friends.length-1;i>0;i--) {
			// moves each friend back a position
			friends[i] = friends[i-1];
		}
		friends[0] = p;
	}
	public String toString() {
		return "My name is " + firstName + " " + lastName + " and i live in " + home;
	}

}

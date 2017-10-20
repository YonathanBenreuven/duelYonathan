package arrays;

public class Person {
	
	public static final String[] FIRST_START = {"chr","M","c"};
	public static final String[] FIRST_MIDDLE = {"isti","icha","era"};
	public static final String[] FIRST_END = {"","s","tian"};
	
	public static final String[] LAST_START = {"ben","ov","wa"};
	public static final String[] LAST_MIDDLE = {"reu","ed","ng"};
	public static final String[] LAST_END = {"ven","en",""};
	private String firstName;
	private String lastName;
	private Hobby hobby;
	private Person[] friends;
	private borough home;
	private String nickname;
	public Person(String first, String last,borough home ) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		this.hobby = Hobby.randomHobby();
		friends = new Person[3];
	}
	//chooses friends from people baser on who is of same classas this insance and who has
	//same hobbies
	public void mingle(Person[] people) {
		System.out.println("i am in this class " + this.getClass());
		for(Person p: people) {
			if(p!= this) {
				//reassign p to the better of 2 friends 
				p = betterFriend(p, friends[0]);
				addFriendToFirstPlace(p);
			}
		}
	}
	private Person betterFriend(Person p, Person q) {
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
	for(Person f: friends) {
		if(f != null)
	}
	}
	// moves all Person in friends back one index and puts p at index 0
	public void addFriendToFirstPlace(Person p) {
		for(int i =friends.length-1;i>0;i--) {
			// moves each friend back a position
			friends[i] = friends[i-1];
		}
		friends[0] = p;
	}
	public String toString() {
		return "My name is " + firstName + " " + lastName + " and i live in " + home;
	}
	public static String nickName(String name) {
		String nickname = "";
		String vowels = "aeiou";
		int vowelNum = 0;
		for(int i=0;i<name.length();i++) {
			for(int o=0;o<name.length();o++) {
				if(name.toLowerCase().substring(i,i+1).equals(vowels.substring(o,o+1))){
					if(vowelNum<=1) {
						if(vowelNum==1) {
							vowelNum=i;
						}else {
							vowelNum=1;
						}
					}
				}
			}	
		}
		nickname = name.substring(0,vowelNum);
		return nickname;
	}
	//java is pass by value
	//meaning the parameters of a method are just values not refernces
	//so if you change those value the orginial object is unchanged
	//in this case 'name' will not be changed in fact nothign can change
	//this.firstName via name
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		nickname = nickName(firstName);
	}
}

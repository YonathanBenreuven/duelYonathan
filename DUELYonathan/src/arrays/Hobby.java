package arrays;

public class Hobby {
	public Hobby(String desription) {
		super(description);
	}
	public static Hobby randomHobby() {
		// TODO Auto-generated method stub
		Hobby[] someHobbies = {new Hobby("programing"),
				new Hobby("dancing"),
				new Hobby("playing video games")
		};
		return someHobbies[(int)(Math.random()*someHobbies.length)];
	}

}

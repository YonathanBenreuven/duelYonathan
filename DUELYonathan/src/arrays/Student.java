package arrays;

public class Student extends Person {
	public static final String[] grades = {"freshman","sophomore","junior","senior"};
	private String grade;
	public Student(String first, String last, borough home, int gradelevel) {
		
		super(first, last, home); //super constructor is first becasue a person must exist before a student
		int index = gradelevel-9;
		this.grade = grades[index];
	}
	public String toString() {
		return super.toString() + " I am also a "+grade+".";
	}

}

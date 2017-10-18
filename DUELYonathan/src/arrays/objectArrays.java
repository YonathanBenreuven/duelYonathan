package arrays;

public class objectArrays {
	public objectArrays() {
		Object[] people = new Object[20];
		populate(people);
		people[0] = new Thing("coffee maker");
		for(Object p: people) {
			System.out.println(p);
		}
	}

	private void populate(Object[] people) {
		// TODO Auto-generated method stub
		for(int i=0; i< people.length; i++) {
			String firstName = randomNameFrom(persons.FIRST_START,persons.FIRST_MIDDLE,persons.FIRST_END);
			String lastName = randomNameFrom(persons.LAST_START,persons.LAST_MIDDLE,persons.LAST_END);
			borough b = randomBorough();
			//big idea
			//object arrays allow you to put multiple types of data into an arrays
			//you can have multiple data types (sub-classes of the declared type)
			if(Math.random()< 0.6) {
				int grade = (int)(Math.random()*5)+9;
				people[i] = new Student(firstName,lastName,b,grade);
			}else {	
			people[i]= new persons(firstName, lastName, b);
			}
		}
	}

	private borough randomBorough() {
		// TODO Auto-generated method stub
		return borough.NY_BOUROUGHS[(int)(Math.random()*borough.NY_BOUROUGHS.length)];
	}

	private String randomNameFrom(String[] firstStart, String[] firstMiddle, String[] firstEnd) {
		// TODO Auto-generated method stub
		return get(firstStart)+get(firstMiddle)+get(firstEnd);
	}
	private String get(String[] a) {
		return a[(int)(Math.random()*a.length)];
	}
	
}

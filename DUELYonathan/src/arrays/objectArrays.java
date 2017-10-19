package arrays;

public class objectArrays {
	public objectArrays() {
		Object[] people = new Object[20];
		populate(people);
		people[0] = new Thing("coffee maker");
		for(Object p: people) {
			p.mingle(people);
			p.printFriends();
			System.out.println(" ");
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
	public persons[] selectGroup(persons[] population, int length) {
		persons[] group = new persons[length];
		group[0] = selectAPerson(population);
		for(int i =1; i<length;i++) {
		persons nextPerson = selectAPerson(population);
			while(personInGroup(group, nextPerson)) {
			nextPerson = selectAPerson(population);
			}
		group[i]=nextPerson;
		}
	return group;
	}
	// return the number of differences between the two arr
	// a differnce means they dont have the same element at the same position
	public double countDiffernences(persons[] arr1, persons[] arr2) {
		int counter = 0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i].hobby!=arr2[j].hobby) {
					counter++;
				}
				
			}
		}
		return counter;
	}
	private boolean personInGroup(persons[] group, persons nextPerson) {
		// TODO Auto-generated method stub
		for(int i = 0; i<group.length;i++) {
			if(group[i]== nextPerson) {
				return true;
			}
		}
		return false;
	}

	private persons selectAPerson(persons[] population) {
		// TODO Auto-generated method stub
		int randomNum= (int)(Math.random()*population.length);
		return population[randomNum];
	}
}
